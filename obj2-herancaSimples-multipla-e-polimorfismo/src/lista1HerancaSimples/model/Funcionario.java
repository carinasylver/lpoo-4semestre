package lista1HerancaSimples.model;

public abstract class Funcionario {  //abstract significa q nao posso ter objetos da classe Funcionario instanciados em controller
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //METODOS ACESSORES
    public String getNome() { //no uml
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() { //no uml
        return salario;
    }

    public void setSalario(double salario) { //no uml
        this.salario = salario;
    }

    //Bonus em itálico no diagrama significa q metodo eh abstract

    public abstract double getBonus(); //implementação obrigatoria nas classes filhas
}
