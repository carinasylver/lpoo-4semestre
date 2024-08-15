package dataEHoraParaHumanos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class JavaTimeLocalDate {
    //LocalDate+++++++++++++++
    /*representa uma data, ou seja, um periodo de 24h, com dia, mes e ano */
    public static void main(String[] args) {
        System.out.println("\n ------------- datas para humanos-----------");

        System.out.println("\n-------- Exemplo de uso do LocalDate(data do sistema, sem hora)-----");
        LocalDate hoje = LocalDate.now();
        System.out.println("saida padrão: "+ hoje); //2024-08-15(formato ISO-8601)
        System.out.println("saida formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(hoje));// 15/08/2024(formato brasileiro);

        /*
        * um localDate serve para representarmos, por exemplo, a data de emissão do nosso RG, em que não nos importa as horas
        * ou minutos, mas o dia da emissão. podemos criar um localDate para uma data especifica utilizando o metodo of.
        * */
        System.out.println("\n ------- exemplo de uso do LocalDate com uma data especifica----");
        LocalDate emissaoRG = LocalDate.of(2024,8,10);
        System.out.println("saida padrão: "+ emissaoRG); //2024-08-15
        System.out.println("saida formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG));//15/08/2024

        System.out.println("\n ------- exemplo de uso do LocalDate a partir de uma data especifica, com o uso do Enum Month----");
        LocalDate emissaoRG2 = LocalDate.of(2024, Month.AUGUST, 15);
        System.out.println("saida padrão: "+ emissaoRG2);
        System.out.println("saida formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG2));// 15/08/2024

        System.out.println("\n ------- exemplo de uso do LocalDate a partir de uma String(data especifica)----");
        LocalDate emissaoRG3 = LocalDate.parse("2024-08-15");
        System.out.println("saida padrão: "+ emissaoRG3); //2024-08-15
        System.out.println("saida formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG3));//15/08/2024
        //ou
        System.out.println("ou");
        LocalDate emissaoRG4 = LocalDate.parse("15/08/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("saida padrão: "+ emissaoRG4); //15/08/2024
        System.out.println("saida formatada: ");
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(emissaoRG4));//15/08/2024



    }

}
