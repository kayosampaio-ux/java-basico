package org.example.treino;

import org.example.empresa.Setor;

public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 0.2;

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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void admitirFuncionario(Funcionario funcionario) {

    }

    @Override
    public void demitirFuncionario(Funcionario funcionario) {

    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
                '}';
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public Diretor(Bonificacao bonificacao) {
        super(bonificacao);
    }

    public Diretor() {
    }
}