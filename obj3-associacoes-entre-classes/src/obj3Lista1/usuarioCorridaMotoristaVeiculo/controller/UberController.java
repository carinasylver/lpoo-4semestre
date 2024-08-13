package obj3Lista1.usuarioCorridaMotoristaVeiculo.controller;


import obj3Lista1.usuarioCorridaMotoristaVeiculo.model.Usuario;
import obj3Lista1.usuarioCorridaMotoristaVeiculo.model.Motorista;
import obj3Lista1.usuarioCorridaMotoristaVeiculo.model.Veiculo;
import obj3Lista1.usuarioCorridaMotoristaVeiculo.model.Corrida;
import obj3Lista1.usuarioCorridaMotoristaVeiculo.model.FormaDePagamento;
import obj3Lista1.usuarioCorridaMotoristaVeiculo.model.Situacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UberController {
    public static void main(String[] args) {
        System.out.println("\na. Faça o programa realizar duas corridas para o mesmo usuário, com um mesmo motorista e veículo;");
        Usuario usuario1 = new Usuario(
                "maria",
                "maria@email.com",
                "53991547562"
        );
        //System.out.println(usuario1);

        Veiculo veiculo1 = new Veiculo(
                "ABC1234",
                "123456789",
                "Fiat",
                "Uno",
                2010
        );

        Motorista motorista1 = new Motorista(
                "paulo",
                "paulo@email.com",
                "53985456279",
                veiculo1
        );


        Corrida corrida1= new Corrida(
                BigDecimal.valueOf(8.90),
                LocalDate.of(24, 8, 20),
                LocalDate.of(24, 8, 20),
                FormaDePagamento.Pix,
                Situacao.Faturada,
                usuario1,
                motorista1

        );
        Corrida corrida2 = new Corrida(
                BigDecimal.valueOf(10.98),
                LocalDate.of(24,9,11),
                LocalDate.of(24, 9, 11),
                FormaDePagamento.Pix,
                Situacao.Faturada,
                usuario1,
                motorista1

        );


        //System.out.println(corrida1);
        //System.out.println(corrida2);

        System.out.println("b. Faça o programa imprimir todas as corridas por usuário, em ordem decrescente,"+
                " pelo critério valor da corrida;");

        //lista as corridas do usuario1
        //usuario1.getCorridas().add(corrida1);
        //usuario1.getCorridas().add(corrida2);

        //System.out.println("\nCorridas do usuário: " + usuario1.getNome());
        //usuario1.getCorridas().sort(Comparator.comparing(Corrida::getValor).reversed());
        // for (Corrida corrida : usuario1.getCorridas()) {
        //  System.out.println(corrida);
        //}

        //lista as corridas dos usuarios
        List<Corrida> corridas = new ArrayList<>();
        corridas.add(corrida1);
        corridas.add(corrida2);

        System.out.println("\nCorridas do usuário: " + usuario1.getNome());
        corridas.sort(Comparator.comparing(Corrida::getValor).reversed());
        for (Corrida corrida : corridas) {
            System.out.println(corrida);
        }

        System.out.println("\nc. Faça o programa imprimir todas as corridas por motorista, em ordem crescente,\n"+
                "pelo critério data de início da corrida;");
        List<Corrida> corridasMotorista = new ArrayList<>();
        corridasMotorista.add(corrida1);
        corridasMotorista.add(corrida2);

        System.out.println("\nCorridas do motorista: " + motorista1.getNome());
        corridasMotorista.sort(Comparator.comparing(Corrida::getDataInicio));
        for (Corrida corrida : corridasMotorista) {
            System.out.println(corrida);
        }

        System.out.println("\nd. Faça o programa imprimir o valor total de todas as corridas realizadas por\n" +
                "motorista, e imprima os dados do motorista e o valor calculado.");

        BigDecimal totalDasCorridas = BigDecimal.ZERO;
        for (Corrida corrida : corridasMotorista) {
            totalDasCorridas = totalDasCorridas.add(corrida.getValor());
        }
        System.out.println("\nValor total das corridas do motorista " + motorista1.getNome() +
                " é de R$ " + totalDasCorridas);

    }



}
