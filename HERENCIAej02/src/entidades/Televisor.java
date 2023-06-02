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
/**
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados. Los constructores que se implementarán serán: • Un
 * constructor vacío. • Un constructor con la resolución, sintonizador TDT y el
 * resto de los atributos heredados. Recuerda que debes llamar al constructor de
 * la clase padre. Los métodos que se implementara serán: • Método get y set de
 * los atributos resolución y sintonizador TDT. • Método crearTelevisor(): este
 * método llama a crearElectrodomestico() de la clase padre, lo utilizamos para
 * llenar los atributos heredados del padre y después llenamos los atributos del
 * televisor. • Método precioFinal(): este método será heredado y se le sumará
 * la siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40
 * pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT
 * incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en
 * la clase Electrodomestico también deben afectar al precio. Finalmente, en el
 * main debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor
 * y llamar a los métodos necesarios para mostrar el precio final de los dos
 * electrodomésticos. *
 */
public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Televisor(int resolucion, boolean sintonizador, String color, Integer precio, Integer peso, char letra) {
        super(color, precio, peso, letra);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        System.out.println("Ingrese los datos del televisor");
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        char eleccion;
        System.out.println("Ingrese la resolución en pulgadas");
        setResolucion(leer.nextInt());
        do {
            System.out.println("Ingrese si tiene sintonizador TDT s/n");
            eleccion = leer.next().charAt(0);
        } while (eleccion != 's' && eleccion != 'n');
        if (eleccion == 's') {
            setSintonizador(true);
        } else if (eleccion == 'n') {
            setSintonizador(false);
        }
    }
// • Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.

    public void precioFinalTele() {
        super.precioFinal();

        if (getResolucion() > 40) {
            setPrecio((int) (getPrecio() * 1.3));
        }
        if (isSintonizador() == true) {
            setPrecio(getPrecio() + 500);
        }

    }

    public void imprimirTelevisor(Televisor t1) {
        System.out.println(t1.getResolucion());
        System.out.println(t1.isSintonizador());
        System.out.println(super.getColor());
        System.out.println(super.getPeso());
        System.out.println(super.getPrecio());
        System.out.println(super.getLetra());
    }

}
