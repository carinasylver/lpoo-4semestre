package lista1HerancaSimples.model;

public class GerenteDesenvolvimento extends Gerente{

    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        //ii) O gerente de desenvolvimento R$ 4.500,00 mais 20% de bônus;
        return getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvimento{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} " + super.toString();
    }
}
