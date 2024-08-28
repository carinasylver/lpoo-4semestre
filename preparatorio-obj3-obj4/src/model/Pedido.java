package model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido{
    private String numero;
    private LocalDateTime data;
    private BigDecimal total;

    //ligacao entre Pedido e Vendedor
    private Vendedor vendedor;

    //ligacao entre Pedido e Estado
    private Estado estado;

    //ligacao entre Pedido e Item
    List<Item> itens = new ArrayList<>();


    public Pedido() {
    }

    public Pedido(String numero, LocalDateTime data, BigDecimal total, Vendedor vendedor, Estado estado, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.total = total;
        this.vendedor = vendedor;
        this.estado = estado;
        this.itens = itens;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero='" + numero + '\'' +
                ", data=" +  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data) +
                ", total=" + NumberFormat.getCurrencyInstance().format(total)+
                ", vendedor=" + vendedor +
                ", estado=" + estado +
                ", itens=" + itens +
                '}';
    }
}
