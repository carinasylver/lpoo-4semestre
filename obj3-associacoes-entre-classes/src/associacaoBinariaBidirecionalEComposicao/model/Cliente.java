package associacaoBinariaBidirecionalEComposicao.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long id_cliente;
    private String nome;
    private String sobrenome;
    private boolean situacao;

    List<Pedido> pedidos = new ArrayList<>();

    public Cliente(Long id_cliente, String nome, String sobrenome, boolean situacao) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.situacao = situacao;
    }

    public Cliente(Long id_cliente, String nome, String sobrenome, boolean situacao, List<Pedido> pedidos) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.situacao = situacao;
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}
