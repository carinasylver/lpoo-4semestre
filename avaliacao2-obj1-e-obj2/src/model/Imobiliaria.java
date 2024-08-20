package model;

public abstract class Imobiliaria implements Portfolio{
    //atributos
    protected String razaoSocial;
    protected String cnpj;
    protected Double previsaoFaturamento;

    private Double ITBI;

    public Imobiliaria() {
    }

    //construtor parametrizado

    public Imobiliaria(String razaoSocial, String cnpj, Double previsaoFaturamento, Double ITBI) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.previsaoFaturamento = previsaoFaturamento;
        this.ITBI = ITBI;
    }
    //metodos acessores


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getPrevisaoFaturamento() {
        return previsaoFaturamento;
    }

    public void setPrevisaoFaturamento(Double previsaoFaturamento) {
        this.previsaoFaturamento = previsaoFaturamento;
    }

    @Override
    public Double getITBI() {
        return ITBI;
    }

    public void setITBI(Double ITBI) {
        this.ITBI = ITBI;
    }

}
