package com.projetosistemagestaoescola.projetosistemagestaoescola;

public class Professor extends Funcionario {
    //add disciplinas

    public Professor(String nome, String cpf, String dataNascimento, Endereco endereco, String telefone, String email, String atestado, int faltasRegistradas, int presencasRegistradas) {
        super(nome, cpf, dataNascimento, endereco, telefone, email, atestado, faltasRegistradas, presencasRegistradas);
        //this.disciplinas..
    }

    //Incluir métodos para inserir e remover as disciplinas

    @Override
    public void exibirInformacoes() {
        System.out.println("========== Informações da Professor ==========");
        super.exibirInformacoes();
        //+ adicionar as disciplinas que ele leciona aqui
    }
}