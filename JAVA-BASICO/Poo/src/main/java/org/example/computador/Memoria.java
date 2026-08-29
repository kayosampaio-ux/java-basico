package org.example.computador;

public class Memoria extends Componentes {
    private  String capacidadedearmazenamento;
    private String tipodeconexao;

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadedearmazenamento='" + capacidadedearmazenamento + '\'' +
                ", tipodeconexao='" + tipodeconexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getTipodeconexao() {
        return tipodeconexao;
    }

    public void setTipodeconexao(String tipodeconexao) {
        this.tipodeconexao = tipodeconexao;
    }

    public Memoria(String marca, String modelo, String capacidadedearmazenamento, String tipodeconexao) {
        super(marca, modelo);
        this.capacidadedearmazenamento = capacidadedearmazenamento;
        this.tipodeconexao = tipodeconexao;
    }

    public String getCapacidadedearmazenamento() {
        return capacidadedearmazenamento;
    }

    public void setCapacidadedearmazenamento(String capacidadedearmazenamento) {
        this.capacidadedearmazenamento = capacidadedearmazenamento;
    }

    public Memoria(String marca, String modelo, String capacidadedearmazenamento) {
        super(marca, modelo);
        this.capacidadedearmazenamento = capacidadedearmazenamento;
    }
}
