package org.example.cliente;

public class Main {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Axor", 16,new Pet("Deamon", 3, "Corvo"));


    System.out.println("Nome: " + cliente1.getNome());
    System.out.println("idade: " + cliente1.getIdade());
    System.out.println("pet: " + cliente1.getPet());




    }


    }

