/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej013;

import java.util.ArrayList;

/**
 *
 * @author alberto
 */
public class pruebas {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(new Profesor("adeef","", "", "", new Direccion("", "", "", "")));
        lista.add(new Estudiante("fdf", "", "", "", new Direccion("", "", "", "")));
        lista.add(new Profesor("afwr","", "", "", new Direccion("", "", "", "")));
        lista.add(new Estudiante("fds", "", "", "", new Direccion("", "", "", "")));
        lista.add(new Profesor("asd","", "", "", new Direccion("", "", "", "")));
        lista.add(new Estudiante("sdf", "", "", "", new Direccion("", "", "", "")));

        for (Persona a : lista) {

            if (a instanceof Estudiante) {
                ((Estudiante) a).identificate();
                System.out.println(((Estudiante) a).getId());

            }

            if (a instanceof Profesor) {
                ((Profesor) a).identificate();
                System.out.println(((Profesor) a).getEspecialidad());

            }

        }
    }
    
    
    //no se pueden crear objetos de la clase pero¡sona porque es abstracta
}
