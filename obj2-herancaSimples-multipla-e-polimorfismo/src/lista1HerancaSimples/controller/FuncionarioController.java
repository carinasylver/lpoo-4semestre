package lista1HerancaSimples.controller;

import lista1HerancaSimples.model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {
        /*  exer1-c) Crie, no mínimo, duas instâncias de cada classe deste diagrama (das possíveis) em um
         *   controlador específico. Tenha o cuidado de criar estas instâncias de diferentes formas, ou
         *   seja, utilize construtores padrão e parametrizado;
         * */
        //objeto funcionario1 da classe Funcionario
        //Funcionario funcionario1 = new Funcionario(); //'Funcionario' is abstract; cannot be instantiated

        Desenvolvedor dev1 = new Desenvolvedor();
        Desenvolvedor dev2 = new Desenvolvedor("catarina", 9000.0);

        Gerente ger1 = new Gerente();
        Gerente ger2 = new Gerente("Leia", 15000.0);

        //exer1-d) Imprima os objetos que você criou;
        System.out.println("--- objetos instanciados da classe Desenvolvedor VAZIO:");
        System.out.println(dev1);
        System.out.println("------------------------------");
        System.out.println("--- objeto instanciado da classe Desenvolvedor PARAMETRIZADO:");
        System.out.println(dev2);
        System.out.println("------------------------------");

        System.out.println("--- objetos instanciados da classe Gerente VAZIO:");
        System.out.println(dev1);
        System.out.println("------------------------------");
        System.out.println("--- objeto instanciado da classe gerente PARAMETRIZADO:");
        System.out.println(dev2);
        System.out.println("------------------------------");

        /*exer1-e) Altere o estado desses objetos, tenha o cuidado de atribuir valores válidos aos atributos, e
        imprima-os;*/
        dev1.setNome("maria");
        dev1.setSalario(10000.0);

        ger1.setNome("joao");
        ger1.setSalario(15000.0);

        dev2.setSalario(16000.0);
        ger2.setSalario(16000.0);

        System.out.println("--- salario dos desenvolvedores:");
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println("------------------------------");

        System.out.println("--- salario dos gerentes:");
        System.out.println(ger1);
        System.out.println(ger2);
        System.out.println("------------------------------");

        /*f) Faça o programa retornar o bônus de cada um dos funcionários, seguindo a seguinte regra:
        para Gerente = 20%, e para Desenvolvedor = 5%. Imprima-os.*/
        System.out.println("--- bonus dos desenvolvedores:");
        System.out.println("bonus de " + dev1.getNome() + " = " + dev1.getBonus());
        System.out.println("bonus de " + dev2.getNome() + " = " + dev2.getBonus());
        System.out.println("------------------------------");
        System.out.println("--- bonus dos gerentes:");
        System.out.println("bonus de " + ger1.getNome() + " = " + ger1.getBonus());
        System.out.println("bonus de " + ger2.getNome() + " = " + ger2.getBonus());
        System.out.println("------------------------------");

        /*g) Responda as seguintes questões (coloque suas respostas como comentário no controlador):
          i) Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.
          não eh possivel instanciar uma classe quando ela eh definida como abstrata

          ii) Onde você inseriu asregras de negócio solicitadas na questão “f”? Na classe Controller?
           Na classe Funcionário? Ou nas classes Gerente e Desenvolvedor? Justifique sua
           resposta.
           as regras de negocio devem ser modeladas nas classes gerente e desenvolvedor
         */

        /*exerc2:
            a) Suponha que os funcionários apresentados no diagrama de classes fazem parte de
            uma empresa, então, crie uma coleção de objetos para representar a estrutura de
            funcionários dessa empresa;
         */
        List<Funcionario> funcionarios = new ArrayList<>();

        /*b) Acrescente na coleção criada no item “a” vinte funcionários, sendo, 2 gerentes e 18
        desenvolvedores. Onde:*/
        //i) O gerente geral recebe por mês o salário de R$ 6.500,00 mais 40% de bônus;

        Gerente gerGeral= new GerenteGeral("joao", 6500.0);


        //ii) O gerente de desenvolvimento R$ 4.500,00 mais 20% de bônus;
        Gerente gerDev = new GerenteDesenvolvimento("maria", 4500.0);


        //iii) Os dezoito desenvolvedores estão divididos em grupos salariais,
        // 6 são sênior que recebem R$ 3.500,00 por mês mais 10% de bônus,
        Desenvolvedor devSenior1 = new DesenvolvedorSenior("pedro", 3500.0);
        Desenvolvedor devSenior2 = new DesenvolvedorSenior("ana", 3500.0);
        Desenvolvedor devSenior3 = new DesenvolvedorSenior("carlos", 3500.0);
        Desenvolvedor devSenior4 = new DesenvolvedorSenior("lucas", 3500.0);
        Desenvolvedor devSenior5 = new DesenvolvedorSenior("julia", 3500.0);
        Desenvolvedor devSenior6 = new DesenvolvedorSenior("mariana", 3500.0);

        // 6 são pleno e recebem R$ 2.500,00 por mês mais 5% de bônus, e
        Desenvolvedor devPleno1 = new DesenvolvedorPleno("mateus", 2500.0);
        Desenvolvedor devPleno2 = new DesenvolvedorPleno("lucia", 2500.0);
        Desenvolvedor devPleno3 = new DesenvolvedorPleno("gabriel", 2500.0);
        Desenvolvedor devPleno4 = new DesenvolvedorPleno("beatriz", 2500.0);
        Desenvolvedor devPleno5 = new DesenvolvedorPleno("rafael", 2500.0);
        Desenvolvedor devPleno6 = new DesenvolvedorPleno("carolina", 2500.0);

        // os demais são júnior e recebem R$ 1.800,00 por mês mais 5% de bônus.
        Desenvolvedor devJunior1 = new DesenvolvedorJunior("jose", 1800.0);
        Desenvolvedor devJunior2 = new DesenvolvedorJunior("ana", 1800.0);
        Desenvolvedor devJunior3 = new DesenvolvedorJunior("pedro", 1800.0);
        Desenvolvedor devJunior4 = new DesenvolvedorJunior("maria", 1800.0);
        Desenvolvedor devJunior5 = new DesenvolvedorJunior("carlos", 1800.0);
        Desenvolvedor devJunior6 = new DesenvolvedorJunior("lucas", 1800.0);


        funcionarios.add(gerGeral);
        funcionarios.add(gerDev);
        funcionarios.add(devSenior1);
        funcionarios.add(devSenior2);
        funcionarios.add(devSenior3);
        funcionarios.add(devSenior4);
        funcionarios.add(devSenior5);
        funcionarios.add(devSenior6);
        funcionarios.add(devPleno1);
        funcionarios.add(devPleno2);
        funcionarios.add(devPleno3);
        funcionarios.add(devPleno4);
        funcionarios.add(devPleno5);
        funcionarios.add(devPleno6);
        funcionarios.add(devJunior1);
        funcionarios.add(devJunior2);
        funcionarios.add(devJunior3);
        funcionarios.add(devJunior4);
        funcionarios.add(devJunior5);
        funcionarios.add(devJunior6);
        System.out.println(funcionarios);

        //c) Calcule e imprima qual é a folha salarial dessa empresa, COM bônus;
        double folhaSalarial = 0;
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("\n--folha salarial COM bonus: R$"+ folhaSalarial);
        System.out.println("------------------------------");

        //d) Calcule e imprima qual é a folha salarial dessa empresa, SEM bônus;
        folhaSalarial = 0;
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.getSalario();
        }
        System.out.println("--folha salarial SEM bonus: R$"+ folhaSalarial);

        //e) Calcule e imprima o valor do bônus e o salário bruto de cada um dos funcionários dessa empresa;
        System.out.println("\nBonus e salario bruto dos funcionarios");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("funcionario: "+funcionario.getNome() + ", bonus: "+funcionario.getBonus() +", salario bruto: "+ funcionario.getSalario());
        }

        /*f) Calcule e imprima a nova folha salarial dessa empresa, caso todos os funcionários,
                independente de cargo, tenham um reajuste salarial de 5%.*/
        System.out.println("\nNova folha salarial com reajuste de 5%");
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("folha salarial com reajuste de 5%: R$"+ folhaSalarial * 1.05);



    }
}
