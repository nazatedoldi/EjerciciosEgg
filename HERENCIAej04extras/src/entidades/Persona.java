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
/** Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados. **/
public class Persona {
    protected String nombre, apellido, estadoCivil;
    protected int numeroIdentificacion;
    protected Scanner leer;

    public Persona() {
        this.leer = new Scanner(System.in);
    }

    public Persona(String nombre, String apellido, String estadoCivil, int numeroIdentificacion, Scanner leer) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.numeroIdentificacion = numeroIdentificacion;
        this.leer = new Scanner(System.in);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", numeroIdentificacion=" + numeroIdentificacion + '}';
    }
    
    public void crearPersona() {
        //Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        setApellido(leer.next());
        System.out.println("Ingrese el número de identificación");
        setNumeroIdentificacion(leer.nextInt());
        System.out.println("Ingrese el estado civil (soltero, casado)");
        String aux = leer.next();
        if(aux.equalsIgnoreCase("soltero") || aux.equalsIgnoreCase("casado")) {
            setEstadoCivil(aux);
        } else {
            setEstadoCivil("Soltero");
        }
    }
    
    public void cambiarEstadoCivil() {
        if(getEstadoCivil().equalsIgnoreCase("soltero")) {
            setEstadoCivil("casado");
        } else {
            setEstadoCivil("soltero");
        }
    }
    
}
