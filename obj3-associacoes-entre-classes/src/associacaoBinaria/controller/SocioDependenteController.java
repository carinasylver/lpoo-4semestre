package associacaoBinaria.controller;

import associacaoBinaria.model.Dependente;
import associacaoBinaria.model.Socio;

import java.time.LocalDate;

public class SocioDependenteController {
    public static void main(String[] args) {
        /*um objeto da classe Socio pode relacionar-se ou não com instâncias da classe Dependente,
         conforme demonstra a multiplicidade 0..**/
        Socio socio1 = new Socio(
                "João",
                "Rua 1, nº 123",
                "53991253651",
                LocalDate.of(1990, 8, 6)
        );
        System.out.println(socio1);

        /*um objeto da classe Dependente, terá de se relacionar
        obrigatoriamente com um objeto da classe Socio, pois, como não foi definida
        a multiplicidade na extremidade da classe Socio, isto significa que esta é 1..1, ou seja, um
        objeto da classe Dependente precisa relacionar-se exclusivamente com um objeto da classe Socio.*/
        Dependente dependente1 = new Dependente(
                "Maria",
                LocalDate.of(1992,5,13),
                socio1
        );
        System.out.println(dependente1);
    }

}
