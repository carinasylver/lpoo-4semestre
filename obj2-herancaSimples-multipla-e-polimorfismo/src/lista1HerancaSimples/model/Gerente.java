package lista1HerancaSimples.model;

public class Gerente extends Funcionario{

    //construtor vazio herdado de Funcionario
    public Gerente() {
    }

    //construtor parametrizado herdados os atributos de Funcionario
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //metodo abstract em Funcionario obrigatorio ser implementado na classe filha(Gerente)
    @Override
    public double getBonus() {
        //System.out.println("Bonus de gerente R$" + salario * 0.2);
        /*f) Faça o programa retornar o bônus de cada um dos funcionários, seguindo a seguinte regra:
        para Gerente = 20%, e para Desenvolvedor = 5%. Imprima-os.*/
        return getSalario() * 0.2;

    }

    @Override
    public String toString() {
        return "\nGerente{nome: "+ getNome()+ "" +
                ", salario:"+getSalario()+
                "}";
    }
}