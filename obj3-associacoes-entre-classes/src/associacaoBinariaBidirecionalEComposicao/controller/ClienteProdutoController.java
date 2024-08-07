package associacaoBinariaBidirecionalEComposicao.controller;

import associacaoBinariaBidirecionalEComposicao.model.Cliente;
import associacaoBinariaBidirecionalEComposicao.model.ItemPedido;
import associacaoBinariaBidirecionalEComposicao.model.Pedido;
import associacaoBinariaBidirecionalEComposicao.model.Produto;

import java.time.LocalDate;

public class ClienteProdutoController {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(
                1L,
                "maria",
                "velleda",
                true
        );
        System.out.println(cliente1);

        Produto produto1 = new Produto(
                1L,
                "arroz",
                "arroz branco",
                10.0,
                true
        );
        System.out.println(produto1);

        Pedido pedido1 = new Pedido(
                1L,
                "cartao",
                "aberto",
                LocalDate.of(2024,8,07),
                LocalDate.of(2024, 8, 07),
                15.0,
                true
        );
        System.out.println(pedido1);

        ItemPedido itemPedido1 = new ItemPedido(
                1L,
                2,
                15.0,
                true,
                produto1,
                pedido1
        );
        System.out.println(itemPedido1);
    }
}
