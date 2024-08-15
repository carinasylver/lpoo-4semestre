package dataEHoraParaMaquinas;

import java.time.Duration;
import java.time.Instant;

public class javaTimeDuration {
    //podemos usar um Instant, por exemplo, para medir o tempo de execucao de um algoritmo.

    public static void main(String[] args) {
        Instant inicio = Instant.now();
        //rodaAlgoritmo();
        Instant fim = Instant.now();

        //Duration+++++++++++++
        /*mede o intervalo entre dois instantes (Instant) em até nanosegundos*/
        System.out.println("\n-------- Exemplo de uso do Duration(intervalo entre dois instantes)-----");
        Duration duracao = Duration.between(inicio, fim);
        long duracaoEmMilissegundos = duracao.toMillis(); //observe o uso do to como prefixo
        System.out.println(duracaoEmMilissegundos + "ms");

    }

}
