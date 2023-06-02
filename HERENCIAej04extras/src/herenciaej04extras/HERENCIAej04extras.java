/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej04extras;

import entidades.Empleados;
import entidades.Estudiantes;
import entidades.PersonalDeServicio;
import entidades.Profesores;

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
public class HERENCIAej04extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("CREANDO EMPLEADO");
        Empleados e1 = new Empleados();
        e1.crearEmpleado();
        e1.cambiarEstadoCivil();
        e1.reasignacionDespacho();
        System.out.println(e1.toString());
        
        System.out.println("-----------");
        System.out.println("CREANDO ESTUDIANTE");
        Estudiantes es1 = new Estudiantes();
        es1.crearEstudiante();
        es1.cambiarEstadoCivil();
        es1.cambioMatriculacion();
        System.out.println(es1.toString());
        
        System.out.println("------------");
        System.out.println("CREANDO PROFESOR");
        Profesores p1 = new Profesores();
        p1.crearProfesor();
        p1.cambiarEstadoCivil();
        p1.cambiarDepartamento();
        System.out.println(p1.toString());
        
        System.out.println("------------");
        System.out.println("CREANDO PERSONAL DE SERVICIO");
        PersonalDeServicio ps1 = new PersonalDeServicio();
        ps1.crearPersonalServicio();
        ps1.cambiarEstadoCivil();
        ps1.trasladoSeccion();
        System.out.println(ps1.toString());
        
    }
    
}
