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
public class Hotel4estrellas extends Hoteles {
    protected char gimnasio;
    protected String nombreResto;
    protected int capacidadResto;
    protected double valorAgregadoRestaurante, valorAgregadoGimnasio;

    public Hotel4estrellas() {
    }

    public Hotel4estrellas(char gimnasio, String nombreResto, int capacidadResto, double valorAgregadoRestaurante, double valorAgregadoGimnasio) {
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
        this.valorAgregadoRestaurante = valorAgregadoRestaurante;
        this.valorAgregadoGimnasio = valorAgregadoGimnasio;
    }

    public Hotel4estrellas(char gimnasio, String nombreResto, int capacidadResto, double valorAgregadoRestaurante, double valorAgregadoGimnasio, int capacidad, int cantHabitaciones, int cantCamas, int cantPisos, int precioHabitaciones) {
        super(capacidad, cantHabitaciones, cantCamas, cantPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
        this.valorAgregadoRestaurante = valorAgregadoRestaurante;
        this.valorAgregadoGimnasio = valorAgregadoGimnasio;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }

    public double getValorAgregadoRestaurante() {
        return valorAgregadoRestaurante;
    }

    public void setValorAgregadoRestaurante(double valorAgregadoRestaurante) {
        this.valorAgregadoRestaurante = valorAgregadoRestaurante;
    }

    public double getValorAgregadoGimnasio() {
        return valorAgregadoGimnasio;
    }

    public void setValorAgregadoGimnasio(double valorAgregadoGimnasio) {
        this.valorAgregadoGimnasio = valorAgregadoGimnasio;
    }

    @Override
    public String toString() {
        return "Hotel4estrellas{" + "gimnasio=" + gimnasio + ", nombreResto=" + nombreResto + ", capacidadResto=" + capacidadResto + ", valorAgregadoRestaurante=" + valorAgregadoRestaurante + ", valorAgregadoGimnasio=" + valorAgregadoGimnasio + '}';
    }

   
    
    public void informacionHotel() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de gimnasio según su clasificación (A o B)");
        setGimnasio(leer.next().toUpperCase().charAt(0));
        switch (getGimnasio()) {
            case 'A':
                setValorAgregadoGimnasio(getValorAgregadoGimnasio()+50);
                break;
            case 'B':
                setValorAgregadoGimnasio(getValorAgregadoGimnasio()+30);
                break;
        }
        System.out.println("Ingrese la capacidad del restaurante");
        setCapacidadResto(leer.nextInt());
        System.out.println("Ingrese la capacidad del hotel");
        setCapacidad(leer.nextInt());
//        System.out.println("Ingrese la capacidad del restaurante");
//        setCapacidadResto(leer.nextInt());
        if (getCapacidadResto() > 0 && getCapacidadResto() < 30) {
        valorAgregadoRestaurante = valorAgregadoRestaurante + 10;
        } else if (getCapacidadResto() >= 30 && getCapacidadResto() <= 50 ) {
            valorAgregadoRestaurante = valorAgregadoRestaurante + 30;
        } else {
            valorAgregadoRestaurante = valorAgregadoRestaurante + 50;
        }
        
//        setPrecioHabitaciones((int) (50 + getCapacidad() + getValorAgregadoRestaurante() + getValorAgregadoGimnasio()));
//        System.out.println("El precio final de la habitación para este hotel 4 es de " +getPrecioHabitaciones());
    }
     
    public void calcularPrecioHab() {
        setPrecioHabitaciones((int) (50 + getCapacidad() + getValorAgregadoRestaurante() + getValorAgregadoGimnasio()));
        System.out.println("El precio final de la habitación para este hotel 4 es de " +getPrecioHabitaciones());
    }
      public void mostrarinfoHotel4() {
          System.out.println("INFORMACIÓN DEL HOTEL 4:");
          System.out.println(toString());
      }  
    }
  
    

