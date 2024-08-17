package lista1.exer1CriacaoClassesMetodosInstanciacaoObjetosEncapsulamento.model;

public class Produto {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;

    //METODO CONSTRUTOR PADRÃO OU VAZIO(1Ci)
    public Produto() {
    }
    //METODO CONSTRUTOR PARAMETRIZADO
    public Produto(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    //METODOS ACESSORES sao usados sempre q usar o private, com public nao uso.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //METODO UTILITARIO(CONVERTE OBJETO EM STRING) 1iv
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                '}';
    }
}
