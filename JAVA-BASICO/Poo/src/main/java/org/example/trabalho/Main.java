package org.example.trabalho;

import org.example.computador.Memoria;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua", "19", "12","499121212", "Sao paulo");
    Medico medico = new Medico("Carlos", "Carlos12@gmail.com",15000, new Endereco("Rauulwd", "12", "Casa", "4000434", "Sp"), "harvard" );
    Engenheiro engenheiro = new Engenheiro("crea-ba");
    Funcionario funcionario = new Funcionario("Carlos","Carlos12@gmail.com", 8000, new Endereco("RUa de deus", "12", "Casa", "303030319", "Sp"));


        System.out.println(" ===== TRrabalho =====");
        System.out.println(endereco.toString());
        System.out.println(medico.toString());
        System.out.println(engenheiro.toString());
        System.out.println(endereco.toString());
        System.out.println(funcionario.toString());
    }
}
