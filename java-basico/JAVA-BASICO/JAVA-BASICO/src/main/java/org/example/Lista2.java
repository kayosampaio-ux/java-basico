package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String reposta;
        do{
            System.out.println("Digite um nota: ");
            notas.add(ler.nextDouble());

            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("\nPressione a tecla N para sair.");
            reposta =ler.next();
        } while (!reposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas:");
        for (double nota: notas){
            System.out.println("Nota:" + nota);
        }
    }
}
