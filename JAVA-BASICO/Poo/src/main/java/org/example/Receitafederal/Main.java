package org.example.Receitafederal;

public class Main {
    public static void main(String[] args) {
        Fisica fisica1 = new Fisica("Ramon", "71999123451", "123456789-10", "1234567891011", "30/05/2007");
        Juridica juridica1 = new Juridica("Rarvey", "71999231121", "0101923929120-9", "123RU");

        System.out.println(fisica1.toString());
        System.out.println(juridica1.toString());
    }
}
