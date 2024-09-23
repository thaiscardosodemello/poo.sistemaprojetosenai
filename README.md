<p align="center">
   <img height="200px" src="https://raw.githubusercontent.com/thaiscardosodemello/serratec.residenciatic/main/assets/logoSistemaGestaoEscola.jpg" alt="Sistema Gestão Escola"/>
</p>

# EscolaSenai

O projeto **EscolaSenai** é um sistema desenvolvido para a disciplina de Programação Orientada a Objetos (POO), que visa gerenciar as atividades pedagógicas em uma instituição de ensino. O sistema permite a administração de alunos, professores, disciplinas e notas, facilitando a organização e acompanhamento das atividades acadêmicas.

## Entrega

### Critérios

Para a primeira entrega, o projeto deve atender aos seguintes critérios:

1. **Estruturar o Projeto**:
   - Organizar as classes necessárias para o funcionamento do sistema.
   - Definir os relacionamentos e heranças entre as classes com base nos conceitos aprendidos.

2. **Classes Principais**:
   - **Aluno**: Representa um estudante da instituição, incluindo informações como nome, CPF, data de nascimento, endereço, e as disciplinas que o aluno está cursando.
   - **Professor**: Representa um docente da instituição, incluindo informações como nome, CPF, data de nascimento, endereço, e as disciplinas que o professor leciona.
   - **Disciplina**: Representa uma matéria ou curso oferecido pela instituição, incluindo informações como nome, carga horária e o professor responsável.
   - **Nota**: Representa a avaliação de um aluno em uma disciplina específica, incluindo a nota, a data da avaliação e o aluno avaliado.

3. **Herança**:
   - **Pessoa**: Classe base para `Aluno` e `Professor`, contendo atributos e métodos comuns, como nome, CPF, data de nascimento e endereço.

4. **Construtores**:
   - Todos os construtores devem implementar as regras de negócio necessárias para garantir a integridade dos dados.

5. **Relacionamentos Entre Classes**:
   - **Aluno** e **Disciplina**: Um aluno pode cursar várias disciplinas e uma disciplina pode ter vários alunos.
   - **Disciplina** e **Professor**: Uma disciplina é lecionada por um professor, e um professor pode lecionar várias disciplinas.
   - **Aluno** e **Nota**: Um aluno pode ter várias notas, cada uma associada a uma disciplina.

## Estrutura do Projeto

### Classes

1. **Pessoa**
   - Atributos: `nome`, `cpf`, `dataNascimento`, `endereco`, `telefone`, `email`
   - Métodos: Construtores, getters, setters, `exibirInformacoes`

2. **Aluno** (extends `Pessoa`)
   - Atributos: `nomeResponsavel`, `contatoResponsavel`, `observacoes`, `disciplinasCursando`, `notas`, `faltas`, `presencas`, `atestado`
   - Métodos: Construtores, getters, setters, `addDisciplina`, `addNota`, `registrarFalta`, `registrarPresenca`, `emitirAtestado`, `exibirInformacoes`

3. **Professor** (extends `Pessoa`)
   - Atributos: `disciplinas`, `faltas`, `presencas`
   - Métodos: Construtores, getters, setters, `registrarFalta`, `registrarPresenca`, `exibirInformacoes`

4. **Disciplina**
   - Atributos: `idCodigo`, `nomeDisciplina`, `cargaHoraria`, `professor`, `alunos`, `notas`
   - Métodos: Construtores, getters, setters, `addAluno`, `addNota`, `toString`

5. **Nota**
   - Atributos: `disciplina`, `notaDisciplina`, `diaNota`, `aluno`
   - Métodos: Construtores, getters, setters, `toString`

<p align="center">
   <img src="https://raw.githubusercontent.com/thaiscardosodemello/serratec.residenciatic/main/assets/Projeto%20Sistema%20Escola%20SENAI.jpg" alt="Sistema Gestão Escola Escopo"/>
</p>

<br/>
<table align="center">
    <tr>
    <td align="center">
      <a href="https://github.com/OBRETAS15">
        <img src="https://avatars.githubusercontent.com/u/166236892?v=4" width="100px;" alt="Avatar Odair Bretas"/><br>
        <sub>
          <b>Odair Bretas</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/thaiscardosodemello">
        <img src="https://avatars.githubusercontent.com/u/14929797?v=4" width="100px;" alt="Avatar Thais Cardoso"/><br>
        <sub>
          <b>Thais Cardoso</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/thaissan">
        <img src="https://avatars.githubusercontent.com/u/86802712?v=4" width="100px;" alt="Avatar Thais Santos"/><br>
        <sub>
          <b>Thais Santos</b>
        </sub>
      </a>
    </td>
</table>

</br>

## ✨ Tecnologia Utilizada

Para o desenvolvimento dos projetos, foram utilizadas as seguintes ferramentas:

🟣 **[VSCode](https://code.visualstudio.com)** [Documentação](https://code.visualstudio.com/docs)</br>
🟣 **[Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)**</br>
🟣 **[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)**</br>
