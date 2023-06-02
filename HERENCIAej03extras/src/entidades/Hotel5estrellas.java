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
public class Hotel5estrellas extends Hotel4estrellas {
    protected int cantSalones, cantSuites, cantLimosinas, valorAgregadoLimusina;

    public Hotel5estrellas() {
    }

    public Hotel5estrellas(int cantSalones, int cantSuites, int cantLimosinas, int valorAgregadoLimusina) {
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.valorAgregadoLimusina = valorAgregadoLimusina;
    }

    public Hotel5estrellas(int cantSalones, int cantSuites, int cantLimosinas, int valorAgregadoLimusina, char gimnasio, String nombreResto, int capacidadResto, double valorAgregadoRestaurante, double valorAgregadoGimnasio) {
        super(gimnasio, nombreResto, capacidadResto, valorAgregadoRestaurante, valorAgregadoGimnasio);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.valorAgregadoLimusina = valorAgregadoLimusina;
    }

    public Hotel5estrellas(int cantSalones, int cantSuites, int cantLimosinas, int valorAgregadoLimusina, char gimnasio, String nombreResto, int capacidadResto, double valorAgregadoRestaurante, double valorAgregadoGimnasio, int capacidad, int cantHabitaciones, int cantCamas, int cantPisos, int precioHabitaciones) {
        super(gimnasio, nombreResto, capacidadResto, valorAgregadoRestaurante, valorAgregadoGimnasio, capacidad, cantHabitaciones, cantCamas, cantPisos, precioHabitaciones);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.valorAgregadoLimusina = valorAgregadoLimusina;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public int getValorAgregadoLimusina() {
        return valorAgregadoLimusina;
    }

    public void setValorAgregadoLimusina(int valorAgregadoLimusina) {
        this.valorAgregadoLimusina = valorAgregadoLimusina;
    }

    @Override
    public String toString() {
        return "Hotel5estrellas{" + "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + ", valorAgregadoLimusina=" + valorAgregadoLimusina + '}';
    }

   

   
    
    public void informacionHotel5() {
        Scanner leer = new Scanner(System.in);
        super.informacionHotel();
        System.out.println("Ingrese la cantidad de limosinas");
        setCantLimosinas(leer.nextInt());
        int valorLimosinas = getCantLimosinas() * 15;
        setValorAgregadoLimusina(valorLimosinas);
        setPrecioHabitaciones((int) (50 + getCapacidad()+ getValorAgregadoLimusina() + getValorAgregadoGimnasio() + getValorAgregadoRestaurante()));
        System.out.println("El precio final de la habitación para este hotel 5 es de " +getPrecioHabitaciones());
        
    }
    
    public void mostrarinfoHotel5() {
        System.out.println("INFORMACION DEL HOTEL 5:");
        System.out.println(toString());
    }
    
  
    
}
