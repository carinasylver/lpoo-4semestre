package dataEHoraParaMaquinas;

import java.time.Instant;

//Instant
/*Retorna a data e hora atual em nanosegundos*/
/*Um timestamp basicamente representa um instante unico, um ponto especifico na linha do tempo, e seu valor corresponde
* a seu valor corresponde a uma determinada quantdade de tempo decorrida a partir de um instante inicial
* NO caso do java ele parte da epoca java padrao em 1970-01-01T00:00:00Z*/

public class javaTimeInstant {

    public static void main(String[] args) {
        System.out.println("\n-----exemplo de uso do Instant como TIMESTAMP(data e hora atual do sistema como um Long em ms)");

        Long timestamp = Instant.now().toEpochMilli();
        System.out.println("Timestamp UTC zero offset " + timestamp);
        //fazendo o contrario
        System.out.println("Instante UTC zero offset " + Instant.ofEpochMilli(timestamp));

    }

}
