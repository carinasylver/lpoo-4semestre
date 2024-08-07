package associacaoBinariaBidirecionalEComposicao.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Long id_pedido;
    private String formaPagamento;
    private String estado;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private Double totalPedido;
    private boolean situacao;

    List<ItemPedido> itensPedido = new ArrayList<>();

    public Pedido(Long id_pedido, String formaPagamento, String estado, LocalDate dataCriacao, LocalDate dataModificacao, Double totalPedido, boolean situacao) {
        this.id_pedido = id_pedido;
        this.formaPagamento = formaPagamento;
        this.estado = estado;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
        this.totalPedido = totalPedido;
        this.situacao = situacao;
    }

    public Pedido(Long id_pedido, String formaPagamento, String estado, LocalDate dataCriacao, LocalDate dataModificacao, Double totalPedido, boolean situacao, List<ItemPedido> itensPedido) {
        this.id_pedido = id_pedido;
        this.formaPagamento = formaPagamento;
        this.estado = estado;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
        this.totalPedido = totalPedido;
        this.situacao = situacao;
        this.itensPedido = itensPedido;
    }
}
