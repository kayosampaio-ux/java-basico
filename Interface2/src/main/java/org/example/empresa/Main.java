package org.example.empresa;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Axor", "303030", Sexo.MASCULINO, Setor.OPERACOES, 4000.0, "1010");
        Diretor diretor = new Diretor("Robert", "404040", Sexo.MASCULINO, Setor.OPERACOES, 4000.0);

        System.out.println(diretor.toString());
        diretor.admitir(motoboy);
    }
}
