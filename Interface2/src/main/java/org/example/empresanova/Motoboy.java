package org.example.empresanova;

public class Motoboy extends Fucionario {
    private String placaDaMoto;

    @Override
    public double obterSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }
}

