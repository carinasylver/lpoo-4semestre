package obj3Lista1.alunoDisciplina.model;

import java.util.ArrayList;
import java.util.List;

/*associaçao do tipo agreagação*/

public class Aluno {
    private Long matricula;
    private String nome;
    private String sobrenome;

    //ligaçao entre Aluno e Disciplina
    List<Disciplina> disciplinas = new ArrayList<>();

    //contrutor
    public Aluno(Long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //contrutor
    public Aluno(Long matricula, String nome, String sobrenome, List<Disciplina> disciplinas) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.disciplinas = disciplinas;
    }

    //metodos acessores
    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
