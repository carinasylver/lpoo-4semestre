package model;

public class UnidadePelotas extends Imobiliaria {
    private Double taxaDeComissao;


    public UnidadePelotas() {
    }

    public UnidadePelotas(String razaoSocial, String cnpj, Double previsaoDeFaturamento, Double taxaDeComissao) {
        super(razaoSocial, cnpj, previsaoDeFaturamento);
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
        return previsaoDeFaturamento * 0.02;
    }

    @Override
    public String toString() {
        return "\nUnidadePelotas{" +
                "taxaDeComissao=" + taxaDeComissao +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", previsaoFaturamento=" + previsaoDeFaturamento +
                "} ";
    }
}
