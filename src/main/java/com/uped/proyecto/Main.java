package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("  SISTEMA INTEGRAL DE GESTIÓN DE PERSONAS  ");


        Persona cliente = new Cliente("Sofía Rodríguez", "01122334-5", "VIP");
        Persona empleado = new Empleado("Carlos López", "01234567-8", 800.0);
        Persona estudiante = new Estudiante("Diego Torres", "09988776-5", "Ingeniería");
        Persona docente = new Docente("Ana Martínez", "09876543-2", "Matemáticas", 5);
        Persona voluntario = new Voluntario("Elena Gómez", "05544332-1", "Mantenimiento");
        Persona proveedor = new Proveedor("Roberto Cruz", "03322110-9", "Sistemas S.A.");
        Persona visitante = new Visitante("Laura Pérez", "07788990-4", "Consulta General");
        Gerente gerente = new Gerente("Marta Díaz", "05123456-7", 1200.0, 5);

        Persona[] listaPersonas = { cliente, empleado, estudiante, docente, voluntario, proveedor, visitante, gerente };

        System.out.println(" LISTADO DE PERSONAS Y BENEFICIOS ANUALES ");
        for (Persona p : listaPersonas) {
            System.out.println("• " + p.presentarse());
            System.out.println("  Beneficio Anual: $" + p.calcularBeneficioAnual());
        }

        System.out.println("\nDETALLE DE TERCERA GENERACIÓN ");
        System.out.println("Ficha completa: " + gerente);
        System.out.println("Tamaño de equipo asignado: " + gerente.getTamanoEquipo() + " colaboradores.");
    }
}