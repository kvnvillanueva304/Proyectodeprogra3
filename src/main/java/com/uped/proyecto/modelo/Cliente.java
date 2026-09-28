package com.uped.proyecto.modelo;

public class Cliente extends Persona {
    private String categoria;

    public Cliente(String nombre, String dui, String categoria) {
        super(nombre, dui);
        this.categoria = categoria;
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }
}