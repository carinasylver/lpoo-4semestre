package exercicioEmAula.produtoFornecimentoFornecedor.controller;


import exercicioEmAula.produtoFornecimentoFornecedor.model.Fornecedor;
import exercicioEmAula.produtoFornecimentoFornecedor.model.Fornecimento;
import exercicioEmAula.produtoFornecimentoFornecedor.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoFornecimentoFornecedorController {

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
                null
        );


        System.out.println("\na. Faça o programa registrar dois fornecimentos, cada fornecimento para um\n" +
                "produto diferente;");

        /*a. Crie uma classe de exceção do tipo Não Verificada e lance essa exceção quando, ao registrar um Fornecimento,
        o Fornecedor não possuir um número de telefone (ele seja null ou "").
        Faça a lógica necessária para que a aplicação lance a exceção.*/






        try{
            Fornecimento fornecimento1 = new Fornecimento(
                    LocalDate.of(2024, 8, 12),
                    10,
                    produto2.getPrecoDeVenda().multiply(BigDecimal.valueOf(10)),
                    produto2,
                    fornecedor1
            );

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }






    }

}
