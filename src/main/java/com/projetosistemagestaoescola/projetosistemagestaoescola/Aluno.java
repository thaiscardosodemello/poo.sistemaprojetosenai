package com.projetosistemagestaoescola.projetosistemagestaoescola;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String nomeResponsavel;
    private String contatoResponsavel;
    private String observacoes;
    private List<Disciplina> disciplinasCursando;
    private List<Nota> notas;
    private int faltas;
    private int presencas;
    private String atestado;

    // Construtor
    public Aluno(String nome, String cpf, String dataNascimento, Endereco endereco, String telefone, 
             String email, String nomeResponsavel, String contatoResponsavel, String observacoes,
             int faltas, int presencas, String atestado) {
    super(nome, cpf, dataNascimento, endereco, telefone, email);
    this.nomeResponsavel = nomeResponsavel;
    this.contatoResponsavel = contatoResponsavel;
    this.observacoes = observacoes;
    this.disciplinasCursando = new ArrayList<>();
    this.notas = new ArrayList<>();
    this.faltas = faltas;
    this.presencas = presencas;
    this.atestado = atestado;
}

    // Getters e Setters
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getContatoResponsavel() {
        return contatoResponsavel;
    }

    public void setContatoResponsavel(String contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<Disciplina> getDisciplinasCursando() {
        return disciplinasCursando;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinasCursando.add(disciplina);
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void addNota(Nota nota) {
        this.notas.add(nota);
    }

    public int getFaltas() {
        return faltas;
    }

    public void registrarFalta() {
        this.faltas++;
    }

    public int getPresencas() {
        return presencas;
    }

    public void registrarPresenca() {
        this.presencas++;
    }

    public String getAtestado() {
        return atestado;
    }

    public void emitirAtestado(String novoAtestado) {
        this.atestado = novoAtestado;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("========== Informações da Aluno ==========");
        super.exibirInformacoes();

        System.out.println("Nome do Responsável: " + nomeResponsavel);
        System.out.println("Contato do Responsável: " + contatoResponsavel);
        System.out.println("Outras Observações: " + observacoes);
        System.out.println("Faltas: " + faltas);
        System.out.println("Presenças: " + presencas);
        System.out.println("Atestado: " + atestado);
        
        System.out.println("Disciplinas Cursando:");
        for (Disciplina disciplina : disciplinasCursando) {
            System.out.println("  - " + disciplina.getNomeDisciplina());
        }
        
        System.out.println("Notas:");
        for (Nota nota : notas) {
            System.out.println("  - " + nota);
        }
    }
}