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
public class Robots {

    private Formatter numeroSerie;
    private int vida;

    public Robots() {
        this.numeroSerie = crearSerie();
        this.vida = crearVida();
    }

    public Formatter getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Formatter numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    private int crearVida() {
        Random random = new Random();
        int enteroAleatorio = random.nextInt(100 - 1 + 1) + 1;
        return enteroAleatorio;
    }

    private Formatter crearSerie() {
        Random random = new Random();
        Formatter fmt = new Formatter();
        int enteroAleatorio = random.nextInt(9999 - 100 + 1) + 100;
        fmt.format("%08d", enteroAleatorio);
        return fmt;
    }
}
