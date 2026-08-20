package org.example;

public class biblioteca {
    private String titulo;
    private String Autor ;
    private int Numero_de_pagina;
    private float preco;


    public biblioteca(String titulo, String autor, int numero_de_pagina, float preco) {
        this.titulo = titulo;
        Autor = autor;
        Numero_de_pagina = numero_de_pagina;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumero_de_pagina() {
        return Numero_de_pagina;
    }

    public void setNumero_de_pagina(int numero_de_pagina) {
        Numero_de_pagina = numero_de_pagina;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
