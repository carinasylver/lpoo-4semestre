package exemplo1.controller;

import exemplo1.exceptions.MinhaExcecaoNaoVerificada;
import exemplo1.exceptions.MinhaExcecaoVerificada;

import java.util.Scanner;

public class TratamentoExcecoes {

    public static void main(String[] args) {

        //ex1    System.out.println(10/0);

        //Resposta a questão 2: Ou, quando há uma referência para um objeto com ponteiro NULL, por exemplo.
       //ex2	  Conta conta1 = null;//new Conta();
       //ex2	  System.out.println(conta1.toString());

        //Resposta a questão 3: Quando o método main() chama outro método, o metodo1(), o main() é empilhado na Pilha de Execução.
        /*E, quando o metodo1() encontra um problema para sua execução ele lança uma Exceção,
        passando a Pilha de Execução a ser chamada de Pilha de Rastreamento de Exceção, ou simplesmente Pilha de Rastreamento*/
        //ex2e3e4
         metodo1(); //chamada de método, empilha o main() na Pilha de Execução

    }

    private static void metodo1() {
        //ex3e4
         metodo2(); //chamada o metodo2, e empilha o medodo1() na Pilha de Execução

        //lança uma Exceção NÃO Verificada
       //ex3
         mythrowExceptionNaoVerificada(); //chama o método para testar esse tipo de exceção

        //lança uma Exceção VERIFICADA
        //Resposta a questão 9: demonstra o uso do try-catch-finally
        try {
            mythrowExceptionVerificada(); //chama o método para testar esse tipo de exceção
        } catch (MinhaExcecaoVerificada e) {
            e.printStackTrace();
        } finally {
			System.out.println("O código que estiver no bloco finally sempre é executado. Independernte se houve ou não exceção.");
		}

        //Resposta a questão 12: demonstra a captura de mais de uma exceção que pode ser lançada em um mesmo bloco try
        try {
			mythrowExceptionNaoVerificada(); //chama o método para testar esse tipo de exceção
			mythrowExceptionVerificada(); //chama o método para testar esse tipo de exceção
        } catch (MinhaExcecaoVerificada | MinhaExcecaoNaoVerificada e) {
            throw new RuntimeException(e);
        } finally {
			System.out.println("O código que estiver no bloco finally sempre é executado. Independernte se houve ou não exceção.");
		}
    }

    private static void metodo2() {
//        System.out.println(10/0); //lança uma exceção EM TEMPO DE EXECUÇÃO
//
//		//System.out.println("Executou todas as chamadas.");
//
//        // Resposta a questão 2: Quando há um erro de input no terminal, por exemplo.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
        try {
            int numero = entrada.nextInt(); // experimente colocando uma letra no lugar de um número para lançar a exceção
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
        }
   }

    // Resposta a questão 6: lança uma Exceção NÃO verificada
	/*
		Observe que a classe MinhaExcecaoNaoVerificada extende RuntimeException.
	 */
    private static void mythrowExceptionNaoVerificada() {
        throw new MinhaExcecaoNaoVerificada("Minha Exceção NÃO Verificada foi lançada."); // //Resposta a questão 11: a cláusula throw lança a exceção
    }

    // Resposta a questão 5:lança uma Exceção VERIFICADA
	/*
		Observe que a classe MinhaExcecaoVerificada extende Exception.
		Observe que o método mythrowExceptionVerificada() é acompanhado pela cláusula throws. Essa cláudula indica
		que esse método lança exceção da classe MinhaExcecaoVerificada em seu corpo.
		Um detalhe importante. A cláusula throws pode indicar mais de uma exceção, basta separá-las por vírgula.
	 */
    private static void mythrowExceptionVerificada() throws MinhaExcecaoVerificada { //Resposta a questão 10
       throw new MinhaExcecaoVerificada("Minha EXCEÇÃO VERIFICADA foi lançada."); // a cláusula throw lança a exceção
    }

}// fim classe TratamentoExcecoesV
