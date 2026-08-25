package org.example.Conta_bancaria;

public class Main {
    public static void main(String[] args) {
        Conta_bancaria contaBancaria1 = new Conta_bancaria("Inter", 1444, 14, "Corrente", 1444,1444);

        Funcionário funcionário1 = new Funcionário(1444, "Axor", "Madagascar",719123456, "AxorxL@gmail.com", contaBancaria1);

        System.out.println(" ===== CONTA BANCARIA =====");
        System.out.println(funcionário1.toString());

        



    }
}
