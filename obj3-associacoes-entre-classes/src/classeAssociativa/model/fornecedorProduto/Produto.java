package classeAssociativa.model.fornecedorProduto;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    //ligacao entre produto e fornecedor
    List<Fornecedor> fornecedores = new ArrayList<>();

    public Produto() {
    }
}
