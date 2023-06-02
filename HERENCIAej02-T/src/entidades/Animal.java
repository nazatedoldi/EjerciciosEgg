/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.AccionMascota;

/**
 *
 * @author nazarenoagustintedoldi
 */
public final class Animal implements AccionMascota {

    @Override
    public void pasear(int cantVeces) {
        System.out.println("Ha sido paseado " +cantVeces+ " veces");
    }

    @Override
    public void comerAlimento(int cantidad) {
        System.out.println("Ha comido " +cantidad+ " gr");
    }
}
