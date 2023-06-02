/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.AlojamientosExtrahoteleros;
import entidades.Camping;
import entidades.Hotel4estrellas;
import entidades.Hotel5estrellas;
import entidades.Hoteles;
import entidades.Residencias;
import java.util.ArrayList;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class HERENCIAej03extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Hoteles> h1 = new ArrayList();
        
        System.out.println("CARGUE LA INFORMACION DEL HOTEL 4 ESTRELLAS:");
        Hotel4estrellas h4 = new Hotel4estrellas();
        h4.informacionHotel();
        h4.calcularPrecioHab();
        h1.add(h4);
        System.out.println("CARGUE LA INFORMACION DEL HOTEL 5 ESTRELLAS:");
        Hotel5estrellas h5 = new Hotel5estrellas();
        h5.informacionHotel5();
        h1.add(h5);
        
        ArrayList<AlojamientosExtrahoteleros> a1 = new ArrayList();
        System.out.println("CARGUE LA INFORMACION DEL CAMPING:");
        Camping c1 = new Camping();
        c1.infoCamping();
        a1.add(c1);
         System.out.println("CARGUE LA INFORMACION DE LA RESIDENCIA");
        Residencias r1 = new Residencias();
        r1.infoResidencias();
        a1.add(r1);
        
        for (Hoteles aux : h1) {
            if (h4.getPrecioHabitaciones() > h5.getPrecioHabitaciones()) {
                h4.mostrarinfoHotel4();
                h5.mostrarinfoHotel5();
                break;
            } else {
                h5.mostrarinfoHotel5();
                h4.mostrarinfoHotel4();
                break;
            }
           
        }
        
        for (AlojamientosExtrahoteleros aux1: a1) {
            if(c1.isRestaurante() == true) {
                System.out.println("El camping tiene restaurante.");
                break;
            } else {
                System.out.println("El camping no tiene restaurante.");
                break;
            }
        }
        
        for (AlojamientosExtrahoteleros aux2: a1) {
            if(r1.isDescuentoGremios() == true) {
                System.out.println("La residencia tiene descuento");
                break;
            } else {
                System.out.println("La residencia no tiene descuento");
                break;
            }
        }
        
        System.out.println("INFORMACIÓN DE LOS ALOJAMIENTOS:");
       
            System.out.println("Informacion del camping:");
            System.out.println(c1.toString());
            System.out.println("Informacion de la residencia");
            System.out.println(r1.toString());
        
    }
    
}
