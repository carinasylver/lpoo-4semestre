package lista1HerancaMultipla.exer1.controller;

import lista1HerancaMultipla.exer1.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {
    public static void main(String[] args) {
        /*1.a Crie uma instância da classe Bicicleta e adicione valores válidos para os atributos
        dessa instância, considerando, também, os atributos da sua superclasse, a classe
        Veículo, conforme expresso no diagrama de classes abaixo. Depois, utilizando o
        método toString(), imprima este objeto e verifique o resultado;*/

        Bicicleta bicicleta = new Bicicleta(
                2,
                "humana",
                "super",
                "Monark",
                1985,
                21,
                "123"
        );
        //System.out.println(bicicleta);

          /*1.b) Agora crie uma instância da classe Carro e adicione valores válidos para os atributos dessa instância,
         considerando, também, os atributos da sua superclasse, bem como,os métodos da interface de quem ele herda,
         conforme especificado no diagrama de classes abaixo;*/
        Carro carro = new Carro(
                2,
                "Gasolina",
                "Honda",
                "Civic",
                2023,
                50,
                "12345678901",
                "1HGCM82633A123456",
                "XYZ1234"
        );
        //System.out.println(carro);
        //c) Agora repita as mesmas tarefas do item b para uma instância da classe Caminhao.
        Caminhao caminhao = new Caminhao(
                5000,
                "Diesel",
                "Scania",
                "R 450",
                2023,
                5000,
                "09876543211",
                "1HGCM82633A654321",
                "ABC9876"
        );
        //System.out.println(caminhao);

        /*2. Suponha que estes veículos fazem parte do cadastro do Dentran-RS, então, crie uma
        coleção de objetos para representar a estrutura do cadastro de veículos do Dentran-RS. Este
        cadastro deverá conter, pelo menos, 5 bicicletas, 5 carros e 5 caminhões. Depois, faça o que
        se pede a seguir:*/
        Bicicleta bicycle1 = new Bicicleta(2,"pedal", "trek", "marlin 5", 2022, 26, "12345678901");
        Bicicleta bicycle2 = new Bicicleta(2,"motor", "giant", "stance2", 2023, 26, "12345678901");
        Bicicleta bicycle3 = new Bicicleta(2,"pedal", "specialized", "rockhopper", 2024, 26, "12345678901");
        Bicicleta bicycle4 = new Bicicleta(2,"motor", "cannondale", "marlin 5", 2024, 26, "12345678901");
        Bicicleta bicycle5 = new Bicicleta(2,"pedal", "scott", "aspect 950", 2023, 26, "12345678901");

        Carro car1 = new Carro(2,"Gasolina","Honda","civic",2022, 50, "12345678910", "1HGCM82633A13579", "XYZ4321");
        Carro car2 = new Carro(2, "Diesel", "Toyota", "Corolla", 2023, 55, "22345678901", "2TGCM82633A123456", "ABC1234");
        Carro car3 = new Carro(2, "Gasolina", "Chevrolet", "Cruze", 2024, 60, "32345678901", "3CHCM82633A123456", "DEF1234");
        Carro car4 = new Carro(2, "Eletrico", "Tesla", "Model 3", 2025, 65, "42345678901", "4TSCM82633A123456", "IJK1234");
        Carro car5 = new Carro(2, "Hibrido", "Ford", "Fusion", 2026, 70, "52345678901", "5FDCM82633A123456", "JKL1234");

        Caminhao truck1 = new Caminhao(6,"diesel","Volvo","FH 540",2024, 6000, "19876543211","2HGCM82633A654321", "DEF9876");
        Caminhao truck2 = new Caminhao(4, "diesel", "Scania", "R 450", 2023, 5000, "29876543211", "3HGCM82633A654321", "GHI9876");
        Caminhao truck3 = new Caminhao(6, "diesel", "Mercedes-Benz", "Actros", 2025, 7000, "39876543211", "4HGCM82633A654321", "JKL9876");
        Caminhao truck4 = new Caminhao(4, "diesel", "MAN", "TGX", 2026, 5500, "49876543211", "5HGCM82633A654321", "MNO9876");
        Caminhao truck5 = new Caminhao(6, "diesel", "DAF", "XF", 2027, 6500, "59876543211", "6HGCM82633A654321", "IQR9876");


        //crie uma coleção de objetos para representar a estrutura do cadastro de veículos do Dentran-RS
        List<Veiculo> veiculosList = new ArrayList<>();
        veiculosList.add(bicycle1);
        veiculosList.add(bicycle2);
        veiculosList.add(bicycle3);
        veiculosList.add(bicycle4);
        veiculosList.add(bicycle5);

        veiculosList.add(car1);
        veiculosList.add(car2);
        veiculosList.add(car3);
        veiculosList.add(car4);
        veiculosList.add(car5);

        veiculosList.add(truck1);
        veiculosList.add(truck2);
        veiculosList.add(truck3);
        veiculosList.add(truck4);
        veiculosList.add(truck5);

        System.out.println("-------------------------------");
        System.out.println("Lista de veiculos do detran: "+veiculosList);


        /*2.a) Ordene e imprima a lista de veículos cadastradas no sistema, do maior para o menor ano de fabricação;*/
        veiculosList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.print("------------------------------------------------------------------");
        System.out.println("\n--lista de veiculos por ano de fabricação em ordem descrescente:"+veiculosList);

         /*2.b) Ordene e imprima a lista de automóveis cadastradas no sistema, na mesma ordem
        do item a;*/
        System.out.print("-----------------------------------------------------------");
        System.out.print("\n--lista de automoveis cadastrados por ano de fabricação: ");
        //ordenadacao da lista veiculosList pelo ano de fabricacao
        veiculosList.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        for (Veiculo v : veiculosList) {
            if (v instanceof Automovel) { //instancia de Automovel
                System.out.print(v);
            }
        }

        //c) Ordene e imprima a lista de bicicletas cadastradas no sistema, na mesma ordem do item a;

        System.out.print("\n\n--lista de bicicletas cadastrados por ano de fabricacao: ");
        for (Veiculo v : veiculosList) {
            if (v instanceof Bicicleta) {
                System.out.print(v);
            }
        };

        /*d. Ordene e imprima a lista de veículos que possuem placas que começam pela letra
        “I” ou “i” (organize o código para que dois ou mais veículos tenham placas que
        comecem por “I” ou “i”), em ordem crescente pelo ano de fabricação.*/

        System.out.print("\n\nLista de VEÍCULOS que a placa começa por I ou i:\n");
        veiculosList.sort(Comparator.comparing(Veiculo::getAnoFabricacao)); //reordena em ordem crescente
        for (Veiculo v : veiculosList) {
            if (v instanceof Automovel) {
                if( ((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i") ) {
                    System.out.print(v);
                }
            }
        };

    }
}
