/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author LAB-USR-AQ265-A0108
 */
public class Compas {
    
    private int numeroTiempos;
    private ArrayList<UnotaFigura> uNotaFigura;
    
    public Compas(int numeroTiempos){
        this.numeroTiempos = numeroTiempos;
        uNotaFigura = new ArrayList();
    }

    public int obtenerTiempoDisponible() {
        int tiempoUtilizado = 0;
        for(UnotaFigura n : uNotaFigura){
            tiempoUtilizado = tiempoUtilizado + n.obtenerFigura().getTiempo();
        }
        return numeroTiempos-tiempoUtilizado;
    }
    
    public void agregarUnotaFigura(UnotaFigura nf){
        uNotaFigura.add(nf);
    }

    public int obtenerNumeroUnotaFigura() {
        return uNotaFigura.size();
    }
    public UnotaFigura obtenerNotaFigura(int index){
        return uNotaFigura.get(index);
    }
}
