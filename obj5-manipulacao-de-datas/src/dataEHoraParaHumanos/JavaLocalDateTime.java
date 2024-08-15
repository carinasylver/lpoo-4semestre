package dataEHoraParaHumanos;
//LocalDateTime+++++++++
/* a classe LocalDateTime serve para representar uma data e hora especifica.
* Podemos representar uma data e hora de uma prova importante ou de uma audiencia em um tribunal
* */

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class JavaLocalDateTime {
    public static void main(String[] args) {
        System.out.println("------exemplo de uso do LocalDateTime(data e hora atual)");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora); //2024-08-15T12:24:01.959723800  //2024-08-15T12T12:24 (formato ISO-8601)

        System.out.println("------exemplo de uso do LocalDateTime(data e hora especifica)");
        LocalDateTime aberturaDaCopa = LocalDateTime.of(2024, Month.JUNE,12,17,0);
        System.out.println("saida padrão: " +aberturaDaCopa); //2024-06-12T17:00 (formato ISO-8601)
        System.out.println("saida formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(aberturaDaCopa));//12/06/2024 17:00(uso de mascara)

        System.out.println("------exemplo de uso do LocalDateTime a partir de uma String(data e hora especifica)");
        aberturaDaCopa = LocalDateTime.parse("2014-06-12T17:00:00");
        System.out.println("saida padrão " + aberturaDaCopa);//2024-06-12T17:00 (formato ISO-8601)
        System.out.println("saida formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(aberturaDaCopa));//12/06/2024 17:00 (uso de mascara)

        System.out.println("------exemplo de uso do LocalDateTime a partir de uma String(data e hora especifica na construção)");
        aberturaDaCopa = LocalDateTime.parse("01/06/2023 17:00",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("saida padrão :");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(aberturaDaCopa));//01/06/2023 17:00 (uso de mascara)
    }
}
