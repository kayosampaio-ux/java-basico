package org.example.empresa;

public enum Setor {
    RECURSOS_HUMANOS("Recursos_humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operacoes");

    private String nome;

    public String getNome() {
        return nome;
    }

    Setor(String nome) {
        this.nome = nome;
    }
}
