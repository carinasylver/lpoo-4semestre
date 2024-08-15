package dataEHoraParaHumanos;

import java.time.LocalDate;
import java.time.Period;

public class JavaTimePeriod {
    //Period+++++++++++
    /* para calcularmos a duracao entre dois LocalDate, devemos utilizar um Period, que ja trata anos bissextos
    * e outros detalhes
    * */
    public static void main(String[] args) {
        System.out.println("\n-------- Exemplo de uso do Period(distância entre dois LocalDate)-----");
        Period periodo = Period.between(
                LocalDate.of(2020, 1, 1),
                LocalDate.of(2022, 1, 1));
        System.out.println(periodo);

        LocalDate hoje = LocalDate.now(); //data de hoje
        LocalDate emissaoRG = LocalDate.of(2023,5,10);
        Period periodo2 = Period.between(emissaoRG, hoje);
        System.out.println(periodo2); //PxYxMxD
        System.out.printf("saida formatada: %s anos, %s mês e %s dias",
                periodo2.getYears(),
                periodo2.getMonths(),
                periodo2.getDays()
        );
    }
}
