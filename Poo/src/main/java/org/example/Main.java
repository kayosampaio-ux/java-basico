package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String nome = "Kayo";
        int idade = 19;

//        Clientes cliente1 = new Clientes();
//
//        cliente1.nome = "Kayo";
//        cliente1.idade = 19;

        Clientes cliente1 = new Clientes();
        cliente1.setNome("Kayo");
        cliente1.setIdade(19);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("idade: " + cliente1.getIdade());

        //funcionarios
        funcionarios funcionario1 = new funcionarios("Maria", 35, "Maria123@gmail.com");
//        funcionario1.setNome("Pedro");
//        funcionario1.setIdade(19);
//        funcionario1.setEmail("Pedro123@giaml.com");

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("idade: " + funcionario1.getIdade());
        System.out.println("Email: " + funcionario1.getEmail());

        //produtos
        produtos produto1 = new produtos("Iphone", 800, 2800);
//        produto1.setNome("Iphone");
//        produto1.setPreco(2800);
//        produto1.setQuantidade(255);

        System.out.println("Nome: " + produto1.getNome());
        System.out.println("preço: R$" + produto1.getPreco());
        System.out.println("quantidade: " + produto1.getQuantidade());

        //Biblioteca
        biblioteca biblioteca1 = new biblioteca("GameOfThrones", "George R.R. Martin", 1, 500);
        biblioteca biblioteca2 = new biblioteca("Harry potter", "J.K.Rowling", 600, 499);
        System.out.println("Nome: " + biblioteca1.getTitulo());
        System.out.println("preço: R$" + biblioteca1.getPreco());
        System.out.println("quantidade: " + biblioteca1.getAutor());
        System.out.println("Numero de pagina" + biblioteca1.getNumero_de_pagina());
        
        System.out.println("Nome: " + biblioteca2.getTitulo());
        System.out.println("preço: R$" + biblioteca2.getPreco());
        System.out.println("quantidade: " + biblioteca2.getAutor());
        System.out.println("Numero de pagina" + biblioteca2.getNumero_de_pagina());
    }
}