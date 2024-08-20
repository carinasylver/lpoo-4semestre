package model;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public ClientePessoaJuridica(String nome, String sobrenome, String email, int quantidadeDeAcoes, double valorDaAcao, String cnpj) {
        super(nome, sobrenome, email, quantidadeDeAcoes, valorDaAcao);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", quantidadeDeAcoes=" + getQuantidadeDeAcoes() +
                "} ";
    }
}
