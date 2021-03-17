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
public class CampanaExtractora  extends Electrodomestico implements MuestraInformacion{
    private double ruido;

    public CampanaExtractora(double ruido, double consumo, String modelo) {
        super(consumo, modelo);
        this.ruido = ruido;
    }

    public double getRuido() {
        return ruido;
    }

    public void setRuido(double ruido) {
        this.ruido = ruido;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "ruido=" + ruido + '}';
    }

    @Override
    public void muestra() {
        System.out.println("Su ruido es de " + this.ruido + "dB");
    }
    
    
    
}
