package org.example.empresa;

public class Motoboy extends Funcionario {
    private String  CarteiraDeHabilitacao;

    @Override
    public String toString() {
        return "Motoboy{" +
                "CarteiraDeHabilitacao='" + CarteiraDeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.getSalarioFinal() +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    public String getCarteiraDeHabilitacao() {
        return CarteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        CarteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public Motoboy(String nome, String datadeNascimento, Sexo sexo, Setor setor, Double salarioBase, String carteiraDeHabilitacao) {
        super(nome, datadeNascimento, sexo, setor, salarioBase);
        CarteiraDeHabilitacao = carteiraDeHabilitacao;
    }
}
