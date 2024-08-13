package obj3Lista1.EmpresaFuncionario.controller;

import obj3Lista1.EmpresaFuncionario.model.Empresa;
import obj3Lista1.EmpresaFuncionario.model.Funcionario;
import obj3Lista1.alunoDisciplina.model.Disciplina;

import java.time.LocalDate;
import java.util.Comparator;

public class EmpresaFuncionarioController {
    public static void main(String[] args) {
        /*a. Crie um objeto da classe Empresa e dois objetos da classe Funcionário, e insira
        valores válidos em seus atributos;*/

        Empresa empresa = new Empresa(
                "12345678901234",
                "empresa x",
                "empresa x ltda"
        );

        Funcionario funcionario1 = new Funcionario(
                1L,
                "12345678910",
                "maria",
                "silveira",
                LocalDate.of(2000, 1, 1),
                empresa
        );
        Funcionario funcionario2 = new Funcionario(
                2L,
                "12345678911",
                "joao",
                "pereira",
                LocalDate.of(2003, 5, 10),
                empresa
        );
        /*b. Adicione todos os funcionários na empresa;*/
        empresa.getFuncionarios().add(funcionario1);
        empresa.getFuncionarios().add(funcionario2);

        /*c. Imprima a lista de funcionários em ordem crescente, critério nome.*/
        empresa.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(empresa.getFuncionarios());
        System.out.println("------------------------------------------------------");



    }
}
