package com.projetosistemagestaoescola.projetosistemagestaoescola;

public class Funcionario extends Pessoa {
    private String atestado;
    private int faltasRegistradas;
    private int presencasRegistradas;

    //método construtor
    public Funcionario(String nome, String cpf, String dataNascimento, Endereco endereco, String telefone, String email, String atestado, int faltasRegistradas, int presencasRegistradas) {
        super(nome, cpf, dataNascimento, endereco, telefone, email);
        this.atestado = atestado;
        this.faltasRegistradas = faltasRegistradas;
        this.presencasRegistradas = presencasRegistradas;
    }

    //outros métodos
    public void registrarFalta() {
        faltasRegistradas++;
        System.out.println("Falta registrada. Total de faltas: " + faltasRegistradas);
    }

    public void registrarPresenca() {
        presencasRegistradas++;
        System.out.println("Presença registrada. Total de presenças: " + presencasRegistradas);
    }

    public void emitirAtestado(String novoAtestado) {
        this.atestado = novoAtestado;
        System.out.println("Novo atestado emitido: " + atestado);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Atestado: " + atestado);
        System.out.println("Faltas Registradas: " + faltasRegistradas);
        System.out.println("Presenças Registradas: " + presencasRegistradas);
    }

    //getters e setters
    public String getAtestado() {
        return atestado;
    }

    public void setAtestado(String atestado) {
        this.atestado = atestado;
    }

    public int getFaltasRegistradas() {
        return faltasRegistradas;
    }

    public void setFaltasRegistradas(int faltasRegistradas) {
        this.faltasRegistradas = faltasRegistradas;
    }

    public int getPresencasRegistradas() {
        return presencasRegistradas;
    }

    public void setPresencasRegistradas(int presencasRegistradas) {
        this.presencasRegistradas = presencasRegistradas;
    }
    
}