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
                "alderaan",
                1,
                "casa1",
                "centro",
                "12345-678",
                "Alderaan",
                100.0,
                200000.0,
                300000.0,
                200.0
        );

        Casa casa2 = new Casa(
                "avenida",
                "Tatooine",
                2,
                "casa2",
                "deserto",
                "23456-789",
                "Tatooine",
                150.0,
                250000.0,
                400000.0,
                300.0
        );

        Apartamento apartamento1 = new Apartamento(
                "praca",
                "coruscant",
                3,
                "apt 303",
                "centro",
                "34567-890",
                "Coruscant",
                50.0,
                150000.0,
                250000.0,
                "condominio galactico"

        );

        Apartamento apartamento2 = new Apartamento(
                "rua",
                "Naboo",
                4,
                "apt 402",
                "lago",
                "45678-901",
                "Naboo",
                75.0,
                180000.0,
                300000.0,
                "condominio real"
        );

        UnidadePelotas unidadePelotas = new UnidadePelotas(
                "tatooine imoveis S.A.",
                "12.345.678/0001-99",
                0.0,
                5.0

        );

        UnidadePortoAlegre unidadePortoAlegre = new UnidadePortoAlegre(
                "naboo imoveis S.A",
                "98.765.432/0001-88",
                0.0,
                6.0
        );

        //c.
        System.out.println("----instancias de imoveis");
        System.out.println(casa1);
        System.out.println(casa2);
        System.out.println(apartamento1);
        System.out.println(apartamento2);
        System.out.println("\n----instancias de unidade imobiliaria");
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
        System.out.println("\n----lista de portfolio\n" + portfolios);


        //e.
        //regra de negocio implementada nas classes


        //f. e g.
        double faturamentoPelotas = 0.0;
        double faturamentoPortoAlegre = 0.0;

        for(Portfolio p : portfolios){
            if(p instanceof Casa){
                System.out.println("\n--------------------");
                Casa casa = (Casa) p;
                double itbi = casa.getITBI();
                System.out.println("casa: " + casa.toString());
                System.out.println("\nestimativa de ITBI: " + itbi);//6000.0  e 7.500

                if (casa.getCidade().equals("Alderaan")) {
                    faturamentoPelotas += casa.getPrecoDeCotacao();
                } else if (casa.getCidade().equals("Tatooine")) {
                    faturamentoPortoAlegre += casa.getPrecoDeCotacao();
                }

            }
            else if (p instanceof Apartamento) {
                System.out.println("\n--------------------");
                Apartamento apto = (Apartamento) p;
                double itbi = apto.getITBI();
                System.out.println("apartamento: " + apto.toString());
                System.out.print("\nestimativa de ITBI: "+ itbi); //6000.0  7.200.0

                if (apto.getCidade().equals("Coruscant")) {
                    faturamentoPelotas += apto.getPrecoDeCotacao();
                } else if (apto.getCidade().equals("Naboo")) {
                    faturamentoPortoAlegre += apto.getPrecoDeCotacao();
                }
            }
        }
        //g.i. e g.ii
        unidadePelotas.setPrevisaoDeFaturamento(faturamentoPelotas);
        unidadePortoAlegre.setPrevisaoDeFaturamento(faturamentoPortoAlegre);
        System.out.println("\n--------------------");
        System.out.println("unidade Pelotas - previsao de faturamento: " + unidadePelotas.getPrevisaoDeFaturamento());
        System.out.println("unidade Pelotas - ITBI: " + unidadePelotas.getITBI());

        System.out.println("\n--------------------");
        System.out.println("unidade Porto Alegre - previsao de faturamento: " + unidadePortoAlegre.getPrevisaoDeFaturamento());
        System.out.println("unidade Porto Alegre - ITBI: " + unidadePortoAlegre.getITBI());


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
        imobiliarias.sort(Comparator.comparing(Imobiliaria::getPrevisaoDeFaturamento).reversed());
        System.out.println("\n---imobiliarias ordenadas com base na previsao de faturamento(ordem descrescente)" + imobiliarias);
    }
}
