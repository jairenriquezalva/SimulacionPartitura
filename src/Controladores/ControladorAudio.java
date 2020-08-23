
package Controladores;

import Entidades.Compas;
import Entidades.Figura;
import Entidades.Nota;
import Entidades.Partitura;
import Entidades.UnotaFigura;
import Entidades.ValorNota;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;


public class ControladorAudio {
    
    private final int muestrasPorSegundo = 8000;
    private Partitura p;
    private int volumen;
    
    public ControladorAudio(Partitura p){
        this.p = p;
        volumen = 20;
    }
    
    public void play() throws LineUnavailableException {
       Compas[] compases = p.getCompases();
        ArrayList<UnotaFigura> unotaFiguras = new ArrayList<>();  
        for (int i = 0; i <compases.length; i++) {
            int numero = compases[i].obtenerNumeroUnotaFigura();
            for(int j = 0 ; j< numero; j++){
                unotaFiguras.add(compases[i].obtenerNotaFigura(j));
            }
        }
        Object[][] datosPartitura;
        datosPartitura = new Object[unotaFiguras.size()][3];
        for (int i = 0 ; i < unotaFiguras.size(); i++) {
            datosPartitura[i][0] = unotaFiguras.get(i).obtenerNota().getFrecuencia();
            datosPartitura[i][1] = 0.60*unotaFiguras.get(i).obtenerFigura().getTiempo();            
            datosPartitura[i][2] = volumen;
        }       

        byte[][] señal =new byte[datosPartitura.length][];
        for(int i=0;i<datosPartitura.length;i++){
            señal[i] = obtenerSeñal((int) datosPartitura[i][0],(double) datosPartitura[i][1],(int) datosPartitura[i][2]);
           
        }
        
        AudioFormat formatoSalida = new AudioFormat(8000, 8, 1, true, true);
        SourceDataLine sdl= AudioSystem.getSourceDataLine(formatoSalida);
        Thread ejecutarSonido = new Thread(){
            @Override
            public void run(){
                try {
                    sdl.open();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(ControladorAudio.class.getName()).log(Level.SEVERE, null, ex);
                }
                for(int i =0;i<señal.length;i++){ 
                    sdl.start();
                    sdl.write(señal[i], 0, señal[i].length);          
                    sdl.drain();
                }
        
            }
        };
        ejecutarSonido.start();
        System.out.println("estoy dentro del metodo ");
        
    }

    public void reproducirNota(String cadenaNota, String cadenaTiempo) throws LineUnavailableException {
        Figura figuraActual = Figura.valueOf(cadenaTiempo);
        char[] arrayCaracteresNota = cadenaNota.toCharArray();
        String cadenaValorNota;
        if(arrayCaracteresNota.length>2){
            cadenaValorNota = Character.toString(arrayCaracteresNota[0])+Character.toString(arrayCaracteresNota[2]);
        }else{
            cadenaValorNota = Character.toString(arrayCaracteresNota[0]);
        }
        ValorNota valorNotaActual = ValorNota.valueOf(cadenaValorNota);
        int octavaNota = Character.getNumericValue(arrayCaracteresNota[1]);
        Nota notaActual = new Nota(valorNotaActual, octavaNota);
        //reproducir
        byte[] señal = obtenerSeñal(notaActual.getFrecuencia(), 0.60*figuraActual.getTiempo() , volumen);
        AudioFormat formatoSalida = new AudioFormat(8000, 8, 1, true, true);
        SourceDataLine sdl= AudioSystem.getSourceDataLine(formatoSalida);    
        Thread ejecutarSonido = new Thread(){
            @Override
            public void run(){
                try {
                    sdl.open();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(ControladorAudio.class.getName()).log(Level.SEVERE, null, ex);
                }
                sdl.start();
                sdl.write(señal, 0, señal.length);          
                sdl.drain();
            }
        };
        ejecutarSonido.start();
        
    }
    
      public byte[] obtenerSeñal(int nota, double tiempo,int Volumen){
        
        byte[] bytes;
        bytes = new byte[(int)(tiempo*muestrasPorSegundo)];
        
        byte[] bytesCicloDeOnda = getBytesCicloDeOnda(nota, Volumen);
        
        int numeroCopias = bytes.length/bytesCicloDeOnda.length;
        
        //  copiar los bytes del ciclo de la onda base(bytesCicloDeOnda) hacia nuestra señal(bytes) 
        //  con la duracion correspondiente
        for(int i = 0; i<numeroCopias; i++){
            for(int j =0; j<bytesCicloDeOnda.length;j++){
                bytes[i*bytesCicloDeOnda.length+j] = bytesCicloDeOnda[j];
            }
        }
        
        return bytes;
    }
    
    public byte[] getBytesCicloDeOnda(int frecuencia,int amplitud){
        int muestrasPorCiclo = muestrasPorSegundo/frecuencia;
        byte[] bytesCicloOnda= new byte[muestrasPorCiclo];
        for(int i=0;i<muestrasPorCiclo;i++){
            // ecuacion para onda sinusoide
            // y(t) = Asen(2pi*frecuencia*instanteDeTiempo)
            double y;
            y = amplitud*Math.sin(Math.toRadians(360)*frecuencia*1/muestrasPorSegundo*i);
            int yEntero = (int)y; 
            bytesCicloOnda[i]=(byte)(yEntero+128);
        }
        return bytesCicloOnda;
    }

    
}
