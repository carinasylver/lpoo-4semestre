package obj3Lista1.alunoDisciplina.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Long codigo;
    private String nome;

    //ligaçao entre Disciplina e Aluno
    List<Aluno> alunos = new ArrayList<>();

    //metodo construtor
    public Disciplina(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    //metodo construtor
    public Disciplina(Long codigo, String nome, List<Aluno> alunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = alunos;
    }

    //metodos acessores
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
