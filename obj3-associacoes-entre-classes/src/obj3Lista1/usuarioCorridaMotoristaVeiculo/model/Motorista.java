package obj3Lista1.usuarioCorridaMotoristaVeiculo.model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private String email;
    private String telefone;

    //relação entre motorista e corrida
    List<Corrida> corridas = new ArrayList<>();

    //relaçao entre motorista e veiculo
    private Veiculo veiculo;

    public Motorista(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Motorista(String nome, String email, String telefone, Veiculo veiculo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "\nMotorista{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculo=" + veiculo +
                '}';
    }
}
