package org.example.empresanova;

public abstract class CargoDeCofianca {
    protected  Bonificacao bonificacao;

    public CargoDeCofianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;

    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
