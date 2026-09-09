package org.example.treino;

import org.example.empresa.Diretor;
import org.example.empresa.Setor;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Axalote", "303030", Sexo.MASCULINO, Setor.OPERACOES,"1010");
        Diretor diretor = new Diretor("Carlos", "404040", org.example.empresa.Sexo.MASCULINO, Setor.OPERACOES,4000.0 );
        Gerente gerente = new Gerente();

        System.out.println(diretor.toString());
        gerente.admitirFuncionario(new Funcionario());
        gerente.demitirFuncionario(new Funcionario());
        System.out.println("= = = = = = = = = = = =");
        System.out.println(motoboy);
        System.out.println("= = = = = = = = = = = =");

    }
}
