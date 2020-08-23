/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author LAB-USR-AQ265-A0108
 */
public class Partitura {
    
    private Compas[] compases;
    private int tiempos;
    
    public Partitura(int numeroCompases, int tiempos){
        compases = new Compas[numeroCompases];
        for(int i = 0; i<numeroCompases; i++){
            compases[i] = new Compas(tiempos);
        }
    }
    
    public Compas obtenerCompas(int indice) {
        return compases[indice];
    }
    
    public Compas[] getCompases(){
        return compases;
    }

    public void establecerCompas(int indice, Compas compas) {
        this.compases[indice] = compas;
    }    
    
}
