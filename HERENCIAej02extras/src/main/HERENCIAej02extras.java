/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author nazarenoagustintedoldi
 */
/**2- Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

16
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas. **/
public class HERENCIAej02extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> e1 = new ArrayList();
        
        System.out.println("EDIFICIO DE OFICINA 1");
        EdificioDeOficinas eo1 = new EdificioDeOficinas();
        eo1.cargarInformacion();
        eo1.cantidadPersonas();
        eo1.calcularSuperficie();
        eo1.calcularVolumen();
        e1.add(eo1);
        
        System.out.println("EDIFICIO DE OFICINA 2");
        EdificioDeOficinas eo2 = new EdificioDeOficinas();
        eo2.cargarInformacion();
        eo2.cantidadPersonas();
        eo2.calcularSuperficie();
        eo2.calcularVolumen();
        e1.add(eo2);
        
        System.out.println("POLIDEPORTIVO 1");
        Edificio p1 = new Polideportivo("Velez", "Techado", 20, 30, 40);
        p1.calcularSuperficie();
        p1.calcularVolumen();
        e1.add(p1);
        
        System.out.println("POLIDEPORTIVO 2");
        Edificio p2 = new Polideportivo("River", "Abierto", 10, 30, 50);
        p2.calcularSuperficie();
        p2.calcularVolumen();
        e1.add(p2);
        
        int cantTechados = 0, cantAbiertos = 0;
        for (Edificio aux : e1) {
            if (aux instanceof Polideportivo) {
                if(((Polideportivo) aux).getTipoDeInstalacion().equalsIgnoreCase("techado")) {
                    cantTechados = cantTechados +1;
                    
                } else if (((Polideportivo) aux).getTipoDeInstalacion().equalsIgnoreCase("abierto")) {
                    cantAbiertos = cantAbiertos + 1;
                }
                
            } 
        }
        System.out.println("La cantidad de polideportivos techados es de " +cantTechados);
        System.out.println("La cantidad de polideportivos abiertos es de " +cantAbiertos);
    }
    
}
