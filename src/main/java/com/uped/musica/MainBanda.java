package com.uped.musica;

import com.uped.musica.modelo.*;

public class MainBanda {
    public static void main(String[] args) {
        System.out.println("DEMOSTRACIÓN DE LIGADURA ESTÁTICA VS DINÁMICA");
        Instrumento i = new Guitarra();
        System.out.println(i.tipo);
        System.out.println(Instrumento.identificar());
        i.mostrarTipo();
        i.tocar();

        System.out.println("\nBANDA COMPLETA (POLIMORFISMO) ");
        Instrumento[] banda = {
                new Guitarra(),
                new Piano(),
                new Bateria()
        };

        for (Instrumento instr : banda) {
            instr.tocar();
        }
    }
}