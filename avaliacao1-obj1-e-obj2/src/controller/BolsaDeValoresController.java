package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BolsaDeValoresController {
    public static void main(String[] args) {
        //b
        ClientePessoaFisica clientePessoaFisica1= new ClientePessoaFisica(
                "adele",
                "adkins",
                "adele@email.com",
                "01234567890"
        );
        ClientePessoaFisica clientePessoaFisica2= new ClientePessoaFisica(
                "julia",
                "roberts",
                "juliaR@email.com",
                "09876543210"
        );
        ClientePessoaJuridica clientePessoaJuridica1= new ClientePessoaJuridica(
                "amazon",
                "amazon",
                "amazon",
                "12345678901234"
        );
        ClientePessoaJuridica clientePessoaJuridica2= new ClientePessoaJuridica(
                "google",
                "google",
                "google",
                "98765432109876"
        );

        Vendedor vendedor1 = new Vendedor(
                "joao",
                "silva",
                1500.00,
                0.2
        );
        Vendedor vendedor2 = new Vendedor(
                "maria",
                "santos",
                1500.00,
                0.2
        );
        Gerente gerente1 = new Gerente(
                "pedro",
                "almeida",
                2500,
                0.5
        );
        Gerente gerente2 = new Gerente(
                "ana",
                "pereira",
                2500,
                0.5
        );

        //c
        System.out.println(clientePessoaFisica1);
        System.out.println(clientePessoaFisica2);
        System.out.println(clientePessoaJuridica1);
        System.out.println(clientePessoaJuridica2);
        System.out.println(vendedor1);
        System.out.println(vendedor2);
        System.out.println(gerente1);
        System.out.println(gerente2);

        System.out.println("--------------------------------------");

        //d
        List<Cliente> clientes =  new ArrayList<>();
        clientes.add(clientePessoaFisica1);
        clientes.add(clientePessoaFisica2);
        clientes.add(clientePessoaJuridica1);
        clientes.add(clientePessoaJuridica2);
        System.out.println("\n--lista de clientes\n" + clientes);
        System.out.println("--------------------------");

        List<Funcionario> funcionarios = new  ArrayList<>();
        funcionarios.add(vendedor1);
        funcionarios.add(vendedor2);
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);
        System.out.println("\n---lista de funcionarios\n" + funcionarios);
        System.out.println("-------------------------------------");

        //e
        vendedor1.setSalario(3000.00);
        vendedor2.setSalario(3000.00);

        gerente1.setSalario(12000.00);
        gerente2.setSalario(12000.00);

        System.out.println("\n---lista de funcionarios com novos salarios\n" + funcionarios);
        System.out.println("-------------------------------------");


        //f
        double folhaSalarial = 0;
        System.out.println("-----folha salarial");
        for(Funcionario funcionario : funcionarios){
            folhaSalarial += funcionario.getSalario();
        }

        //g quando for calcular a comissão eh sobre 500mil e instanceof p saber se é vendedor ou gerente.


        //h usar um setter e colocar a qut de acoes q cada um tem, ordem crescente percorrer a coleção
        List<Socio> socios = new ArrayList<>();
        socios.add(clientePessoaFisica1);
        socios.add(clientePessoaFisica2);
        socios.add(clientePessoaJuridica1);
        socios.add(clientePessoaJuridica2);
        socios.add(vendedor1);
        socios.add(vendedor2);
        socios.add(gerente1);
        socios.add(gerente2);
        socios.sort(Comparator.comparingInt(Socio::getQuantidadeDeAcoes));

        //i

        //j

        //k





    }
}
