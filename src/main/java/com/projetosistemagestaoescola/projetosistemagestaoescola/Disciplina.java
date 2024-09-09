package com.projetosistemagestaoescola.projetosistemagestaoescola;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private int idCodigo;
    private String nomeDisciplina;
    private int cargaHoraria;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Nota> notas;

    // Construtor
    public Disciplina(int idCodigo, String nomeDisciplina, int cargaHoraria, Professor professor) {
        this.idCodigo = idCodigo;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    // Getters e Setters
    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void addNota(Nota nota) {
        this.notas.add(nota);
    }

    @Override
    public String toString() {
        return "Disciplina [idCodigo=" + idCodigo + ", nomeDisciplina=" + nomeDisciplina +
               ", cargaHoraria=" + cargaHoraria + ", professor=" + professor.getNome() + "]";
    }
}