package model;

public class UnidadePortoAlegre extends Imobiliaria{
    private Double taxaDeComissao;

    public UnidadePortoAlegre() {
    }

    public UnidadePortoAlegre(String razaoSocial, String cnpj, Double previsaoFaturamento, Double taxaDeComissao) {
        super(razaoSocial, cnpj, previsaoFaturamento);
        this.taxaDeComissao = taxaDeComissao;
    }

    public Double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(Double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }


    @Override
    public Double getITBI() {
        return previsaoDeFaturamento * 0.025;
    }

    @Override
    public String toString() {
        return "\nUnidadePortoAlegre{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoFaturamento=" + previsaoDeFaturamento +
                "} ";
    }
}
