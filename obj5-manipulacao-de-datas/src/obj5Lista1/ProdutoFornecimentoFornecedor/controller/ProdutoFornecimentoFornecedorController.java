package obj5Lista1.ProdutoFornecimentoFornecedor.controller;

import obj5Lista1.ProdutoFornecimentoFornecedor.model.Fornecedor;
import obj5Lista1.ProdutoFornecimentoFornecedor.model.Fornecimento;
import obj5Lista1.ProdutoFornecimentoFornecedor.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProdutoFornecimentoFornecedorController {
    public static void main(String[] args) {
        /*     i. Para o diagrama Produto-Fornecedor-Fornecimento (para todos os fornecimentos considere
         *     o preço de custo de cada produto R$ 10,00 e a quantidade fornecida 100 unidades, o estoque
         *     de produto inicial 0, e um único produto de um mesmo fornecedor.):
         */

        Produto produto1 = new Produto(
                "123",
                "Produto a",
                "descricao produto a",
                100,
                BigDecimal.valueOf(10.00),
                BigDecimal.valueOf(12.00)
        );

        Fornecedor fornecedor1 = new Fornecedor(
                123456789L,
                "Fornecedor A",
                "xxxxxxxxx",
                "email@email.com",
                "32954258"
        );

        /*a. Faça o programa registrar um fornecimento com a data de hoje. Imprima o resultado;*/
        Fornecimento fornecimento1 = new Fornecimento(
                LocalDate.now(),
                5,
                produto1.getPrecoVenda().multiply(BigDecimal.valueOf(5)),
                produto1,
                fornecedor1
        );
        System.out.println(fornecimento1.getData());
        System.out.println("---------------------------");

        /*b. Faça o programa registrar um fornecimento com a data de 30 dias atrás. Imprima o resultado;*/
        /*c. Faça o programa registrar um fornecimento com a data de 60 dias atrás. Imprima  resultado;*/
        /*d. Agora faça o programa imprimir um relatório com os fornecimentos detalhados dos últimos 30 dias,
        bem como, o total desses fornecimentos;*/
        /*e. Agora faça o programa imprimir um relatório com os fornecimentos detalhados dos últimos 60 dias,
        bem como, o total desses fornecimentos;*/
    }
}
