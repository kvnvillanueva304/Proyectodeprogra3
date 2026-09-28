package com.uped.proyecto.modelo;

public class Docente extends Persona {
    private String especialidad;
    private int asignaturas;

    public Docente(String nombre, String dui, String especialidad, int asignaturas) {
        super(nombre, dui);
        this.especialidad = especialidad;
        this.asignaturas = asignaturas;
    }

    @Override
    public double calcularBeneficioAnual() {
        return asignaturas * 100.0;
    }
}
