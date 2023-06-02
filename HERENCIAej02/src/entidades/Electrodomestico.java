/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nazarenoagustintedoldi
 */
/**
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso.
 *
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados. Los constructores que se
 * implementarán serán: • Un constructor vacío. • Un constructor con la carga y
 * el resto de los atributos heredados. Recuerda que debes llamar al constructor
 * de la clase padre. Los métodos que se implementara serán: • Método get y set
 * del atributo carga. • Método crearLavadora (): este método llama a
 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
 * atributos heredados del padre y después llenamos el atributo propio de la
 * lavadora. • Método precioFinal(): este método será heredado y se le sumará la
 * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el
 * precio en $500, si la carga es menor o igual, no se incrementará el precio.
 * Este método debe llamar al método padre y añadir el código necesario.
 * Recuerda que las condiciones que hemos visto en la clase Electrodoméstico
 * también deben afectar al precio. Se debe crear también una subclase llamada
 * Televisor con los siguientes atributos: resolución (en pulgadas) y
 * sintonizador TDT (booleano), además de los atributos heredados. Los
 * constructores que se implementarán serán: • Un constructor vacío. • Un
 * constructor con la resolución, sintonizador TDT y el resto de los atributos
 * heredados. Recuerda que debes llamar al constructor de la clase padre. LETRA
 * PRECIO A $1000 B $800 C $600 D $500 E $300 F $100
 *
 * PESO PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800
 * Mayor que 80 kg $1000
*
 */
public abstract class Electrodomestico {

    protected String color;
    protected Integer precio, peso;
    protected char letra;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, Integer precio, Integer peso, char letra) {
        this.color = color;
        this.precio = precio;
        this.peso = peso;
        this.letra = letra;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            return letra;
        } else {
            return 'F';
        }

    }

    public String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        String resultado = "";
        for (String aux : colores) {
            if (aux == color) {
                resultado = color;
            } else {
                resultado = "blanco";
            }
        }
        return resultado;
    }
//     protected String color;
//    protected Integer precio, peso;
//    protected char letra;
//    

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el color");
        String color2 = leer.next().toLowerCase();
        setColor(comprobarColor(color2));
        setPrecio(1000);
        System.out.println("Ingrese el peso");
        setPeso(leer.nextInt());
        System.out.println("Ingrese la letra");
        char letra2 = leer.next().toUpperCase().charAt(0);
        setLetra(comprobarConsumoEnergetico(letra2));
    }
//LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//
//PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000

    public void precioFinal() {
        switch (getLetra()) {
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
        }
        if (getPeso() > 1 && getPeso() < 20) {
            setPrecio(getPrecio() + 100);
        } else if (getPeso() > 19 && getPeso() < 50) {
            setPrecio(getPrecio() + 500);
        } else if (getPeso() > 49 && getPeso() < 80) {
            setPrecio(getPrecio() + 800);
        } else if (getPeso() > 79) {
            setPrecio(getPrecio() + 1000);
        }
        //System.out.println(getPrecio());    

    }
}
