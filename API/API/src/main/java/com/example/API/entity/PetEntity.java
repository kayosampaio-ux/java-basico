package com.example.API.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_usuario")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String idade;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private String telefone;

    public PetEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public PetEntity(Long id, String nome, String email, String idade, String raca, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.raca = raca;
        this.telefone = telefone;
    }
}
