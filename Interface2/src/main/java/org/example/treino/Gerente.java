package org.example.treino;

public class Gerente extends CargoDeConfianca  implements Contratacao{
    public Gerente(Bonificacao bonificacao) {super(bonificacao);}

    @Override
    public Bonificacao getBonificacao() {
        return super.getBonificacao();
    }

    @Override
    public void setBonificacao(Bonificacao bonificacao) {
        super.setBonificacao(bonificacao);
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
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Gerente() {
        super(Bonificacao.GERENTE);
    }

    public void admitirFuncionario(Funcionario funcionario){

    }

    public void demitirFuncionario(Funcionario funcionario) {

    }

}

