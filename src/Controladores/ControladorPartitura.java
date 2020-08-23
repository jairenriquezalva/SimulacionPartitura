/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Compas;
import Entidades.Figura;
import Entidades.Nota;
import Entidades.Partitura;
import Entidades.UnotaFigura;
import Entidades.ValorNota;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author LAB-USR-AQ265-A0108
 */
public class ControladorPartitura {
    
    private final int numeroCompases = 12;
    private final int tiempos = 4;
    int indiceCompas;
    int indiceTiempo;
    
    private Partitura partitura;
    
    public Partitura obtenerPartitura(){
        return partitura;
    }
    
    public ControladorPartitura(){
        partitura = new Partitura(numeroCompases,tiempos);
        indiceCompas=0;
        indiceCompas=0;
    }
    
    public void retroceder(){
        Compas actualCompas = partitura.obtenerCompas(indiceCompas);
        int numeroUnotaFigura = actualCompas.obtenerNumeroUnotaFigura();
        
    }
    
    public void agregarNota(String cadenaNota, String cadenaTiempo){
             
        //obtener nota y la figura de el boton correspondiente
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
        UnotaFigura unf = new UnotaFigura(notaActual, figuraActual);
        //agregar a compas
        Compas compasActual  = partitura.obtenerCompas(indiceCompas);
        
         if (figuraActual.getTiempo() <= compasActual.obtenerTiempoDisponible()){
            compasActual.agregarUnotaFigura(unf);
            indiceTiempo += figuraActual.getTiempo();
            if(compasActual.obtenerTiempoDisponible()==0){
                if(indiceCompas+1 == numeroCompases){
                    JOptionPane.showMessageDialog(null, "ya no se puede escribir la partitura esta llena", "Alerta: ", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    indiceCompas++;  
                    indiceTiempo=0;
                    
                }                
            }
         }else{
             JOptionPane.showMessageDialog(null, "ya no se puede escribir esa figura musical en este compas", "Alerta: ", JOptionPane.INFORMATION_MESSAGE);
         }   
    }

    public int obtenerIndiceCompas() {
        return indiceCompas;
    }
    public int obtenerIndiceTiempo(){
        return indiceTiempo;
    }
    
    
    
}
