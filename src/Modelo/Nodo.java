/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Max
 */
public class Nodo {
    private boolean visitado;
    private String nombre;
    
    
    public Nodo(String nom){
        nombre = nom;
        visitado=false;
    }
    
    public boolean esVisitado(){
       return visitado;
    }
    public void setVisiatdo(boolean b){
       visitado = b;
    }
    public String nombre(){
    return nombre;
    }
    public void setNombre(String n){
     nombre = n;
    }
}
