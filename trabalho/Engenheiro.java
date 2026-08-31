package org.example.trabalho;

public class Engenheiro extends Funcionario {
    private  String crea;

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "crea='" + crea + '\'' +
                '}';
    }

    public Engenheiro(String crea) {
        this.crea = crea;
    }
}
