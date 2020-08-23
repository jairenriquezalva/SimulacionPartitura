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
public enum Figura {
    
    Negra(1),
    Blanca(2),
    Redonda(4);
    
    private int tiempo;

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempos) {
        this.tiempo = tiempos;
    }    
    
    private Figura(int tiempos){
        this.tiempo = tiempos;
    }
    
}
