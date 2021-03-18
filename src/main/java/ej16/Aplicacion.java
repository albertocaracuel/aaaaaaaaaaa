/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author alber
 */
public class Aplicacion {

    //crear lista con 20 robots aleatorios
    private ArrayList<Robots> lista = new ArrayList<Robots>();
    private ArrayList<Robots> lista2 = new ArrayList<Robots>();

    public Aplicacion() {
    }

    
    public void crearLista() {
        for (int i = 0; i < 20; i++) {
            this.lista.add(new Robots());

        }
    }

    //ordenar e imprimir de mayor a menor vida
    public void mayorMenorVida() {
        Collections.sort(lista, (v1, v2) -> v2.getVida().compareTo(v1.getVida()));
        lista.forEach(System.out::println);
        System.out.println("-----------------------------------------");
    }
    //ordenar e imprimir menor a mayor vida

    public void menorMayorVida() {
        Collections.sort(lista, (v1, v2) -> v1.getVida().compareTo(v2.getVida()));
        lista.forEach(System.out::println);
    }

    //imprimir mayores de 50%
    public void mayores50deVida() {
        for (Robots a : lista) {
            if (a.getVida() > 50) {
                this.lista2.add(a);
            }

        }

    }
    //imprimir lista2

    public void imprimirLista2() {
        this.lista2.forEach(System.out::println);
    }

    //ordenar por numero de serie
    public void ordenarPorSerie() {
        Comparator<Robots> criterioserie = (v1, v2) -> v1.getNumeroSerie().compareTo(v2.getNumeroSerie());
        Comparator<Robots> criteriovida = (v1, v2) -> v1.getVida().compareTo(v2.getVida());

        Collections.sort(this.lista2, criterioserie.reversed().thenComparing(criteriovida));
    }

    //busqueda binaria 
}
