package controller;

import exception.EstoqueInsuficiente;
import model.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static model.Regiao.Sul;
import static model.Situacao.Ativo;

public class EcommerceController {
    public static void main(String[] args) {
        //c. Faça a aplicação realizar um pedido. Um pedido compreende:

        //c.i. Registrar o Vendedor, os Produtos, e o Carrinho (uma lista de Item)
        //i.cadastro vendedor
        Vendedor vendedor1 = new Vendedor(
                1L,
                "João Ricardo Soares",
                "joaoR@email.com",
                "123456789",
                BigDecimal.valueOf(3000), //salario
                0.05, //taxa de comissao
                Sul
        );
        System.out.println(vendedor1);

        //i.cadastra fornecedor
        Fornecedor fornecedor1 = new Fornecedor(
                "12340001-12",
                "Fornecedor A",
                "fornecedorA@email.com",
                "5332587422",
                null
        );
        System.out.println(fornecedor1);
        //i.cadastro produtos

        Produto produto1 = new Produto(
                UUID.randomUUID().toString(),
                "bermuda",
                "Bermuda de musculação",
                100,
                BigDecimal.valueOf(29.90), //preco de custo
                BigDecimal.valueOf(49.90), //preco de venda
                List.of(fornecedor1)
        );
        System.out.println(produto1);

        Produto produto2 = new Produto(
                UUID.randomUUID().toString(),
                "camisa",
                "Camisa social",
                100,
                BigDecimal.valueOf(39.90), //preco de custo
                BigDecimal.valueOf(59.90), //preco de venda
                List.of(fornecedor1)
        );
        System.out.println(produto2);

        //i.cria o carrinho
        List<Item> itens = new ArrayList<>();

        //add itens ao carrinho
        Item item1 = new Item(
                2,
                produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(2)), //calcula o preco total do item
                produto1,
                Ativo
        );
        Item item2 = new Item(
                1,
                produto2.getPrecoDeVenda().multiply(BigDecimal.valueOf(1)),
                produto2,
                Ativo
        );
        System.out.println(item1);
        System.out.println(item2);

        itens.add(item1);
        itens.add(item2);

        //soma os itens do carrinho
        BigDecimal acum1TotalCarrinho = BigDecimal.ZERO;
        for(Item i : itens) {
            acum1TotalCarrinho = acum1TotalCarrinho.add(i.getTotal());
        }
        System.out.println("----total itens carrinho: "+ acum1TotalCarrinho);

        //(iii) baixa o estoque
        Produto.baixarEstoque(itens);
        //Produto.baixarEstoqueComException(itens);
        System.out.println("\n-----itens em estoque");
        System.out.println("produto1: "+ produto1.getEstoque() + "unidades em estoque");
        System.out.println("produto2: " +produto2.getEstoque() + "unidades em estoque");


        /*ii. Registrar os detalhes de Pedido, como, número do pedido, total do pedido e a data do
        pedido;*/

        Pedido pedido1 = new Pedido(
                UUID.randomUUID().toString(), //numero do pedido
                LocalDateTime.now(),
                BigDecimal.valueOf(29.90), //total
                vendedor1,
                Estado.Aberto,
                itens //list de Item

        );
        //System.out.println("pedido1: " + pedido1);


         /*iv. Imprimir o Pedido com seus detalhes, como, os Itens, o total de cada Item, o total do
            Pedido, e os demais atributos do Pedido;*/

        System.out.print("\n---------- Detalhes do Pedido " + pedido1.getNumero() + " ----------");
        //System.out.println(pedido1);
        System.out.println("\nitens do Pedido: " + pedido1.getItens());
        for (Item item : pedido1.getItens()) {
            System.out.println("total do item " + item.getProduto().getNome() + ": " +
                    NumberFormat.getCurrencyInstance().format(item.getTotal()));
        }
        System.out.println("Data do Pedido: " + DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm").format(pedido1.getData()));
        System.out.println("Estado do Pedido: " + pedido1.getEstado());
        System.out.println("Vendedor: " + pedido1.getVendedor().getNomeCompleto());
        System.out.println("=======> Total do Pedido = "
                + NumberFormat.getCurrencyInstance().format(acum1TotalCarrinho));
        System.out.println("==============================================");

        itens.clear(); //limpa o carrinho

         /*d. Faça a aplicação realizar outro pedido, no mesmo formato, variando apenas a quantidade
        de cada Item;*/

        //adiciona itens ao carrinho
        Item item3 = new Item(
                2,
                produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(2)), //calcula o preco total do item
                produto1,
                Ativo
        );
        Item item4 = new Item(
                1,
                produto2.getPrecoDeVenda().multiply(BigDecimal.valueOf(1)),
                produto2,
                Ativo
        );
        itens.add(item3);
        itens.add(item4);

        BigDecimal acum2TotalCarrinho = BigDecimal.ZERO;
        for(Item i : itens) {
            acum2TotalCarrinho = acum2TotalCarrinho.add(i.getTotal());
        }
        System.out.println("----total itens carrinho: "+ acum2TotalCarrinho);


        Pedido pedido2 = new Pedido(
                UUID.randomUUID().toString(), //numero do pedido
                LocalDateTime.now(),
                BigDecimal.valueOf(29.90), //total
                vendedor1,
                Estado.Aberto,
                itens //list de Item
        );

        /*e. Faça a aplicação registrar os dois pedidos (os realizados nos itens c e d) em uma coleção de
        pedidos;*/
        List<Pedido> pedidosRealizados = new ArrayList<>();
        pedidosRealizados.add(pedido1);
        pedidosRealizados.add(pedido2);
        System.out.println("\n---pedidos realizados" + pedidosRealizados);

