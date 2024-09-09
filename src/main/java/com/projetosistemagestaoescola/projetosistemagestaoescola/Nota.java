package com.projetosistemagestaoescola.projetosistemagestaoescola;

import java.util.Date;

public class Nota {
    private Disciplina disciplina;
    private double notaDisciplina;
    private Date diaNota;
    private Aluno aluno;

    // Construtor
    public Nota(Disciplina disciplina, double notaDisciplina, Date diaNota, Aluno aluno) {
        this.disciplina = disciplina;
        this.notaDisciplina = notaDisciplina;
        this.diaNota = diaNota;
        this.aluno = aluno;
    }

    // Getters e Setters
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNotaDisciplina() {
        return notaDisciplina;
    }

    public void setNotaDisciplina(double notaDisciplina) {
        this.notaDisciplina = notaDisciplina;
    }

    public Date getDiaNota() {
        return diaNota;
    }

    public void setDiaNota(Date diaNota) {
        this.diaNota = diaNota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Nota de " + aluno.getNome() + " na disciplina " + disciplina.getNomeDisciplina() +
               ": " + notaDisciplina + " (Data: " + diaNota.toString() + ")";
    }
}