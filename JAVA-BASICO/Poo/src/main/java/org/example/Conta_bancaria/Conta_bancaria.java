package org.example.Conta_bancaria;

public class Conta_bancaria {
    private String banco;
    private int agencia;
    private int numero_da_conta;

    public String getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "Conta_bancaria{" +
                "banco='" + banco + '\'' +
                ", agencia=" + agencia +
                ", numero_da_conta=" + numero_da_conta +
                ", tipo_da_conta='" + tipo_da_conta + '\'' +
                ", saldo_atual=" + saldo_atual +
                ", limite_disponivel=" + limite_disponivel +
                '}';
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(int numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }

    public String getTipo_da_conta() {
        return tipo_da_conta;
    }

    public void setTipo_da_conta(String tipo_da_conta) {
        this.tipo_da_conta = tipo_da_conta;
    }

    public double getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(double saldo_atual) {
        this.saldo_atual = saldo_atual;
    }

    public double getLimite_disponivel() {
        return limite_disponivel;
    }

    public void setLimite_disponivel(double limite_disponivel) {
        this.limite_disponivel = limite_disponivel;
    }

    public Conta_bancaria(String banco, int agencia, int numero_da_conta, String tipo_da_conta, double saldo_atual, double limite_disponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numero_da_conta = numero_da_conta;
        this.tipo_da_conta = tipo_da_conta;
        this.saldo_atual = saldo_atual;
        this.limite_disponivel = limite_disponivel;
    }

    private String tipo_da_conta;
    private  double saldo_atual;
    private double limite_disponivel;

}
