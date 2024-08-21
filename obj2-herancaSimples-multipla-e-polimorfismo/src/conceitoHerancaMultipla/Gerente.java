package conceitoHerancaMultipla;

public class Gerente extends Funcionario implements Investidor{

    // construtor parametrizado
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //sobrescrita do metodo que esta na classe Interface
    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public String getTicker() {
        return null;
    }

    @Override
    public void setTicker(String ticker) {

    }

    @Override
    public int getQuantidade() {
        return 0;
    }

    @Override
    public void setQuantidade(int quantidade) {
    }


    //metodo utilitario(converte objeto em string)
    @Override
    public String toString() {
        return "Gerente{" +
                "bonus=" + getBonus() +
                ", ticker='" + getTicker() + '\'' +
                ", quantidade=" + getQuantidade() +
                ", nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                "} " + super.toString();
    }
}
