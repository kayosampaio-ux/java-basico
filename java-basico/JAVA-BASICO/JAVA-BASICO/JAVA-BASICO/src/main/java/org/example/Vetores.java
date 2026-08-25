package org.example;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        double soma = 0;

        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {

            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = ler.nextDouble();

            while (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10:");
                notas[i] = ler.nextDouble();
            }
        }

        System.out.println("\nExibindo as notas: ");

        for (double nota : notas) {
            System.out.println("Nota: " + nota);
            soma = soma + nota;
        }

        double media = soma / notas.length;
        System.out.println("\nA média aritmética é: " + media);

        ler.close();
    }
}