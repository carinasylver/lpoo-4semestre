package lista1HerancaSimples.model;

public class Desenvolvedor extends Funcionario{

    //construtor vazio herdado de Funcionario
    public Desenvolvedor() {
    }

    //construtor parametrizado herdados os atributos de Funcionario
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    //metodo abstract em Funcionario obrigatorio ser implementado na classe filha(Desenvolvedor)
    @Override
    public double getBonus(){
        /*f) Faça o programa retornar o bônus de cada um dos funcionários, seguindo a seguinte regra:
        para Gerente = 20%, e para Desenvolvedor = 5%. Imprima-os.*/
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "  nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} ";
    }
}
