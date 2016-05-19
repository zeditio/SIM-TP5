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
public class AutoCat5 extends Auto{

    @Override
    public int getCategoria() {
        return 5;
    }

    @Override
    public double tiempoAtencion(double RND) {
    return RND*60+150;
    }

    @Override
    public int costoPeaje() {
       return 0;
    }
    
}
