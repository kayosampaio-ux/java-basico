package org.example.treino;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String texto;

    public String getTexto() {
        return  texto;
    }

    Sexo(String texto) {
        this.texto = texto;
    }
}
