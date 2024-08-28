package model;

import java.math.BigDecimal;

public class Gerente extends Funcionario{
    private double taxaDeBonificacao;

    public Gerente(Long matricula, String nomeCompleto, String email, String telefone, BigDecimal salario, double taxaDeBonificacao) {
        super(matricula, nomeCompleto, email, telefone, salario);
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    public double getTaxaDeBonificacao() {
        return taxaDeBonificacao;
    }

    public void setTaxaDeBonificacao(double taxaDeBonificacao) {
        this.taxaDeBonificacao = taxaDeBonificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "taxaDeBonificacao=" + taxaDeBonificacao +
                ", matricula=" + matricula +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                "} ";
    }
}
