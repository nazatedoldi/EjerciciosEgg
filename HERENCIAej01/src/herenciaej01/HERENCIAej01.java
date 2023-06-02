/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej01;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class HERENCIAej01 {

    /**
     * @param args the command line arguments
     */
    /** Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente: **/
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro", "Doberman", 15);
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Teddy", "Croquetas", "Chihuahua", 10);
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", "Siamés", 15);
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", "Fino", 25);
        caballo1.Alimentarse();
    }
    
}
