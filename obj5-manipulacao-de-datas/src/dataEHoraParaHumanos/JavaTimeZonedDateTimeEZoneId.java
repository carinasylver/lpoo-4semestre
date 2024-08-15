package dataEHoraParaHumanos;

//ZonedDateTime++++++++++++++++
//é uma representação imutavel de uma data e hora com fuso horário

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeZonedDateTimeEZoneId {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Sao_Paulo"));
        System.out.println(zonedDateTime);//2024-08-15T14:17:31.111519300-03:00[America/Sao_Paulo]

        //Lista de Timezones++++++++++++++++++
        System.out.println("\n-------------Lista de Timezones");
        System.out.println(ZoneId.getAvailableZoneIds());

    }
}
