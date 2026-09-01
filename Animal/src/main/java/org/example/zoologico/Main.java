package org.example.zoologico;

public class Main {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    Gato gato = new Gato();
    Pato pato = new Pato();
    Galo galo = new Galo();


    System.out.println("Cachorro: " + cachorro.emitirsom());
    System.out.println("Gato: " + gato.emitirsom());
        System.out.println("Cachorro come: " + cachorro.comer());
        System.out.println("Gato come: " + gato.comer());
        System.out.println("Pato come: " + pato.comer());
        System.out.println("Pato: " + pato.emitirsom());
        System.out.println("Galo come: " + galo.comer());
        System.out.println("Galo: " + galo.emitirsom());
    }
}
