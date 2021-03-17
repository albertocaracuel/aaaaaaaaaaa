/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

/**
 *
 * @author alber
 */
public class Microondas extends Electrodomestico implements MuestraInformacion,Comparable<Microondas> {
    private double Vatios;

    public Microondas(double Vatios, double consumo, String modelo) {
        super(consumo, modelo);
        this.Vatios = Vatios;
    }

    public double getVatios() {
        return Vatios;
    }

    public void setVatios(double Vatios) {
        this.Vatios = Vatios;
    }

    @Override
    public String toString() {
        return "Microondas{" + "Vatios=" + Vatios + '}';
    }

    @Override
    public void muestra() {
        System.out.println("Los vatios maximos son: " + this.Vatios + "w");
    }

    @Override
    public int compareTo(Microondas a) {
        return (int) (this.Vatios-a.getVatios());
    }
    
    
}
