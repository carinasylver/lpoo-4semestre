package lista1HerancaSimples.model;

public class DesenvolvedorJunior extends Desenvolvedor{

    //construtor parametrizado
    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    //regra de negocio
    //metodo acessor
    @Override
    public double getBonus(){
        //júnior e recebem R$ 1.800,00 por mês  mais 5% de bônus
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorJunior{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} ";
    }
}
