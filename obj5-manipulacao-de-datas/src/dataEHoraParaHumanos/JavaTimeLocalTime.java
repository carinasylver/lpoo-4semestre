package dataEHoraParaHumanos;

//LocalTime ++++++++
/* ja a classe LocalTime serve para representar apenas o horário, sem data especifica, podemos, por exemplo, usa-la
* para representar o horário de entrada no trabalho
* */

import java.time.LocalTime;

public class JavaTimeLocalTime {
    public static void main(String[] args) {
        System.out.println("\n--- exemplo de uso do LocalTime (hora atual do sistema, sem data)");
        LocalTime horarioDeEntrada = LocalTime.now();
        System.out.println("---hora atual do sistema (em nanosegundos): "+ horarioDeEntrada);

        System.out.println("\n--- exemplo de uso do LocalTime (a partir de uma hora especifica (hora especifica, sem a data)");
        LocalTime horarioDeEntrada2 = LocalTime.of(14, 0);
        System.out.println("---hora especifica: "+ horarioDeEntrada2); //14:00

        System.out.println("\n----- exemplo de uso do localTime a partir de uma String(hora especifica, sem a data)");
        LocalTime horarioDeEntrada3 = LocalTime.parse("14:00");
        System.out.println("---hora especifica: "+ horarioDeEntrada3);//14:00
    }
}
