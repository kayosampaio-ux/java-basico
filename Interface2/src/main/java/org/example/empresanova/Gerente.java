package org.example.empresanova;

public class Gerente extends  CargoDeCofianca implements  Contratacao{
    public Gerente(Bonificacao bonificacao) {
        super(bonificacao);
    }

    public Gerente() {
        super(Bonificacao.GERENTE);

    }

    @Override
    public void admitirFuncionario(Fucionario funcionario) {

    }

    @Override
    public void demiirFuncionario(Fucionario funcionario) {

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                '}';
    }
}
