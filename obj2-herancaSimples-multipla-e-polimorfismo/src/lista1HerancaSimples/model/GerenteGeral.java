package lista1HerancaSimples.model;

public class GerenteGeral extends Gerente{

    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        //i) O gerente geral recebe por mês o salário de R$ 6.500,00 mais 40% de bônus;
        return getSalario() * 0.4;

    }

    @Override
    public String toString() {
        return "\nGerenteGeral{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} " + super.toString();
    }
}
