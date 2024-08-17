package lista1.exer2ManipulacaoDeColecoes.controller;

import lista1.exer2ManipulacaoDeColecoes.model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        //exer2-c. Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Produto produto1 = new Produto(
                1L,
                "Bermuda",
                "Bermuda jeans",
                49.99,
                1500
        );

        Produto produto2 = new Produto(
                2L,
                "Short",
                "Short de musculação",
                79.99,
                800
        );
        Produto produto3 = new Produto(
                3L,
                "Camiseta",
                "Camiseta de time",
                299.99,
                1200
        );
        Produto produto4 = new Produto(
                4L,
                "Calça",
                "Calça jeans",
                39.99,
                1500
        );
        Produto produto5 = new Produto(
                5L,
                "Tênis",
                "Tênis de corrida",
                59.99,
                800
        );
        Produto produto6 = new Produto(
                6L,
                "Boné",
                "Boné de esportes",
                19.99,
                1200
        );


        /*2. Faça o que se pede:
         * exer2-a. Nos controladores criados no Exercício 1 adicione dois objetos do tipo coleção, um do
         *    tipo List, outro do tipo Map;
         */
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);

        Map<String, Produto> produtosMap = new HashMap<>();
        produtosMap.put(produto1.getNome(), produto1);
        produtosMap.put(produto2.getNome(), produto2);

        /*exer2-b. Modifique as classes de modelo para que elas passem a conter mais um atributo, o
         * atributo de nome “id” (identificador);        *
         * */
        //classe Produto com atributo id adicionado

        //d. Adicione na coleção todos os objetos criados no Exercício 1;
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);

        produtosMap.put(produto3.getNome(), produto3);
        produtosMap.put(produto4.getNome(), produto4);
        produtosMap.put(produto5.getNome(), produto5);
        produtosMap.put(produto6.getNome(), produto6);



        //exer2-e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n*---Lista de produtos do TIPO LIST\n" + produtos);
        //ou
        System.out.println("\n*---Lista de produtos do TIPO LIST com FOR\n");
        //for (parâmetro : nomeDoArray)
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("\n*---Mapa de produtos do TIPO MAP\n" + produtosMap);

        //ou
        System.out.println("\n*---Mapa de produtos do TIPO MAP com FOR\n");
        for (Map.Entry<String, Produto> entry : produtosMap.entrySet()) {
            System.out.println("--Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        produtos.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println("\n---Lista de produtos ordenada pelo id (decrescente): " + produtos);

        //ordenacao da coleção do tipo Map
        //nao se ordena colecao do tipo Map, por que perde a referencia da chave na posicao de memoria onde salvou o bjeto, eu estaria buscando o registro errado

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao

        produtos.forEach(p -> {
            if (p.getId() == 3) {
                System.out.println("\n*----Produto de id=3 do TIPO LIST\n" + p);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        produtos.sort(Comparator.comparing(Produto::getId));
        int index = Collections.binarySearch(
                produtos, new Produto(3L),
                Comparator.comparing(Produto::getId));//compara apenas o id
        if (index >= 0) {
            Produto produto = produtos.get(index);
            System.out.println("\n*---- Produto de id=3 do TIPO LIST (pesquisa binária)\n" + produto);
        }

    }
}
