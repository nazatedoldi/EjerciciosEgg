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
public class EdificioDeOficinas extends Edificio{
    protected Integer cantOficinas, cantPersonas, cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer cantOficinas, Integer cantPersonas, Integer cantPisos) {
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public EdificioDeOficinas(Integer cantOficinas, Integer cantPersonas, Integer cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
    }

    public Integer getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(Integer cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    @Override
    public void calcularVolumen() {
        double volumenEdificio = getAncho() * getLargo() * getAlto();
        System.out.println("El volumen del edificio es de " +volumenEdificio);
    }

    @Override
    public void calcularSuperficie(){
        double superficieEdificio = getAncho() * getLargo() * getCantPisos();
        System.out.println("La superficie del edificio es de " +superficieEdificio);
    }
    
    public void cargarInformacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el alto del edificio");
        setAlto(leer.nextDouble());
        System.out.println("Ingrese el ancho del edificio");
        setAncho(leer.nextDouble());
        System.out.println("Ingrese el largo del edificio");
        setLargo(leer.nextDouble());
    }
    
    public void cantidadPersonas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de oficinas que hay en el edificio");
        setCantOficinas(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas que entran en cada oficina");
        setCantPersonas(leer.nextInt());
        setCantPisos(getCantOficinas());
        System.out.println("----- cargando información");
        System.out.println("La cantidad de personas que entran en cada oficina es de "+ (getCantPersonas()/getCantOficinas()));
    }
    
    
    
}
