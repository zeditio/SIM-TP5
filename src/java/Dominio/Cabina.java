/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Interfaces.Auto;

/**
 *
 * @author jorge
 */
public class Cabina {
    
    private int cola;
    private String estado;
    
    
    
    
    public double tiempoAtencion(Auto auto, double RND){
        return auto.tiempoAtencion(RND);
    }
    
}
