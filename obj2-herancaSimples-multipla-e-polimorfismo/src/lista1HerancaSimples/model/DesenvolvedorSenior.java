package lista1HerancaSimples.model;

public class DesenvolvedorSenior extends Desenvolvedor{
    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    //regra de negocio
    //metodo acessor\
    @Override
    public double getBonus(){
        //6 são sênior que recebem R$ 3.500,00 por mês mais 10% de bônus
        return getSalario() * 0.10;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorSenior{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} ";
    }
}
