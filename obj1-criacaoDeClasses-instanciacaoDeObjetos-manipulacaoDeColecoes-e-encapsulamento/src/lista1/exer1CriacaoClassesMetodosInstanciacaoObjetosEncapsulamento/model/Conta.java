package lista1.exer1CriacaoClassesMetodosInstanciacaoObjetosEncapsulamento.model;

public class Conta {
    //ATRIBUTO
    private double saldo; //inicializa com 0 o saldo


    //METODO CONSTRUTOR PADRAO OU VAZIO
    public Conta() {
    }

    //METODO CONSTRUTOR PARAMETRIZADO
    public Conta(double saldo) {
        this.saldo = saldo;
    }

   //METODO ACESSOR
   public double getSaldo() { //esta no uml
       return saldo;
   }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //METODOS DA CLASSE
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso. Saldo atual= " + this.saldo);
    }
    public void sacar(double valor){
        if(this.saldo <= valor){
            System.out.println("Saldo insuficiente");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual= " + this.saldo);
        }

    }

    public void atualizar(double taxa){
        this.saldo += this.saldo * taxa/100;
        System.out.println("Saldo atualizado com sucesso. Saldo atual= " + this.saldo);
    }

    //METODO UTILITARIO(CONVERTE OBJETO EM STRING)
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
