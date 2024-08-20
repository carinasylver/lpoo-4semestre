package model;

public class UnidadePortoAlegre extends Imobiliaria{
    private Double taxaDeComissao;

    public UnidadePortoAlegre() {
    }

    public UnidadePortoAlegre(String razaoSocial, String cnpj, Double previsaoFaturamento, Double ITBI, Double taxaDeComissao) {
        super(razaoSocial, cnpj, previsaoFaturamento, ITBI);
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
        return super.getPrevisaoFaturamento() * 0.25;
    }

    @Override
    public String toString() {
        return "\nUnidadePortoAlegre{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoFaturamento=" + previsaoFaturamento +
                ", ITBI=" + getITBI() +
                "} ";
    }
}
