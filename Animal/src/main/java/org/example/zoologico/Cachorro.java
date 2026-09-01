package org.example.zoologico;

public class Cachorro implements Animal{
    @Override
    public String emitirsom() {
        return "AuAu!!!";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
