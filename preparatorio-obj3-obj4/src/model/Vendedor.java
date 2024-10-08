package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario{
    private double taxaDeComissao;

    //ligacao entre vendedor e Regiao
    private Regiao regiao;

    //ligacao entre Vendedor e Pedido
    List<Pedido> pedidos = new ArrayList<>();

    public Vendedor() {
    }

    public Vendedor(Long matricula, String nomeCompleto, String email, String telefone, BigDecimal salario, double taxaDeComissao, Regiao regiao) {
        super(matricula, nomeCompleto, email, telefone, salario);
        this.taxaDeComissao = taxaDeComissao;
        this.regiao = regiao;
    }

    public Vendedor(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", regiao=" + regiao +
                ", pedidos=" + pedidos +
                ", matricula=" + matricula +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", salario=" + salario +
                "} ";
    }
}
