package com.uped.proyecto.modelo;

public class Voluntario extends Persona {
    private String area;

    public Voluntario(String nombre, String dui, String area) {
        super(nombre, dui);
        this.area = area;
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }
}