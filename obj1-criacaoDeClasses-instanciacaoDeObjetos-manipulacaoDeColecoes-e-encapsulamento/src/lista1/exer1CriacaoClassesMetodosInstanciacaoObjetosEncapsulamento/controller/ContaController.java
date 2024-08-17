package lista1.exer1CriacaoClassesMetodosInstanciacaoObjetosEncapsulamento.controller;

/*1a. Organize o projeto em camadas utilizando a arquitetura de software MVC(model, view, controler), e interprete
      as classes de modelo do diagrama abaixo na tecnologia Java;
      criado um package para model e controller, view nao usamos nos exercicios
*/

import lista1.exer1CriacaoClassesMetodosInstanciacaoObjetosEncapsulamento.model.Conta;

public class ContaController {
    public static void main(String[] args) {
        /*exerc1c. Neste controlador faça:
        exer1c-i. Crie duas instâncias da classe utilizando um construtor padrão;
        */
        //objeto conta1 da classe Conta
        Conta conta1 = new Conta();
        //objeto conta2 da classe Conta
        Conta conta2 = new Conta();
        //System.out.println(conta1);// Conta{saldo=0.0}
        //System.out.println(conta2);//Conta{saldo=0.0}

        /*exer1c-ii  Utilize seu conhecimento sobre sobrecarga de métodos e crie duas instâncias de
        da classe utilizando um construtor parametrizado por todos os atributos da classe
        de modelo;
        */
        //objeto conta3 da classe Conta
        Conta conta3 = new Conta(
                1000.0
        );
        //objeto conta4 da classe Conta
        Conta conta4 = new Conta(
                2000.0
        );
        /*exer1c-iii. Utilize seu conhecimento sobre sobrecarga de métodos e
         * crie duas instâncias da classe utilizando uma variação do construtor parametrizado.
         * */
        //objeto conta5 da classe Conta
        Conta conta5 = new Conta(
                3000.0
        );
        Conta conta6 = new Conta(
                4000.0
        );

        /* exer1c-iv. Imprima todos os objetos criados com os construtores utilizando o método toString();
         * */
        System.out.println("\n----objetos instanciados da classe Conta com construtor padrão ou vazio com toString():");
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println("------------------------------------------------");
        System.out.println("----objetos instanciados da classe Conta com construtor parametrizado com toString():");
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);
        System.out.println(conta6);
        System.out.println("------------------------------------------------");

        /* exer1c-v. Agora utilize os métodos setters de cada classe de modelo para alterar o estado de
         * cada objeto na memória RAM;
         * */
        //System.out.println("----objetos instanciados da classe Conta com construtor parametrizado com SETTERS:");
        conta1.setSaldo(1000.0);
        conta2.setSaldo(2000.0);
        conta3.setSaldo(3000.0);
        conta4.setSaldo(4000.0);
        conta5.setSaldo(5000.0);
        conta6.setSaldo(6000.0);
        //System.out.println("------------------------------------------------");

        System.out.println("manipulando os metodos da classe");
        conta1.sacar(500.0);
        conta1.sacar(1000.0);
        conta1.depositar(1000.0);
        conta1.atualizar(10.0);
        System.out.println("------------------------------------");


        /* vi. Imprima todos objetos novamente, só que agora, ao invés de utilizar o método
         * toString(), utilize os método getters.
         * */
        System.out.println("\n----objetos instanciados da classe Conta com construtor parametrizado com GETTERS e toString():");
        conta1.getSaldo();
        System.out.println(conta1);
        conta2.getSaldo();
        System.out.println(conta2);
        conta3.getSaldo();
        System.out.println(conta3);
        conta4.getSaldo();
        System.out.println(conta4);
        conta5.getSaldo();
        System.out.println(conta5);
        conta6.getSaldo();
        System.out.println(conta6);
        System.out.println("------------------------------------------------");
    }
}
