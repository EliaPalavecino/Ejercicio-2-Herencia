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
public class Electrodomestico {
  protected Double precio;
  protected comprobarColor color;
  protected ConsumoEnergetico consumoEnergetico;
  protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, comprobarColor color, ConsumoEnergetico consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public comprobarColor getColor() {
        return color;
    }

    public void setColor(comprobarColor color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public enum ConsumoEnergetico {A,B,C,D,E,F}
    public enum comprobarColor{BLANCO,NEGRO,AZUL,GRIS,ROJO} 
    
         public ConsumoEnergetico comprobarConsumoEnergetico(String letra) {
          for (ConsumoEnergetico value :ConsumoEnergetico.values()) {
               if (value.name().equalsIgnoreCase(letra)) {
                    return value;
               }
          }
          return ConsumoEnergetico.F;
     }

     public comprobarColor comprobarColor(String color) {
          for (comprobarColor value : comprobarColor.values()) {
               if (value.name().equalsIgnoreCase(color)) {
                    return value;
               }
          }
          return comprobarColor.BLANCO;
     }
    
    public double precioFinal() {

        double precioFinal = 1000;

        switch (this.consumoEnergetico ) {
            case A:
                precioFinal =+ 1000;
                break;
            case B:
                precioFinal =+ 800;
                break;
            case C:
                precioFinal =+ 600;
                break;
            case D:
                precioFinal =+ 500;
                break;
            case E:
                precioFinal =+ 300;
                break;
            case F:
                precioFinal =+ 100;
                break;
        }

        if (this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso <= 79) {
            precioFinal += 800;
        } else {
            precioFinal += 1000;
        }
        return precioFinal;
    }
    public void crearElectrodomesticos(){
          Scanner scn = new Scanner(System.in).useDelimiter("\n");
          System.out.println("¿cuánto pesa el artículo?");
          this.peso = scn.nextDouble();
          System.out.println("ingrese el color del artículo");
          this.color = comprobarColor(scn.next());
          System.out.println("ingrese la eficiencia energética");
          this.consumoEnergetico = comprobarConsumoEnergetico(scn.next().toUpperCase());
    }
}
