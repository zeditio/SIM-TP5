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
public class AutoCat2 extends Auto{

    @Override
    public int getCategoria() {
        return 2;
    }

    @Override
    public double tiempoAtencion(double RND) {
    return RND*10+45;
    }

    @Override
    public int costoPeaje() {
       return 3;
    }
    
}
