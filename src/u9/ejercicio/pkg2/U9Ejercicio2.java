/*

 */
package u9.ejercicio.pkg2;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author eliam
 */
public class U9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Lavadora lv1 = new Lavadora();
          System.out.println("Cargar datos de la Lavadora");
          lv1 = lv1.crearLavadora();
          System.out.println("El Precio Final de la Lavadora es: "+lv1.precioFinal());
          Televisor tv1 = new Televisor();
          System.out.println("Cargar datos del Televisor");
          tv1 = tv1.crearTelevisor();
          System.out.println("El Precio Final del televisor es: "+tv1.precioFinal());
    }
    
}
