package conceitoHerancaMultipla;

public class Desenvolvedor extends Funcionario{

    //contrutor parametrizado
    //herda os atributos da classe mae(funcionario)
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 0;
    }

    //metodo utilitario(converte objeto em string)
    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "bonus=" + getBonus() +
                ", nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} ";
    }
}
