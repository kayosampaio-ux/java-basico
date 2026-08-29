package org.example.computador;

public class Placa_mae extends Componentes {
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Placa_mae{" +
                "Nome='" + Nome + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public Placa_mae(String marca, String modelo, String nome) {
        super(marca, modelo);
        Nome = nome;
    }
}