package obj3Lista1.produtoFornecedorFornecimento.controller;

import obj3Lista1.produtoFornecedorFornecimento.model.Fornecedor;
import obj3Lista1.produtoFornecedorFornecimento.model.Fornecimento;
import obj3Lista1.produtoFornecedorFornecimento.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoFornecedorFornecimentoController {

    public static void main(String[] args) {

        Produto produto1 = new Produto(
                "123",
                "Produto a",
                "descricao produto a",
                10,
                BigDecimal.valueOf(4.80),
                BigDecimal.valueOf(7.99)
        );
        Produto produto2 = new Produto(
                "456",
                "Produto b",
                "descricao produto b",
                5,
                BigDecimal.valueOf(2.50),
                BigDecimal.valueOf(5.99)
        );

        Fornecedor fornecedor1 = new Fornecedor(
                123456789L,
                "Fornecedor A",
                "xxxxxxxxx",
                "email@email.com",
                "32954258"
        );


        System.out.println("\na. Faça o programa registrar dois fornecimentos, cada fornecimento para um\n" +
                "produto diferente;");

        Fornecimento fornecimento1 = new Fornecimento(
                LocalDate.of(2024, 8, 11),
                5,
                produto1.getPrecoDeVenda().multiply(BigDecimal.valueOf(5)),
                produto1,
                fornecedor1
        );
        Fornecimento fornecimento2 = new Fornecimento(
                LocalDate.of(2024, 8, 12),
                10,
                produto2.getPrecoDeVenda().multiply(BigDecimal.valueOf(10)),
                produto2,
                fornecedor1
        );
        System.out.println(fornecimento1);
        System.out.println(fornecimento2);


        System.out.println("\nb. Imprima o relatório de fornecimentos (todos os fornecimentos realizados),\n" +
                "contendo, os dados do produto, os dados do fornecedor, o total de cada\n" +
                "fornecimento, e o total de todos os fornecimentos;");
        System.out.println("\nRelatório de Fornecimentos:");
        System.out.println(fornecimento1);
        System.out.println(fornecimento2);
        System.out.println("Total de todos os fornecimentos: R$ " +
                fornecimento1.getTotal().add(fornecimento2.getTotal()));


    }

}
