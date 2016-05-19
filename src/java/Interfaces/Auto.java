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
    
    public double generarNuevaLlegadaAuto(){
        double x=-2*Math.log(1-Math.random());
        return x;
    }
    
    public abstract double tiempoAtencion(double RND);
    
    public abstract int costoPeaje();
    
    
}
