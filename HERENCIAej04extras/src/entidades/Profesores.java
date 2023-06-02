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
public class Profesores extends Persona{
    protected String departamento;

    public Profesores() {
    }

    public Profesores(String departamento) {
        this.departamento = departamento;
    }

    public Profesores(String departamento, String nombre, String apellido, String estadoCivil, int numeroIdentificacion, Scanner leer) {
        super(nombre, apellido, estadoCivil, numeroIdentificacion, leer);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

   
    

   
    @Override
    public String toString() {
        return super.toString() + "Profesores{" + "departamento=" + departamento + '}';
    }
    
    public void crearProfesor() {
        //Scanner leer = new Scanner(System.in);
        super.crearPersona();
        System.out.println("Ingrese el departamento del profesor (lenguajes, matematica, arquitectura)");
        String aux1 = leer.next();
        if(aux1.equalsIgnoreCase("lenguajes") || aux1.equalsIgnoreCase("matematica") || aux1.equalsIgnoreCase("arquitectura")) {
            setDepartamento(aux1);
        } else {
            setDepartamento("matematica");
        }
    }
    
    public void cambiarDepartamento() {
        System.out.println("Ingrese el cambio de departamento");
        setDepartamento(leer.next());
    }
}
