package agregacao.controller;
import agregacao.model.atletaTime.Atleta;
import agregacao.model.atletaTime.Time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AtletaTimeController {
    public static void main(String[] args) {
        /*-------cria instancias de atleta-----*/
        Atleta atleta1 = new Atleta(
                1L,
                "01744256152",
                "maria",
                "silva",
                LocalDate.of(2000,2,10)
        );

        Atleta atleta2 = new Atleta(
                2L,
                "02044256153",
                "luiza",
                "lima",
                LocalDate.of(2000, 5, 1)
        );
        System.out.println("-------instancias de atleta ");
        System.out.println(atleta1);
        System.out.println(atleta2);

        /*-------cria instancias de time-----*/
        Time time1 = new Time(1,
                "gremio",
                "RS"
        );
        Time time2 = new Time(2,
                "botafogo",
                "SP"
        );
        System.out.println("-------instancias de time ");
        System.out.println(time1);
        System.out.println(time2);

        /*---------lista os atletas---------*/
        List<Atleta> atletas = new ArrayList<>();
        atletas.add(atleta1);
        atletas.add(atleta2);
        System.out.println("\nlista de atletas: "+ atletas);

        /*---------lista os times---------*/
        List<Time> times = new ArrayList<>();
        times.add(time1);
        times.add(time2);
        System.out.println("\nlista de times: "+ times);

    }
}
