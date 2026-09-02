package org.example.empresa;

public class Funcionario {
    protected String nome;
    protected String DatadeNascimento;
    protected Sexo sexo;
    protected Setor setor;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
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

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, String datadeNascimento, Sexo sexo, Setor setor, Double salarioBase) {
        this.nome = nome;
        DatadeNascimento = datadeNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public abstract double getSalarioFinal();

    protected Double salarioBase;
}
