package lista1.exer2ManipulacaoDeColecoes.model;

public class Conta {
    private Long id;
    private double saldo;

    //CONSTRUTOR PARAMETRIZADO
    public Conta(Long id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Conta(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    //metodo acessor
    public double getSaldo() {  //no uml
        return saldo;
    }


    //metodos da classe no uml
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("\nDeposito realizado com sucesso. Saldo atual= " + this.saldo);
    }
    public void sacar(double valor) {
        if (valor <= this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        else{
            this.saldo -= valor;
            System.out.println("\nSaque realizado com sucesso. Saldo atual= " + this.saldo);
        }

    }
    public void atualizar(double taxa) {
        this.saldo += this.saldo * (taxa/100);
        System.out.println("\nSaldo atualizado com sucesso. Saldo atual= " + this.saldo);
    }

    //metodo utilitario(converte objeto em string)
    @Override
    public String toString() {
        return "\nConta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
