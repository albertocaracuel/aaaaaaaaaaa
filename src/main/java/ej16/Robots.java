/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.Formatter;
import java.util.Random;

/**
 *
 * @author alber
 */
public class Robots implements Comparable<Robots>{

    private Integer numeroSerie;
    private Integer vida;

    public Robots() {
        this.numeroSerie = crearSerie();
        this.vida = crearVida();
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = crearSerie();
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = crearVida();
    }

    @Override
    public String toString() {
        return "Robots{" + "numeroSerie=" + numeroSerie + ", vida=" + vida + '}';
    }
    
    

    private Integer crearVida() {
        Random random = new Random();
        
        int enteroAleatorio = random.nextInt(100 - 1 + 1) + 1;
        Integer iInteger = Integer.valueOf(enteroAleatorio);
        return iInteger;
    }

    private Integer crearSerie() {
        Random random = new Random();
       
        int enteroAleatorio = random.nextInt(9999 - 100 + 1) + 100;
        Integer iInteger = Integer.valueOf(enteroAleatorio);
        return iInteger;
    }

    @Override
    public int compareTo(Robots t) {
         return this.getVida().compareTo(t.getVida());
    }
}
