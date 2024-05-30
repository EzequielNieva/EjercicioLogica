package com.gm.test;

import com.gm.dao.*;
import java.util.List;

public class TestDAOs {
    public static void main(String[] args) {
        AlumnoDAO alumno = new AlumnoDAO();
        System.out.println("Alumnos:");
        imprimir(alumno.listar());
        
        System.out.println("Domicilios:");
        DomicilioDAO domicilio = new DomicilioDAO();
        imprimir(domicilio.listar());
        
        System.out.println("Contactos:");
        ContactoDAO contacto = new ContactoDAO();
        imprimir(contacto.listar());
        
        System.out.println("Cursos:");
        CursoDAO curso = new CursoDAO();
        imprimir(curso.listar());
        
        System.out.println("Asignaciones:");
        AsignacionDAO asignacion = new AsignacionDAO();
        imprimir(asignacion.listar());
        
    }
    
    private static void imprimir(List coleccion){
        for (Object object : coleccion) {
            System.out.println("valor = " + object);
        }
    }
}
