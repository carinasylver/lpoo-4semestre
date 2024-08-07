package agregacao.model.atletaTime;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private long id;
    private String nome;
    private String uf;

    List<Atleta> atletas = new ArrayList<>();

    public Time(long id, String nome, String uf) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
    }

    public Time(long id, String nome, String uf, List<Atleta> atletas) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.atletas = atletas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    @Override
    public String toString() {
        return "\nTime{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                ", atletas=" + atletas +
                '}';
    }
}
