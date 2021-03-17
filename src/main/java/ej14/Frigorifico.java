/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author alber
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion,Comparable<Frigorifico>{
    private int volumen;

    public Frigorifico(int volumen, double consumo, String modelo) {
        super(consumo, modelo);
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "volumen=" + volumen + '}';
    }

    @Override
    public void muestra() {
        System.out.println("La capacidad es de  " + this.volumen + "l");
    }

   @Override
    public int compareTo(Frigorifico a) {
    return (int) (this.volumen-a.getVolumen());
   }


    
    
}
