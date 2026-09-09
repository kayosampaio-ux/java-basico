package org.example.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.calcular(1, 4);
        calculadora.calcular(2.1, 4.3);
        calculadora.calcular("SE", "MATA");
    }
}
