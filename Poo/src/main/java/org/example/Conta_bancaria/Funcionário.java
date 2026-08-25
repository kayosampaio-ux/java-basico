package org.example.Conta_bancaria;

public class Funcionário {
    private int codigo_do_funcionario;
    private String nome;
    private String endereco;
    private int telefone;

    @Override
    public String toString() {
        return "Funcionário{" +
                "codigo_do_funcionario=" + codigo_do_funcionario +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", contaBancaria=" + contaBancaria +
                '}';
    }

    public Funcionário(int codigo_do_funcionario, String nome, String endereco, int telefone, String email, Conta_bancaria contaBancaria) {
        this.codigo_do_funcionario = codigo_do_funcionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public int getCodigo_do_funcionario() {
        return codigo_do_funcionario;
    }

    public void setCodigo_do_funcionario(int codigo_do_funcionario) {
        this.codigo_do_funcionario = codigo_do_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta_bancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(Conta_bancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    private String email;
    private Conta_bancaria contaBancaria;
}
