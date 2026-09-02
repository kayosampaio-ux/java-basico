package org.example.empresa;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminio");

    private String texto;

    public String getTexto() {
        return texto;
    }

    Sexo(String texto) {
        this.texto = texto;
    }
}
