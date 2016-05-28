/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author jorge
 * Interfaz para manejar los distintos tipos de autos que llegan
 */
public abstract class Auto {
    
    public abstract int getCategoria();
    
    public abstract double tiempoAtencion(double RND);
    
    public abstract double getTiempoAtencion();
    
    public abstract int costoPeaje();
    
    public abstract void atender();
    
    public abstract void esperar();
    
    public abstract String getEstado();
    
    public abstract void setEstado(String estado);
    
    public abstract void setTiempoAtencion(double tiempo);
    
    

    @Override
    public String toString(){
        return "\nCategoria=" + getCategoria() + ", estado: "+getEstado();
    }
    
    
    
}
