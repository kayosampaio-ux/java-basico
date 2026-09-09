package org.example.treino;

import org.example.empresa.Setor;

public class Motoboy extends Funcionario{
    private String CarteiraDeHabilitacao;

    @Override
    public String toString() {
        return "Motoboy{" +
                "CarteiraDeHabilitacao='" + CarteiraDeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                '}';
    }

    public String getCarteiraDeHabilitacao() {
        return CarteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        CarteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public Motoboy(String nome, String datadeNascimento, Sexo sexo, Setor setor, String carteiraDeHabilitacao) {
        super(nome, datadeNascimento, sexo, setor);
        CarteiraDeHabilitacao = carteiraDeHabilitacao;
    }
}
