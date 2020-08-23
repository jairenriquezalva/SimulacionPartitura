/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author jair
 */
public class UnotaFigura {

    Nota nota;
    Figura figura;
    
    public UnotaFigura(Nota nota, Figura figura){
        this.nota = nota;
        this.figura = figura;
    }
    
    public Figura obtenerFigura() {
        return figura;
    }
    
    public Nota obtenerNota(){
        return nota;
    }
}
