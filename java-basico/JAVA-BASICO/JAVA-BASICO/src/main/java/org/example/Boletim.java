package org.example;

import java.util.Scanner;
public class Boletim {
public static void main(String[] args) {


    Scanner leitor = new Scanner(System.in);


    System.out.print("Digite a primeira nota: ");
    double nota1 = leitor.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = leitor.nextDouble();


    double mediaFinal = calcularMedia(nota1, nota2);

    String status = definirStatus(mediaFinal);

    // 4. Exibindo os resultados
    System.out.println("\n--- Boletim ---");
    System.out.println("Média final: " + mediaFinal);
    System.out.println("Status: " + status);


    leitor.close();
}

public static double calcularMedia(double n1, double n2) {
    double calculo = (n1 + n2) / 2;
    return calculo;
}

public static String definirStatus(double media) {

    if (media >= 7.0) {
        return "Aprovado";

    } else if (media >= 5.0) {
        return "Verificação Suplementar";

    } else {
        return "Reprovado";
    }
}
}

