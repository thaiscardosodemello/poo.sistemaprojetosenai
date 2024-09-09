package com.projetosistemagestaoescola.projetosistemagestaoescola;

public class Pessoa {

    public static int contadorMatricula = 1000;

    private int matricula;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Endereco endereco;
    private String telefone;
    private String email;

    //Método Construtor
    public Pessoa(String nome, String cpf, String dataNascimento, Endereco endereco, String telefone, String email) {
        this.matricula = contadorMatricula; 
        contadorMatricula++;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Outros métodos
    public void exibirInformacoes() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco.imprimeEndereco());
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }   

}