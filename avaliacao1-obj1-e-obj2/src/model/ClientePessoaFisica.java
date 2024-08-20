package model;

public class ClientePessoaFisica extends Cliente {
    private String cpf;

    public ClientePessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public ClientePessoaFisica(String nome, String sobrenome, String email, int quantidadeDeAcoes, double valorDaAcao, String cpf) {
        super(nome, sobrenome, email, quantidadeDeAcoes, valorDaAcao);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", valorDaAcao=" + getValorDaAcao() +
                "} ";
    }
}
