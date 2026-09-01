package org.example.zoologico;

public class Vaca implements Animal{
    @Override
    public String emitirsom() {
        return "Muuuuuu!";
    }

    @Override
    public String comer() {
        return "";
    }
}
