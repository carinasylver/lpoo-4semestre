package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ImobiliariaController {
    public static void main(String[] args) {
        //b.
        Casa casa1 = new Casa(
                "rua",
                "estrela da morte",
                1,
                "bloco A",
                "centro",
                "12345-678",
                "alderaan",
                150.0,
                200000.0,
                250000.0,
                6000.0,
                300.0
        );
        Casa casa2 = new Casa(
                "avenida",
                "tatooine",
                2,
                "casa2",
                "deserto",
                "23456-789",
                "Tatooine",
                180.0,
                300000.0,
                350000.0,
                9000.0,
                400.0
        );

        Apartamento apartamento1 = new Apartamento(
                "praca",
                "coruscant",
                3,
                "apt 303",
                "centro",
                "34567-890",
                "Coruscant",
                150.0,
                1200000.0,
                1300000.0,
                130.0,
                "condominio galactico"

        );
        Apartamento apartamento2 = new Apartamento(
                "rua",
                "naboo",
                4,
                "apt 402",
                "lago",
                "45678-901",
                "naboo",
                130.0,
                1100000.0,
                1200000.0,
                700.0,
                "condominio real"

        );

        UnidadePelotas unidadePelotas = new UnidadePelotas(
                "tatooine imoveis S.A.",
                "12.345.678/0001-99",
                1000000.0,
                700.0,
                5.0

        );

        UnidadePortoAlegre unidadePortoAlegre = new UnidadePortoAlegre(
                "naboo imoveis S.A",
                "98.765.432/0001-88",
                2200000.00,
                720.0,
                5.2
        );

        //c.
        System.out.println("---instancias de imoveis");
        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println(apartamento1);
        System.out.println(apartamento2);
        System.out.println("\n---instancias de unidade imobiliaria");
        System.out.println(unidadePelotas);
        System.out.println(unidadePortoAlegre);

        //d.
        List<Portfolio> portfolios = new ArrayList<>();
        portfolios.add(casa1);
        portfolios.add(casa2);
        portfolios.add(apartamento1);
        portfolios.add(apartamento2);
        portfolios.add(unidadePelotas);
        portfolios.add(unidadePortoAlegre);
        System.out.println("\n---- lista de portfolio\n" + portfolios);


//        List<Imovel> imoveis = new ArrayList<>();
//        imoveis.add(casa1);
//        imoveis.add(casa2);
//        imoveis.add(apartamento1);
//        imoveis.add(apartamento2);
//        System.out.println("\n---- lista de imoveis\n" + imoveis);
//
//        List<Imobiliaria> imobiliarias = new ArrayList<>();
//        imobiliarias.add(unidadePelotas);
//        imobiliarias.add(unidadePortoAlegre);
//        System.out.println("\n---- lista de imobiliarias\n" + imobiliarias);


        //e.
        // Garanta que cada ITBI (Imposto sobre a Transmissão de Bens Imóveis) seja aplicado seguindo
        //as seguintes regras: 1. Casa= 3%, Apartamento= 4%, Pelotas= 2%, Porto Alegre= 2,5%;
        //regra de negpocio implementada nas classes


        /*f.Percorra a coleção e faça o programa calcular a estimativa de ITBI de cada casa e cada
        apartamento (considere o valor de cotação do imóvel para calcular o ITBI). Imprima os resultados
        obtidos;*/
        System.out.println("\n---estimativa de ITBI de cada casa");

        for(Portfolio p : portfolios){
            if(p instanceof Casa){
                System.out.print("\n"+ p.getITBI());
            }
        }

       System.out.println("\n---estimativa de ITBI de cada apartamento");
       for (Portfolio p : portfolios) {
           if (p instanceof Apartamento) {
                System.out.print("\n"+ p.getITBI());
           }
       }
        

//        System.out.println("\n---estimativa de ITBI por imoveis");
//        System.out.println("casa1: "+ casa1.getITBI());
//        System.out.println("casa2: "+ casa2.getITBI());
//        System.out.println("apartamento1: "+ apartamento1.getITBI());
//        System.out.println("apartamento2: "+ apartamento2.getITBI());
//
//        //g.i.
//        System.out.println("\n---estimativa de ITBI por unidade imobiliaria");
//        System.out.println("unidadePelotas: "+ unidadePelotas.getITBI());
//        System.out.println("unidadePortoAlegre: "+ unidadePortoAlegre.getITBI());
//
//        //g.i.
////       Percorra a coleção e faça o programa calcular a estimativa de ITBI por unidade da Imobiliária
//
//
//        imobiliarias.sort(Comparator.comparing(Imobiliaria::getITBI));
//        for (Imobiliaria v : imobiliarias) {
//            if (v instanceof Portfolio) { //instancia de Automovel
//                System.out.print(v);
//            }
//        }
//        System.out.println("\n---imobiliarias ordenadas com base no ITBI" + imobiliarias);


        //h.
        List<Imovel> imoveis = new ArrayList<>();
        portfolios.forEach(p -> {
            if(p instanceof Imovel) {
                imoveis.add((Imovel) p);
            }
        });
        imoveis.sort(Comparator.comparing(Imovel::getPrecoDeCotacao).reversed());
        System.out.println("\n---imoveis ordenados com base no preco de cotacao(ordem descrescente)" + imoveis);

        //i.
        List<Imobiliaria> imobiliarias = new ArrayList<>();
        portfolios.forEach(p -> {
            if(p instanceof Imobiliaria) {
                imobiliarias.add((Imobiliaria) p);
            }
        });
        imobiliarias.sort(Comparator.comparing(Imobiliaria::getPrevisaoFaturamento).reversed());
        System.out.println("\n---imobiliarias ordenadas com base na previsao de faturamento(ordem descrescente)" + imobiliarias);
    }
}
