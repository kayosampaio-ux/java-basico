package org.example.treino;

public abstract class  CargoDeConfianca {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;

    }

    public  Bonificacao getBonificacao() { return  bonificacao;}

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public CargoDeConfianca() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "CargoDeConfianca{" +
                "bonificacao=" + bonificacao +
                '}';
    }
}
