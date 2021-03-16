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
public class Direccion {
    private String nombreDeLaCalle;
    private String nombreDeLaCiudad;
    private String codigoPostal;
    private String nombreDelPais;

    public Direccion(String nombreDeLaCalle, String nombreDeLaCiudad, String codigoPostal, String nombreDelPais) {
        this.nombreDeLaCalle = nombreDeLaCalle;
        this.nombreDeLaCiudad = nombreDeLaCiudad;
        this.codigoPostal = codigoPostal;
        this.nombreDelPais = nombreDelPais;
    }

    public String getNombreDeLaCalle() {
        return nombreDeLaCalle;
    }

    public void setNombreDeLaCalle(String nombreDeLaCalle) {
        this.nombreDeLaCalle = nombreDeLaCalle;
    }

    public String getNombreDeLaCiudad() {
        return nombreDeLaCiudad;
    }

    public void setNombreDeLaCiudad(String nombreDeLaCiudad) {
        this.nombreDeLaCiudad = nombreDeLaCiudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombreDelPais() {
        return nombreDelPais;
    }

    public void setNombreDelPais(String nombreDelPais) {
        this.nombreDelPais = nombreDelPais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nombreDeLaCalle=" + nombreDeLaCalle + ", nombreDeLaCiudad=" + nombreDeLaCiudad + ", codigoPostal=" + codigoPostal + ", nombreDelPais=" + nombreDelPais + '}';
    }
    
    
}
