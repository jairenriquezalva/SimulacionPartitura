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
public class Nota {
    private ValorNota valor;
    private int octava;
    
    public Nota(ValorNota vn,int octava){
        valor = vn;
        this.octava = octava;
    }
       
    public int getFrecuencia(){
        valor.ordinal();
        //f(n,x) = 440*e^(((x-4)+(n-10)/12)*ln2)
        double frecuencia;
        double x =(valor.ordinal()+1)-10;
        double y = 12;
        double div = x/y;
        frecuencia = 440*Math.pow(Math.E,((octava-4)+ div)* Math.log(2));
        int frec = (int)frecuencia;
        return frec;
    }
}
