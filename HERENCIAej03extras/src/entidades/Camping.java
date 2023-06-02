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
public class Camping extends AlojamientosExtrahoteleros {
    protected int capacidadMaximaCarpas, cantidadBañosDispo;
    protected boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int cantidadBañosDispo, boolean restaurante) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBañosDispo = cantidadBañosDispo;
        this.restaurante = restaurante;
    }

    public Camping(int capacidadMaximaCarpas, int cantidadBañosDispo, boolean restaurante, boolean privado, double m2) {
        super(privado, m2);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBañosDispo = cantidadBañosDispo;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBañosDispo() {
        return cantidadBañosDispo;
    }

    public void setCantidadBañosDispo(int cantidadBañosDispo) {
        this.cantidadBañosDispo = cantidadBañosDispo;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadMaximaCarpas=" + capacidadMaximaCarpas + ", cantidadBa\u00f1osDispo=" + cantidadBañosDispo + ", restaurante=" + restaurante + '}';
    }
    
   public void infoCamping() {
       super.infoAlojamiento();
       Scanner leer = new Scanner(System.in);
       String respuesta = "";
       System.out.println("Ingrese la capacidad máxima de carpas");
       setCapacidadMaximaCarpas(leer.nextInt());
       System.out.println("Ingrese la cantidad de baños disponibles");
       setCantidadBañosDispo(leer.nextInt());
       do {
           System.out.println("Indicar si hay restaurantes (s/n)");
           respuesta = leer.next();
       } while (respuesta.equalsIgnoreCase("s") && respuesta.equalsIgnoreCase("n"));
       if (respuesta.equalsIgnoreCase("s")) {
           setRestaurante(true);
           
       } else {
           setRestaurante(false);
       }
   } 
    
}
