package associacaoBinariaBidirecionalEComposicao.model;

public class Produto {
    private Long id_produto;
    private String nome;
    private String descricao;
    private Double valor;
    private boolean situacao;

    private ItemPedido itemPedido;

    public Produto(Long id_produto, String nome, String descricao, Double valor, boolean situacao) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.situacao = situacao;
    }

    public Produto(Long id_produto, String nome, String descricao, Double valor, boolean situacao, ItemPedido itemPedido) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.situacao = situacao;
        this.itemPedido = itemPedido;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id_produto=" + id_produto +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", situacao=" + situacao +
                '}';
    }
}
