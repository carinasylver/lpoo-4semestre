package classeAssociativa.model.fornecedorProduto;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private int cnpj;
    private String contato;
    private String nome;

    //ligacao entre fornecedor e produto
    List<Produto> produtos = new ArrayList<>();

    public Fornecedor() {
    }

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public boolean manterFornec(int cnpj);

}
