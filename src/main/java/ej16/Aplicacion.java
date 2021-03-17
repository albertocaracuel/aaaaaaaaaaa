/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;

import java.util.ArrayList;

/**
 *
 * @author alber
 */
public class Aplicacion {
    public static void main(String[] args) {
        //crear lista con 20 robots aleatorios
        ArrayList<Robots> lista=new ArrayList<>();
        
        for (int i=0; i<20;i++){
            lista.add(new Robots());
            
       
        }
    }
}
