/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej02;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author nazarenoagustintedoldi
 */
/** Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor. **/
public class HERENCIAej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> e1 = new ArrayList();
       
        Lavadora l1 = new Lavadora();
        l1.crearLavadora();
        l1.precioFinalLav();
        e1.add(l1);
        
        Lavadora l2 = new Lavadora();
        l2.crearLavadora();
        l2.precioFinalLav();
        e1.add(l2);
        
        Televisor t1 = new Televisor();
        t1.crearTelevisor();
        t1.precioFinalTele();
        e1.add(t1);
        
        Televisor t2 = new Televisor();
        t2.crearTelevisor();
        t2.precioFinalTele();
        e1.add(t2);
        
        int precioFinalLav = 0, precioFinalTv = 0;
        
        for (Electrodomestico aux : e1) {
            if (aux instanceof Lavadora) {
                precioFinalLav = precioFinalLav + aux.getPrecio();
            }
            if (aux instanceof Televisor) {
                precioFinalTv = precioFinalTv + aux.getPrecio();
            }
        }
        System.out.println(precioFinalLav);
        System.out.println(precioFinalTv);
        System.out.println(precioFinalLav + precioFinalTv);
    }
    
}
