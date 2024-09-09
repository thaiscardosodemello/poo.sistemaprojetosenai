package com.projetosistemagestaoescola.projetosistemagestaoescola;

public class Endereco {
    public static int contadorId = 1;

    private int id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    // Método Construtor
    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.id = contadorId++;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String imprimeEndereco() {
        return logradouro + ", " + numero + (complemento.isEmpty() ? "" : " - " + complemento) + ", " + bairro + ", " + cidade + " - " + estado + ", CEP: " + cep;
    }

    // void imprimeEndereco() {
    //     System.out.println(this.logradouro);
    //     System.out.println(this.numero);
    //     System.out.println(this.complemento);
    //     System.out.println(this.bairro);
    //     System.out.println(this.cidade);
    //     System.out.println(this.estado);
    //     System.out.println(this.cep);
    // }
}