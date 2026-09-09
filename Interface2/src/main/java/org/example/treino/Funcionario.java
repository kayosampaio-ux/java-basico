package org.example.treino;

import org.example.empresa.Setor;

public class Funcionario {
    protected String nome;
    protected String DatadeNascimento;
    protected Sexo sexo;
    protected Setor setor;

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

    public Funcionario() {
        super();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        DatadeNascimento = datadeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Funcionario(String nome, String datadeNascimento, Sexo sexo, Setor setor) {
        this.nome = nome;
        DatadeNascimento = datadeNascimento;
        this.sexo = sexo;
        this.setor = setor;
    }
}
