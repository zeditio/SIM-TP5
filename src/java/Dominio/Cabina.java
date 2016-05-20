/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Interfaces.Auto;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class Cabina {
    
    
    private String estado;
    private ArrayList<Auto> colaAutos;

    public Cabina() {
        this.colaAutos = new ArrayList<>();
        this.estado = "LIBRE";
    }

    
    
    public boolean estaDisponible(){
        return colaAutos.size()<4;
    }
    
    public boolean estaLleno(){
        return colaAutos.size()==4;
    }
    
    public boolean estaVacio(){
        return colaAutos.isEmpty();
    }

    public String getEstado() {
        return estado;
    }

    public void añadirAuto(Auto auto) {
        colaAutos.add(auto);
        if (this.colaAutos.size()==4){
            this.estado="LLENO";
        }
    }
    
    
    
    
    
}
