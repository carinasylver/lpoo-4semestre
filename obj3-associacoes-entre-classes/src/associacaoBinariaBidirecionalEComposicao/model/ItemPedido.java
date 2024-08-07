package associacaoBinariaBidirecionalEComposicao.model;

public class ItemPedido {
    private Long id_itemPedido;
    private Integer quantidade;
    private Double totalItem;
    private boolean situacao;

    //relacao entre itemPedido e produto
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(Long id_itemPedido, Integer quantidade, Double totalItem, boolean situacao, Produto produto, Pedido pedido) {
        this.id_itemPedido = id_itemPedido;
        this.quantidade = quantidade;
        this.totalItem = totalItem;
        this.situacao = situacao;
        this.produto = produto;
        this.pedido = pedido;
    }
}
