package conceitoHerancaMultipla;

public abstract class Funcionario {
    //atributos
    private String nome;
    private double salario;

    //construtor parametrizado
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //metodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //metodo  abstrato. no diagrama esta em italico
    //obrigatorio implementaçao nas classe filhas
    public abstract double getBonus();
}
