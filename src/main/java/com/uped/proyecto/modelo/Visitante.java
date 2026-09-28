package com.uped.proyecto.modelo;

public class Visitante extends Persona {
    private String motivo;

    public Visitante(String nombre, String dui, String motivo) {
        super(nombre, dui);
        this.motivo = motivo;
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }
}