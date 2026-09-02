package org.example.empresanova;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Axor", "12345678910", "303030", 2000.0, "Mxyzptlk");
        Gerente gerente = new Gerente();

        gerente.admitirFuncionario(motoboy);
        System.out.println("= = = = = = = = = = = =");
        System.out.println(motoboy);
        System.out.println("= = = = = = = = = = = =");

    }
}
