package obj5Lista1.controller;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class ManipulacaoDeDatas {

    /*1. Faça o que se pede em um único controlador:*/

    /*a. Dado o Instant 1723066578101, em UTC-0, faça o programa imprimir a data e a hora no
    formato dd/MM/yyyy HH:mm referente a este instante em UTC-0;*/


    //Instant - representa um momento(data e hora) no tempo UTC
    public static void main(String[] args) {
         /*a. Dado o Instant 1723066578101, em UTC-0, faça o programa imprimir a data e a hora no
         formato dd/MM/yyyy HH:mm referente a este instante em UTC-0;*/


        // Dado o Instant em milissegundos
        long instantMillis = 1723066578101L;
        System.out.println("---Valor antes da aplicação da máscara (observe que ISSO é o formato padrão do Java)= "
                + instantMillis
        );

        // Cria um objeto instant a partir dos milissegundos
        Instant instant = Instant.ofEpochMilli(1723066578101L);
        System.out.println("---Timestamp UTC zero offset: "
                + instant
        );

        //LocalDateTime - representa uma data com hora
        LocalDateTime dataHora = LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));
        System.out.println("---Data e hora UTC zero offset: "
                + dataHora
        );

        //DateTimeFomatter: para formataR a saida como uma String formatada(um mascara para data e hora)
        DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("---Data e hora UTC zero offset FORMATADA: "
                + dataHoraFormatada.format(dataHora)
        );
        System.out.println("------------------------------------------");

        /*  b. Dado o mesmo Instant do item “a” faça o programa imprimir a data e a hora no formato
         *  dd/MM/yyyy HH:mm referente a este instante em UTC-3, e UTC+1;
         * */
        LocalDateTime utc3 = LocalDateTime.ofInstant(instant, ZoneId.of("UTC-3"));
        System.out.println("---Data e hora UTC-3(saida padrão): "
                + utc3
        );
        //gabarito prof
        System.out.println("---Data e hora UTC-3 (saida formatada): "+instant.atZone(ZoneId.of("UTC-3")));

        DateTimeFormatter utc3Formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("---Data e hora UTC-3 (saida formatada): "
                +  utc3Formatada.format(utc3)
        );

        LocalDateTime utc1 = LocalDateTime.ofInstant(instant, ZoneId.of("UTC+1"));
        System.out.println("---Data e hora UTC+1 (saida padrão): "
                + utc1
        );
        //gabarito prof
        System.out.println("---Data e hora UTC+1 (saida padrão): "+ instant.atZone(ZoneId.of("UTC+1")));

        DateTimeFormatter utc1Formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("---Data e hora UTC+1 (saida formatada): "
                +  utc1Formatada.format(utc1)
        );
        System.out.println("----------------------------------------------");

        /*   c. Dado o mesmo Instant do item “a” faça o programa imprimir a data e a hora no formato
        *    dd/MM/yyyy HH:mm referente a este instante em “America/Sao_Paulo”, e “Europe/Paris”.
        *    Agora responda (como comentário no código): Existe diferença entre o horário UTC-3 e
        *   “America/Sao_Paulo”? E UTC+1 e “Europe/Paris”? Justifique suas respostas.
        *    Sim, há diferenças entre os horários UTC-3 e “America/Sao_Paulo”, assim como entre UTC+1 e “Europe/Paris”
        *    UTC-3 é um fuso horário fixo que está 3 horas atrás do Tempo Universal Coordenado (UTC)
        *    “America/Sao_Paulo” é um fuso horário que segue UTC-3, mas pode mudar para UTC-2 durante o horário de verão,
        *    dependendo das políticas de horário de verão do Brasil.
        *     UTC+1 é um fuso horário fixo que está 1 hora à frente do UTC.
        *    “Europe/Paris” é um fuso horário que segue UTC+1, mas pode mudar para UTC+2 durante o horário de verão,
        *    dependendo das políticas de horário de verão da França.
        */

        ZonedDateTime zonedDateTimeSP = ZonedDateTime.ofInstant(instant, ZoneId.of("America/Sao_Paulo"));
        System.out.println("---Data e hora [America/Sao_Paulo] (saida padrão)"
                + zonedDateTimeSP
        );
        DateTimeFormatter zonedDateTimeSPFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("---Data e hora [America/Sao_Paulo] (saida formatada): "
                +  zonedDateTimeSPFormatada.format(zonedDateTimeSP)
        );
        //gabarito prof
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("America/Sao_Paulo"))));


        ZonedDateTime zonedDateTimeParis = ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/Paris"));
        System.out.println("---Data e hora [Europe/Paris] (saida padrão): "
                + zonedDateTimeParis
        );
        DateTimeFormatter zonedDateTimeParisFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("---Data e hora [Europe/Paris] (saida formatada): "
                +  zonedDateTimeParisFormatada.format(zonedDateTimeParis)
        );
        //gabarito prof
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(instant.atZone(ZoneId.of("Europe/Paris"))));
        System.out.println("---------------------------------------------------");

        /*  d. Dada a String “07/08/2024” faça o programa criar uma instância para armazenar esta data,
        *   depois, imprima o resultado no formato dd/MM/yyyy;
        * */
        LocalDate dataString = LocalDate.parse("07/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("saida padrão: "+ dataString); //formata de 07/08/2024 para 2024-08-07
        System.out.println("saida formatada: "+ DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataString));//formata para 07/08/2024

        //gabarito profe
        String dateString = "07/08/2024";
        LocalDate dataD = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataD));
        System.out.println("-------------------------------------------------------");

        /*  e. Dada a String 14:05 faça o programa criar uma instância para armazenar esta hora, depois,
        *    imprima o resultado no formato HH:mm;
        * */
        LocalTime horaStr = LocalTime.parse("14:05", DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(horaStr);

        //gabarito profe
        String horaString = "14:05";
        LocalTime hora1Str = LocalTime.parse(horaString, DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(hora1Str);

        System.out.println("-----------------------------------------");

        /*  f. Data a data 07/09/1822 faça o programa calcular quantos Anos, Meses, e dias se passaram
        *   até o dia de hoje. Imprima o resultado;
        * */
        LocalDate dataIndependenciaDoBrasil = LocalDate.parse("07/09/1822", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate hoje = LocalDate.now(); //data de hoje
        Period periodo = Period.between(dataIndependenciaDoBrasil, hoje);
        System.out.printf("saida formatada: %s anos, %s mês e %s dias", periodo.getYears(),
                periodo.getMonths(),
                periodo.getDays()
        );
        System.out.println("-------------------------------------");
        /*  g. Dado o timestamp 2024-08-07T21:50:41Z de início de execução de um algoritmo e o
         *   timestamp 2024-08-07T21:50:44Z de fim de execução do mesmo algoritmo, faça o
         *   programa calcular o tempo que o algoritmo levou em execução (resultado = 3s);
         * */
        Instant inicio = Instant.parse("2024-08-07T21:50:41Z");
        Instant fim = Instant.parse("2024-08-07T21:50:44Z");
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração: " + duracao.getSeconds() + "s");

        System.out.println("------------------------------------");
        /*  h. O front-end de uma aplicação enviou a seguinte data e hora para ser armazena no back-end
        *    “12/06/2014 17:00” (uma String). Com base nesse dado, faça o programa armazena esta
        *    data e hora e imprima o resultado no formato dd/MM/yyyy HH:mm;
        * */
        LocalDateTime dataHoraAplicacao = LocalDateTime.parse("12/06/2014 17:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("saida padrão: "+ dataHoraAplicacao);
        System.out.println("saida formatada: "+ DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dataHoraAplicacao));

    }

}
