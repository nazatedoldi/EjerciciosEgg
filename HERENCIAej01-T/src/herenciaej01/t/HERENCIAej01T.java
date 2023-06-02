/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej01.t;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class HERENCIAej01T {

    /**
     * @param args the command line arguments
     */
    /**
     * Vamos a crear una clase Animal que tenga un método hacerRuido() que
     * devuelva un saludo “Hola”. Luego haremos clase Perro y clase Gato que
     * extiendan de Animal y sobreescriban el método hacerRuido() con el ruido
     * que corresponda a cada uno. Luego, en el main vamos a crear un ArrayList
     * de animales y los siguientes animales Animal a = new Animal(); Animal b =
     * new Perro(); Animal c = new Gato(); Agregaremos a la lista a cada uno y
     * luego, con un
     *
     * @param args *
     */
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList();
        Animal a = new Animal();
        animales.add(a);
        Animal b = new Perro();
        animales.add(b);
        Animal c = new Gato();
        animales.add(c);
        for (Animal aux : animales) {
            if (aux instanceof Perro) {
                Perro object = (Perro) aux;
                System.out.println("Soy un perro B");
                b.hacerRuido();
                continue;
            }
        }
        for (Animal aux : animales) {
            if (aux instanceof Gato) {
                Gato object = (Gato) aux;
                System.out.println("Soy un gato A");
                c.hacerRuido();
                continue;
            }
        }
    }

}
