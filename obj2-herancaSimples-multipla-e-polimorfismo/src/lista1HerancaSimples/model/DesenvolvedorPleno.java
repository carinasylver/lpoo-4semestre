package lista1HerancaSimples.model;

public class DesenvolvedorPleno extends Desenvolvedor{

    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    //regra de negocio
    //metodo acessor
    @Override
    public double getBonus(){
        //6 são pleno e recebem R$ 2.500,00 por mês mais 5% de bônus
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorPleno{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} ";
    }
}
