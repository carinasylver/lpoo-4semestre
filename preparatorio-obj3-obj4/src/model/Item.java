package model;

import java.math.BigDecimal;

public class Item {
    private Integer quantidade;
    private BigDecimal total;

    //ligacao entre Item e Pedido
    //private Pedido pedido;

    //ligacao entre Item e Produto
    private Produto produto;

    //ligacao entre Item e Situacao
    private Situacao situacao;

//    public Item(Integer quantidade, BigDecimal total, Pedido pedido, Produto produto, Situacao situacao) {
//        this.quantidade = quantidade;
//        this.total = total;
//        this.pedido = pedido;
//        this.produto = produto;
//        this.situacao = situacao;
//    }


    public Item(Integer quantidade, BigDecimal total, Produto produto, Situacao situacao) {
        this.quantidade = quantidade;
        this.total = total;
        this.produto = produto;
        this.situacao = situacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

//    public Pedido getPedido() {
//        return pedido;
//    }
//
//    public void setPedido(Pedido pedido) {
//        this.pedido = pedido;
//    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "quantidade=" + quantidade +
                ", total=" + total +
                //", pedido=" + pedido +
                ", produto=" + produto +
                ", situacao=" + situacao +
                '}';
    }
}
