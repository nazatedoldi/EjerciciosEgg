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
public class AlojamientosExtrahoteleros {
    protected boolean privado;
    protected double m2;

    public AlojamientosExtrahoteleros() {
    }

    public AlojamientosExtrahoteleros(boolean privado, double m2) {
        this.privado = privado;
        this.m2 = m2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "AlojamientosExtrahoteleros{" + "privado=" + privado + ", m2=" + m2 + '}';
    }
    
    public void infoAlojamiento() {
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        do {
        System.out.println("Ingrese si es privado o no");
        respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s") && respuesta.equalsIgnoreCase("n"));
        if (respuesta.equalsIgnoreCase("s")) {
            setPrivado(true);
        } else {
            setPrivado(false);
        }
    }
    
    
}
