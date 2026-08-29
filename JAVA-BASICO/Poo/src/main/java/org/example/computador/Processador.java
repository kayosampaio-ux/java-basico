package org.example.computador;

public class Processador extends Componentes {
    private String potenciaemmhz;

    @Override
    public String toString() {
        return "Processador{" +
                "potenciaemmhz='" + potenciaemmhz + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getPotenciaemmhz() {
        return potenciaemmhz;
    }

    public void setPotenciaemmhz(String potenciaemmhz) {
        this.potenciaemmhz = potenciaemmhz;
    }

    public Processador(String marca, String modelo, String potenciaemmhz) {
        super(marca, modelo);
        this.potenciaemmhz = potenciaemmhz;
    }
}
