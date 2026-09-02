package org.example.empresa;

public class Diretor extends Funcionario{
    private final double PREMIO = 0.2;

    public Diretor(String nome, String datadeNascimento, Sexo sexo, Setor setor, Double salarioBase) {
        super(nome, datadeNascimento, sexo, setor, salarioBase);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void admitirMotoboy(Motoboy motoboy) {


    }

    @Override
    public double getSalarioFinal() {
        double resultado;
        resultado = super.salarioBase + (super.salarioBase* this.PREMIO);
        return resultado;
    }
}