        /*f. Faça o programa imprimir o Relatório de Vendas, isto é, todos os pedidos realizados, bem
        como, o total de vendas;*/
        BigDecimal totalVendas = BigDecimal.ZERO;
        for (Pedido p : pedidosRealizados) {
            totalVendas = totalVendas.add(p.getTotal());
        }
        System.out.println("\n----Total de vendas: " + NumberFormat.getCurrencyInstance().format(totalVendas));

        //gabarito prof
//        System.out.print("\n------ Relatório de Vendas ------");
//        double totalDasVendas = pedidosRealizados.stream() //1. crie um fluxo para a coleção
//                .mapToDouble(p -> p.getTotal().doubleValue()) //2. passe cada objeto para double
//                .sum(); //3. some e devolva o resultado
//        pedidosRealizados.forEach(System.out::println);
//        System.out.println("=====> Total das Vendas= " + NumberFormat.getCurrencyInstance().format(totalDasVendas));

       /* g. Faça o programa realizar a entrada de produtos no estoque. Garanta que o programa registre,
                o Fornecedor, o Fornecimento, e o Produto, bem como, atualize o estoque. Imprima a nova
        posição de estoque;*/

        System.out.println("\n------ Fornecimento de produtos ------");
        //registra o fornecimento do produto1
        Fornecimento fornecimento1 = new Fornecimento(
                LocalDateTime.now(),
                100,
                produto1.getPrecoDeCusto().multiply(BigDecimal.valueOf(100)),
                produto1,
                fornecedor1
        );
        //atualiza o estoque
        Produto.atualizaEstoque(fornecimento1);
        System.out.print("\nFornecimento registrado:\n");
        System.out.println("Fornecedor: " + fornecedor1.getRazaoSocial());
        System.out.println("Produto: "+ fornecimento1.getProduto().getNome() + "\nestoque atualizado= " + fornecimento1.getProduto().getEstoque() + " unidades");


        Fornecimento fornecimento2 = new Fornecimento(
                LocalDateTime.now(),
                50,
                produto2.getPrecoDeCusto().multiply(BigDecimal.valueOf(50)),
                produto2,
                fornecedor1
        );
        //atualiza o estoque
        Produto.atualizaEstoque(fornecimento2);
        System.out.print("\nFornecimento registrado:\n");
        System.out.println("Fornecedor: " + fornecedor1.getRazaoSocial());
        System.out.println("Produto: "+ fornecimento2.getProduto().getNome() + "\nestoque atualizado= " + fornecimento2.getProduto().getEstoque() + " unidades");

        /*h. Faça o programa registrar os fornecimentos em uma coleção de Fornecimento. Depois, faça
        o programa imprimir o Relatório de Fornecimentos, isto é, todos os fornecimentos
        realizados, bem como, o total fornecido;*/
        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        fornecimentos.add(fornecimento2);

        System.out.println("\n------ Relatório de Fornecimentos ------");
        BigDecimal totalFornecido = BigDecimal.ZERO;
        for (Fornecimento f : fornecimentos) {
            totalFornecido = totalFornecido.add(f.getTotal());
        }
        fornecimentos.forEach(System.out::println);
        System.out.println("=====> Total fornecido= " + NumberFormat.getCurrencyInstance().format(totalFornecido));


        //gabarito prof
//        System.out.print("------ Relatório de Fornecimentos de Produtos ------");
//        //cria a coleção com os fornecimentos
//
//        double totalDosFornecimentos = fornecimentos.stream() //1. crie um fluxo para a coleção
//                .mapToDouble(p -> p.getTotal().doubleValue()) //2. passe cada objeto para double
//                .sum(); //3. some e devolva o resultado
//        fornecimentos.forEach(System.out::println);
//        System.out.println("=====> Total dos Fornecimentos= " + NumberFormat.getCurrencyInstance().format(totalDosFornecimentos));

       /* i. Crie uma classe de Exceção, a classe EstoqueInsuficiente, que emita a seguinte mensagem
        de exceção “Estoque Insuficiente”, e faça o programa lançar essa exceção, ao baixar o
        estoque, toda vez que a quantidade de produto for insuficiente.*/

        /*
            Por questão didática, aqui foi implementado outro método que baixa o estoque, onde pode ser lançada uma exceção.
         */

        //Repete os passos para emissão de um pedido
        itens.clear(); //limpa o carrinho

        //adiciona os itens ao carrinho
        Item i1 = new Item(
                1500,
                produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(1500)),
                produto1,
                Ativo);
        itens.add(i1);

        Item i2= new Item(
                15,
                produto2.getPrecoDeVenda().multiply(BigDecimal.valueOf(15)),
                produto2,
                Ativo);
        //fecha o pedido e baixa o estoque
        itens.add(i2);

        BigDecimal acum3TotalCarrinho = BigDecimal.ZERO;
        for(Item i : itens) {
            acum2TotalCarrinho = acum2TotalCarrinho.add(i.getTotal());
        }

        try { //tenta executar
            Produto.baixarEstoqueComException(itens); //vai lança a exceção aqui, antes de registrar um pedido
        } catch (EstoqueInsuficiente e) { //se lançar uma exceção a captura aqui
            e.printStackTrace(); //imprime a pilha de exceção
        } finally { //sempre apresenta o estoque atualizado
            System.out.println("Estoque atualizado:");
            System.out.print(
                    """
                    Note que o produto 1 não foi baixado, pois lançou a exceção EstoqueInsuficiente,
                    e o produto2, que tem estoque suficiente, também não foi baixado o estoque, pois a execução
                    do programa parou ao encontrar estoque insuficiente no Arroz.
                    """
            );
            itens.forEach(i -> System.out.print(i.getProduto()));
            System.out.println();
        }
        //aqui continuaria o restante do algoritmo para realiza um Pedido. Porém, a exceção para a execução do programa.
    }
}
