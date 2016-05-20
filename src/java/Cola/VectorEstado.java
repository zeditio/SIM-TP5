/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import Dominio.*;
import Dominio.Cabina;
import Interfaces.Auto;
import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class VectorEstado {
    
    //todas las variables del vector...
    private static double tiempoActual, tiempoProximaLlegada, tiempoFinCobro;
    private double tiempoEntreLlegada, tiempoDemoraCobro;
    private double rndLlegadaAuto, rndCatAuto, rndDemora;
    private Auto auto;
    private ArrayList<Cabina> listadoCabinas;
    private static float montoTotal;
    private ArrayList<Integer> tiempoCabina;
    private static int maxCabinasHab;
    //variable para saber que evento dispara la siguiente linea
    //1: nuevaLlegada; 2: finCobro
    private static int evento;

    public VectorEstado() {

    }

    public void inicializar() {
        VectorEstado.tiempoActual = 0d;
        this.listadoCabinas = new ArrayList<>();
        listadoCabinas.add(new Cabina());
        VectorEstado.montoTotal = 0;
        this.tiempoCabina = new ArrayList<>();
        VectorEstado.maxCabinasHab = 0;
        nuevaLlegadaAuto();
        
        VectorEstado.evento=1;
    }

    public void nuevaLinea() {
       
               
       

    }
    
    private void nuevaLlegadaAuto(){
        rndLlegadaAuto = Math.random();
        tiempoEntreLlegada = -2 * Math.log(1 - rndLlegadaAuto);
        tiempoProximaLlegada = tiempoActual + tiempoEntreLlegada;
        generarCatAuto();
        asignarACabina();
    }

    private void generarCatAuto() {
        rndCatAuto = Math.random();
        if (rndCatAuto < 0.1d) {
            auto = new AutoCat1();
        } else {
            if (rndCatAuto < 0.6d) {
                auto = new AutoCat2();
            } else {
                if (rndCatAuto < 0.75d) {
                    auto = new AutoCat3();
                } else {
                    if (rndCatAuto < 0.9d) {
                        auto = new AutoCat4();
                    } else {
                        auto = new AutoCat5();
                    }

                }

            }

        }
    }

    private void asignarACabina() {
        for (int i = 0; i < listadoCabinas.size(); i++) {
            if (listadoCabinas.get(i).estaDisponible()) {
                listadoCabinas.get(i).añadirAuto(auto);
                break;
            }
            if (listadoCabinas.get(listadoCabinas.size() - 1).estaLleno()) {
                Cabina cabina = new Cabina();
                cabina.añadirAuto(auto);
                listadoCabinas.add(cabina);
            }
        }
    }
    
    private void finCobro(){
        rndDemora= Math.random();
        tiempoDemoraCobro=auto.tiempoAtencion(rndDemora);
        tiempoFinCobro=tiempoActual+tiempoDemoraCobro;
        montoTotal+=auto.costoPeaje();
        
    }

}
