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
public class Televisor extends Electrodomestico{
   protected Double resolucion;
   protected boolean TDT;

    public Televisor() {
    }

    public Televisor(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Televisor(Double resolucion, Double precio, comprobarColor color, ConsumoEnergetico consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
       public Televisor crearTelevisor(){
          Scanner sn=new Scanner(System.in).useDelimiter("\n");
          Televisor t1 = new Televisor();
          t1.crearElectrodomesticos();
          System.out.println("Ingrese la resolución del televisor en pulgadas");
          t1.resolucion = sn.nextDouble();
          System.out.println("Posee sintonizador TDT?");
          if (sn.next().equalsIgnoreCase("SI")) {
               t1.TDT=true;
          }else{
               t1.TDT = false;
          }
          return t1;
     }
     
     @Override
     public double precioFinal(){
          double salida = super.precioFinal();
          if (this.resolucion>40) {
               salida *= 1.3;
          }
          if (TDT) {
               salida += 500;
          }
          return salida;
     } 
   
}
