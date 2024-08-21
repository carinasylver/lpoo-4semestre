package model;

public abstract class Imobiliaria implements Portfolio{
    //atributos
    protected String razaoSocial;
    protected String cnpj;
    protected Double previsaoDeFaturamento;

    //private Double ITBI;


    public Imobiliaria() {
    }

    public Imobiliaria(String razaoSocial, String cnpj, Double previsaoDeFaturamento) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.previsaoDeFaturamento = previsaoDeFaturamento;
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

    public Double getPrevisaoDeFaturamento() {
        return previsaoDeFaturamento;
    }

    public void setPrevisaoDeFaturamento(Double previsaoDeFaturamento) {
        this.previsaoDeFaturamento = previsaoDeFaturamento;
    }

    public abstract Double getITBI();

}
