package org.example.treino;

public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;

    }

    @Override
    public String toString() {
        return "Bonificacao{" +
                "valor=" + valor +
                '}';
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {return  valor;}
}
