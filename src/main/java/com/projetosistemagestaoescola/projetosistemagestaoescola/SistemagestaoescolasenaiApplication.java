package com.projetosistemagestaoescola.projetosistemagestaoescola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SistemagestaoescolasenaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemagestaoescolasenaiApplication.class, args);

		// Criar Endereço
        Endereco endereco = new Endereco("Rua1", "201", "A", "Cascatinha", "Petropolis", "RJ", "25525-561");
        
        // Criar Pessoa
        Pessoa pessoa = new Pessoa("Carlos Silva", "123.456.789-00", "01/01/1980", endereco, "1234-5678", "carlos.silva@email.com");
        pessoa.exibirInformacoes();

        // Criar Professor
        Professor professor = new Professor("Arthur Lima", "255.122.556-88", "15/05/1975", endereco, "2222-2222", "arthur.lima@email.com", null, 5, 10);
        professor.registrarFalta();
        professor.exibirInformacoes();

        // Criar Aluno
        Aluno aluno = new Aluno("João Pereira", "111.222.333-44", "22/02/2000", endereco, "3333-4444", "joao.pereira@email.com", 
                        "Maria Pereira", "3333-5555", "Nenhuma observação.", 0, 0, ""); // Adicione os parâmetros adicionais

        // Criar Disciplina
        Disciplina disciplina = new Disciplina(1, "Matemática", 60, professor);
        aluno.addDisciplina(disciplina);

        // Criar Nota
        Nota nota = new Nota(disciplina, 9.5, new Date(), aluno);
        aluno.addNota(nota);
		
        // Registrar faltas e presenças
        aluno.registrarFalta();
        aluno.registrarPresenca();
        aluno.emitirAtestado("Atestado de Enfermaria");

        // Exibir informações do aluno
        aluno.exibirInformacoes();
        
        // Exibir informações da disciplina
        System.out.println("Informações da Disciplina:");
        System.out.println("Código: " + disciplina.getIdCodigo());
        System.out.println("Nome: " + disciplina.getNomeDisciplina());
        System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
        System.out.println("Professor: " + professor.getNome());

	}
}