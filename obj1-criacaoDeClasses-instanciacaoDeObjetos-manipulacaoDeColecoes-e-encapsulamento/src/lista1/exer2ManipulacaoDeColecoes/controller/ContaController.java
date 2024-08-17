package lista1.exer2ManipulacaoDeColecoes.controller;

import lista1.exer2ManipulacaoDeColecoes.model.Conta;
import lista1.exer2ManipulacaoDeColecoes.model.Produto;

import java.util.*;
import java.util.Collections;

public class ContaController {
    public static void main(String[] args) {
        //exer2-c. Modifique cada objeto para que ele passe a conter um valor para o atributo id;
        Conta conta1 = new Conta(
                1L,
                1000
        );
        Conta conta2 = new Conta(
                2L,
                2000
        );
        Conta conta3 = new Conta(
                3L,
                3000
        );
        Conta conta4 = new Conta(
                4L,
                4000
        );
        Conta conta5 = new Conta(
                5L,
                5000
        );
        Conta conta6 = new Conta(
                6L,
                6000
        );
        /*2. Faça o que se pede:
         * exer2-a. Nos controladores criados no Exercício1(construidos acima)
         * adicione dois objetos do tipo coleção, um do tipo List, outro do tipo Map;
         */
        List<Conta> contasList = new ArrayList<>();
        contasList.add(conta1);
        contasList.add(conta2);

        Map<Double, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getSaldo(), conta1);
        contasMap.put(conta2.getSaldo(), conta2);

        /*exer2-b. Modifique as classes de modelo para que elas passem a conter mais um atributo, o
         * atributo de nome “id” (identificador);        *
         * */
        //classe Conta com atributo id adicionado

        //*exer2-d. Adicione na coleção todos os objetos criados no Exercício 1;
        contasList.add(conta3);
        contasList.add(conta4);
        contasList.add(conta5);
        contasList.add(conta6);

        contasMap.put(conta3.getSaldo(), conta3);
        contasMap.put(conta4.getSaldo(), conta4);
        contasMap.put(conta5.getSaldo(), conta5);
        contasMap.put(conta6.getSaldo(), conta6);

        //exer2-e. Imprima os objetos contidos em cada coleção;
        System.out.println("\n*---Lista de contas do TIPO LIST\n" + contasList);
        //ou
        System.out.println("\n*---Lista de contas do TIPO LIST com FOR\n");
        //for (parâmetro : nomeDoArray)
        for (Conta conta : contasList) {
            System.out.println(conta);
        }
        System.out.println("\n*---Mapa de contas do TIPO MAP\n" + contasMap);
        //ou
        System.out.println("\n*---Mapa de produtos do TIPO MAP com FOR\n");
        for (Map.Entry<Double, Conta> entry : contasMap.entrySet()) {
            System.out.println("--Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        //exer2.f. Ordene a coleção em ordem decrescente e a imprima;
        //ordenacao da coleção do tipo List pelo id
        contasList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("\n---Lista de contas ordenada pelo id (decrescente): " + contasList);

        //ordenacao da coleção do tipo Map
        //nao se ordena colecao do tipo Map, por que perde a referencia da chave na posicao de memoria onde salvou o bjeto, eu estaria buscando o registro errado

        //exer2.g. Faça uma pesquisa por força bruta na coleção e retorne o objeto de id=3;
        //pesquisa na coleção do tipo map
        //pesquisa por forca bruta percorre todos os obj dque tem na colecao, nao importa se achou ou nao

        contasList.forEach(conta -> {
            if (conta.getId() == 3) {
                System.out.println("\n*----Conta de id=3 do TIPO LIST\n" + conta);
            }
        });

        //exer2.h Faça uma pesquisa binária na coleção e retorne o objeto de id=3.
        contasList.sort(Comparator.comparing(Conta::getId));//ordenacao da colecao do tipo List pelo id
        int index = Collections.binarySearch(
                contasList, new Conta(3L),
                Comparator.comparing(Conta::getId)
        );
        if (index >= 0) {
            Conta conta = contasList.get(index);
            System.out.println("\n*---- Conta de id=3 do TIPO LIST (pesquisa binária)\n" + conta);
        }
    }

}
