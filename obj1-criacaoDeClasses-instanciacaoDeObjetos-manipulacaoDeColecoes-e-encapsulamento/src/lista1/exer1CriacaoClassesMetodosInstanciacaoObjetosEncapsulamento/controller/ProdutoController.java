package lista1.exer1CriacaoClassesMetodosInstanciacaoObjetosEncapsulamento.controller;

import lista1.exer1CriacaoClassesMetodosInstanciacaoObjetosEncapsulamento.model.Produto;

public class ProdutoController {
    /*1a. Organize o projeto em camadas utilizando a arquitetura de software MVC(model, view, controler), e interprete
    as classes de modelo do diagrama abaixo na tecnologia Java;*/

    public static void main(String[] args) {
        /*exerc1c. Nestes controladores faça:
        exer1c-i. Crie duas instâncias de cada classe utilizando um construtor padrão;*/
        //objeto produto1 da classe Produto
        Produto produto1 = new Produto(); // instancia da classe Produto vazia
        //objeto produto2 da classe Produto
        Produto produto2 = new Produto(); // instancia da classe Produto vazia
        //System.out.println(produto1); //sem ToString saida-> lista1.model.Produto@1b28cdfa
        //System.out.println(produto2); //sem ToString saida-> lista1.model.Produto@eed1f14

        /*exer1c-ii  Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        da classe utilizando um construtor parametrizado por todos os atributos da classe
        de modelo;
        */
        //objeto produto3 da classe Produto
        Produto produto3 = new Produto(
                "Camiseta",
                "Camiseta de time",
                29.99,
                50
        );
        //objeto produto4 da classe Produto
        Produto produto4 = new Produto(
                "Calça",
                "Calça jeans",
                39.99,
                30
        );

        /*exer1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e
        * crie duas instâncias da classe utilizando uma variação do construtor parametrizado.
        * */
        //objeto produto5 da classe Produto
        Produto produto5 = new Produto(
                "Tênis",
                "Tênis de corrida",
                59.99,
                20
        );
        //objeto produto6 da classe Produto
        Produto produto6 = new Produto(
                "Boné",
                "Boné de esportes",
                19.99,
                40
        );
        /* exer1c-iv. Imprima todos os objetos criados com os construtores utilizando o método toString();
        * */
        System.out.println("\n----objetos instanciados da classe Produto com contrutor padrão ou vazio com toString():");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println("------------------------------------------------");
        System.out.println("----objetos instanciados da classe Produto com contrutor parametrizado com toString():");
        System.out.println(produto3);
        System.out.println(produto4);
        System.out.println(produto5);
        System.out.println(produto6);
        System.out.println("------------------------------------------------");
        /* exer1c-v. Agora utilize os métodos setters de cada classe de modelo para alterar o estado de
        * cada objeto na memória RAM;
        * */
        //System.out.println("----objetos instanciados da classe Produto com contrutor parametrizado com SETTERS:");
        //altera os atributos com set
        produto1.setNome("Bermuda");
        produto1.setDescricao("Bermuda jeans");
        produto1.setValor(49.99);
        produto1.setEstoque(1500);
        //System.out.println(produto1);

        produto2.setNome("Short");
        produto2.setDescricao("Short de musculação");
        produto2.setValor(79.99);
        produto2.setEstoque(800);
        //System.out.println(produto2);

        produto3.setNome("Camiseta");
        produto3.setDescricao("Camiseta de time");
        produto3.setValor(24.99);
        produto3.setEstoque(1200);
        //System.out.println(produto3);

        produto4.setNome("Calça");
        produto4.setDescricao("Calça jeans");
        produto4.setValor(39.99);
        produto4.setEstoque(1500);
        //System.out.println(produto4);


        produto5.setNome("Tênis");
        produto5.setDescricao("Tênis de corrida");
        produto5.setValor(59.99);
        produto5.setEstoque(800);
        //System.out.println(produto5);

        produto6.setNome("Boné");
        produto6.setDescricao("Boné de esportes");
        produto6.setValor(19.99);
        produto6.setEstoque(1200);
        //System.out.println(produto6);
        //System.out.println("------------------------------------------------");

        /* vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o método
        * toString(), utilize os método getters.
        * */
        System.out.println("----objetos instanciados da classe Produto com contrutor parametrizado com GETTERS:");

        //pega os atributos com get
        produto1.getNome();
        produto1.getDescricao();
        produto1.getValor();
        produto1.getEstoque();
        System.out.println(produto1);

        produto2.getNome();
        produto2.getDescricao();
        produto2.getValor();
        produto2.getEstoque();
        System.out.println(produto2);

        produto3.getNome();
        produto3.getDescricao();
        produto3.getValor();
        produto3.getEstoque();
        System.out.println(produto3);

        produto4.getNome();
        produto4.getDescricao();
        produto4.getValor();
        produto4.getEstoque();
        System.out.println(produto4);

        produto5.getNome();
        produto5.getDescricao();
        produto5.getValor();
        produto5.getEstoque();
        System.out.println(produto5);

        produto6.getNome();
        produto6.getDescricao();
        produto6.getValor();
        produto6.getEstoque();
        System.out.println(produto6);

    }
}
