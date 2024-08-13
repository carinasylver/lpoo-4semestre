public class lancandoPropriaClasseException {

    public static void main(String[] args) {
        comportamento1(); //chamada do metodo
    }

    private static void comportamento1(){
        comportamento2();
    }
    private static void comportamento2(){

//        try{ //tente execucao essa linha se nao der lance uma excecao
//            throwException(); //gera a excecao verificada pelo compilador
//        }catch (Exception exception){ //pega a excecao gerada no bloco try
//            exception.printStackTrace();//imprime a pilha(stack) de exceção
//        }

        try{ //tente execucao essa linha se nao der lance uma excexao
            mythrowException(); //excecao verificada pelo compilador
        }catch (Exception exception){
            exception.printStackTrace();//imprime a pilha de exceção
        }
    }

    /*EXEMPLO DE TIPO PRÓPRIO DE EXCEÇÃO*/
    /*Lança uma exceção verificada de uma classe criada pelo programador*/
    private static void mythrowException() throws Exception{  //metodo que lança a exceção Exception throw an exception and immediately catch it
        try{ //try-catch eh um unico comando, deve vir juntos
            System.out.println("Tentou executar o bloco try, mas lança a MinhaExcecao");
            throw new MinhaExcecao(); //gera a exceção
        }catch (MinhaExcecao exception){ //pega a excecao lançada no bloco try
            //System.err.println(exception.getMessage()); //meu problema... forcei um na minha classe
            exception.printStackTrace(); //imprime a stack de excecao
        }
        finally { //executa em qualquer caso, seja resultado da execucao do try ou do catch
            System.err.println("finally executado em  mythrowException()");
        }

    } //fim classe tratamento de exceção


    /*lança uma excecao verificada*/
    /*segundo deitel(2010), todas as classes q sao herdadas das da classe exception,
     mas nao direta ou indiretamente da classe  RuntimeException, sao consideradas exceçoes verificadas*/

    private static void throwException() throws Exception{  //metodo que lança a exceção Exception
        //try-catch eh um unico comando, deve vir juntos
        try{
            System.out.println("Executou no bloco try de throwException()");
            throw new Exception(); //gera a excecao
        }catch (Exception exception){ //pega a excecao gerada no bloco try
            System.err.println("Exceção tratada no bloco catch de throwException()");
            throw exception; //rethrow for further processing
        }
        finally { //executes regardless of what occurs in try.. catch. finally eh sempre executado
            System.err.println("finally executado em throwException()");
        }

    }

} //fim da classe lancandoPropriaClasseException


//lançando minha propria exceção

/*Quando se extende Exception é por que se quer que o compilador detecte a exceção em tempo de projeto.*/
class MinhaExcecao extends Exception{

    //construtor
    public MinhaExcecao(){
        super("meu problema... forcei um na minha classe"); //construtor da superclasse throwable
    }
}


