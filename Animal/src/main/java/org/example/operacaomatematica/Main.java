package org.example.operacaomatematica;

public class Main {
    public static void main(String[] args) {
    Soma soma = new Soma();
    Divisao divisao = new Divisao();
    Subtracao subtracao = new Subtracao();
    Multiplicacao multiplicacao = new Multiplicacao();


        System.out.println("========Calculadora=======");
        System.out.println("Soma: " + soma.calcular(6, 5));
        System.out.println("Multiplicação: " + multiplicacao.calcular(8, 9));
        System.out.println("Divisão: " + divisao.calcular(7, 8));
        System.out.println("Subtração: " + subtracao.calcular(2,1));
        System.out.println("==========By: KayoMario =========");
    }
}
