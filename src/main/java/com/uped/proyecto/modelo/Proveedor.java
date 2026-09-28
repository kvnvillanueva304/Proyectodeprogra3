package com.uped.proyecto.modelo;

public class Proveedor extends Persona {
    private String empresa;

    public Proveedor(String nombre, String dui, String empresa) {
        super(nombre, dui);
        this.empresa = empresa;
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }
}