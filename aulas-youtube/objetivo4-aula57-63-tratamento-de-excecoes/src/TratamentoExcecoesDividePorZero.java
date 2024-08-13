import java.util.InputMismatchException;

import static java.lang.invoke.MethodHandles.throwException;

public class TratamentoExcecoesDividePorZero {

    public static void main(String[] args) {
        /*---divisao por zero
        //System.out.println(10/0);

        /*---nullPointerException(ponteiro nul)---*/
        //Conta conta1 = null; //ponteiro eh nulo, ou seja nao existe, deveria ter um new
        //Conta conta1 = new Conta(100.0);
        //System.out.println(conta1.toString());

        /*-- analisando a pilha de exceçao --*/
        comportamento1(); //chamada do metodo
    }

    private static void comportamento1(){
        comportamento2();
    }
    private static void comportamento2() {
        //divisao por zero
        //System.out.println(10/0); //lança a exceção runtimeexception com a pilha de exceçao e a msg da causa e a classe da excecao
        //System.out.println("executou todas as chamadas");//eh executada se for comentada a linha acima

        /*lancando a propria excecao*/
        //InputMismatchException exception = new InputMismatchException();
        //throw exception;
        //throwException(); //excecao verificada
        try{ //tente execucao essa linha se nao der lance uma excexao
            throwsException();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    /*lança uma excecao verificada*/
    /*segundo deitel(2010), todas as classes q sao herdadas das da classe exception, mas nao direta ou indiretamente da classe */
    /* runtimeException, sao consideradas exceçoes verificadas*/
    private static void throwsException() throws Exception{
        //throw an exception and immediately catch it
        try{
            System.out.println("method throwException");
            throw new Exception(); //generate exception
        }catch (Exception exception){
            System.err.println("Exception handled in method throwException");
            throw exception; //rethrow for further processing
        }
        finally { //executes regardless of what occurs in try.. catch. finally eh sempre executado
            System.err.println("finally executed in throwException");
        }

    }

}


