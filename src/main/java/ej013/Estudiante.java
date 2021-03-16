/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej013;

/**
 *
 * @author alberto
 */
public class Estudiante extends Persona{
    private String id;

    public Estudiante(String id, String nombre, String apellidos, String NIF, Direccion direccion) {
        super(nombre, apellidos, NIF, direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + '}';
    }

    
    public void identificate() {
        System.out.println("Soy estudiante");
    }
    
    
    
}
