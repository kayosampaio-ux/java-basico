package org.example.zoologico;

public class Cagado implements  Animal{
    @Override
    public String emitirsom() {
        return "Ahh";
    }

    @Override
    public String comer() {
        return "";
    }
}
