import java.util.InputMismatchException;

public class LancandoPropriaExcecaoNaoVerificada {

    public static void main(String[] args) {

        comportamento1(); //chamada do metodo
    }

    private static void comportamento1(){
        comportamento2();
    }
    private static void comportamento2() {

        /*LANÇANDO A PROPRIA EXCEÇÃO*/
        InputMismatchException exception = new InputMismatchException(); //classe da API( InputMismatchException)
        throw exception;
    }

}










