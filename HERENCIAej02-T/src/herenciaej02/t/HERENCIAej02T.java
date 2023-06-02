/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej02.t;

import entidades.Animal;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class HERENCIAej02T {

    /**
     * @param args the command line arguments
     */
    /** Vamos a crear una interfaz con un método abstracto. 
     * Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz **/
    public static void main(String[] args) {
        Animal a = new Animal();
        a.comerAlimento(90);
        a.pasear(20);
    }
    
}
