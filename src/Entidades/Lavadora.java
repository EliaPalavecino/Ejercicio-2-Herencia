/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author eliam
 */
public class Lavadora extends Electrodomestico{
    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, comprobarColor color, ConsumoEnergetico consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora(){
    Scanner scn = new Scanner(System.in).useDelimiter("\n");
          Lavadora lv = new Lavadora();
          lv.crearElectrodomesticos();
          System.out.println("ingrese la carga de la lavadora");
          lv.setCarga(scn.nextDouble());
          return lv;
    }
    @Override
     public double precioFinal(){
          return (carga>30)?super.precioFinal()+500:super.precioFinal();
     }
}
