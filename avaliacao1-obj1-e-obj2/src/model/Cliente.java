package model;

public abstract class Cliente implements Socio{
    protected String nome;
    protected String sobrenome;
    protected String email;
    private int quantidadeDeAcoes;
    private double valorDaAcao;

    //construtor vazio
    public Cliente() {
    }

    //CONSTRUTOR PARAMETRIZADO
    public Cliente(String nome, String sobrenome, String email, int quantidadeDeAcoes, double valorDaAcao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.quantidadeDeAcoes = quantidadeDeAcoes;
        this.valorDaAcao = valorDaAcao;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getQuantidadeDeAcoes() {
        return quantidadeDeAcoes;
    }

    public void setQuantidadeDeAcoes(int quantidadeDeAcoes) {
        this.quantidadeDeAcoes = quantidadeDeAcoes;
    }

    @Override
    public double getValorDaAcao() {
        return valorDaAcao;
    }

    public void setValorDaAcao(double valorDaAcao) {
        this.valorDaAcao = valorDaAcao;
    }
}
