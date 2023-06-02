/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author nazarenoagustintedoldi
 */
public class HERENCIAej04 {

    /**
     * @param args the command line arguments
     */
    /** 4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2. **/
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     Circulo c1 = new Circulo();
     System.out.println("Ingrese el radio del círculo:");
     c1.setRadio(leer.nextDouble());
     c1.calculoArea();
     c1.calculoPerimetro();
     
     Rectangulo r1 = new Rectangulo();
     System.out.println("Ingrese la base del rectangulo");
     r1.setBase(leer.nextDouble());
     System.out.println("Ingrese la altura del rectangulo");
     r1.setAltura(leer.nextDouble());
     r1.calculoArea();
     r1.calculoPerimetro();
     
    }
    
}
