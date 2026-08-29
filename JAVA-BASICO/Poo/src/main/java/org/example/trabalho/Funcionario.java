package org.example.trabalho;

public class Funcionario {
    private String nome;
    private String email;
    private float salariol;
    private  Endereco endereco;

    public Funcionario() {

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salariol=" + salariol +
                ", endereco=" + endereco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalariol() {
        return salariol;
    }

    public void setSalariol(float salariol) {
        this.salariol = salariol;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario(String nome, String email, float salariol, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salariol = salariol;
        this.endereco = endereco;
    }
}
