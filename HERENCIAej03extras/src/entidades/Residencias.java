/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class Residencias extends AlojamientosExtrahoteleros {
    protected int cantHabitaciones;
    protected boolean descuentoGremios, campoDeportivo;

    public Residencias() {
    }

    public Residencias(int cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo) {
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencias(int cantHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, double m2) {
        super(privado, m2);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantHabitaciones=" + cantHabitaciones + ", descuentoGremios=" + descuentoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
    public void infoResidencias() {
        super.infoAlojamiento();
        Scanner leer = new Scanner(System.in);
        String respuesta = "", respuesta2 = "";
        System.out.println("Ingrese la cantidad de habitaciones");
        setCantHabitaciones(leer.nextInt());
        do {
           System.out.println("Indicar si hay descuentos para gremios (s/n)");
           respuesta = leer.next();
       } while (respuesta.equalsIgnoreCase("s") && respuesta.equalsIgnoreCase("n"));
       if (respuesta.equalsIgnoreCase("s")) {
           setDescuentoGremios(true);
           
       } else {
           setDescuentoGremios(false);
       }
        do {
           System.out.println("Indicar si un campo deportivo (s/n)");
           respuesta2 = leer.next();
       } while (respuesta2.equalsIgnoreCase("s") && respuesta2.equalsIgnoreCase("n"));
       if (respuesta2.equalsIgnoreCase("s")) {
           setCampoDeportivo(true);
           
       } else {
           setCampoDeportivo(false);
       }
    }
}
