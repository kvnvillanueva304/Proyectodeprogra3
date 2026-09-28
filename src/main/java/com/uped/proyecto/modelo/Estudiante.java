package com.uped.proyecto.modelo;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String dui, String carrera) {
        super(nombre, dui);
        this.carrera = carrera;
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }
}