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

    public static void main(String[] args) {
        //crear lista con 20 robots aleatorios
        ArrayList<Robots> lista = new ArrayList<Robots>();

        for (int i = 0; i < 20; i++) {
            lista.add(new Robots());

        }
        lista.forEach(System.out::println);

        System.out.println("-----------------------------------------");
        //ordenar e imprimir de mayor a menor vida

        Collections.sort(lista, (v1, v2) -> v2.getVida().compareTo(v1.getVida()));
        lista.forEach(System.out::println);
        System.out.println("-----------------------------------------");
        //ordenar e imprimir menor a mayor vida

        Collections.sort(lista, (v1, v2) -> v1.getVida().compareTo(v2.getVida()));
        lista.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        //imprimir mayores de 50%
        ArrayList<Robots> lista2 = new ArrayList<>();
        for (Robots a : lista) {
            if (a.getVida() > 50) {
                lista2.add(a);
            }

        }
        //imprimir lista2
        lista2.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        //ordenar por numero de serie
        Collections.sort(lista, (v1, v2) -> v1.getNumeroSerie().compareTo(v2.getNumeroSerie()));
        
        //busqueda binaria 
    }
}
