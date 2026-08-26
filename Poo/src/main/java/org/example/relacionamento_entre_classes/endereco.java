package org.example.relacionamento_entre_classes;

public class endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidade;

    @Override
    public String toString() {
        return "endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", unidadeFederativa=" + unidadeFederativa +
                '}';
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Unidade_federativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(Unidade_federativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public endereco(String logradouro, int numero, String complemento, String cep, String cidade, Unidade_federativa unidadeFederativa) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
    }

    private Unidade_federativa unidadeFederativa;

}
