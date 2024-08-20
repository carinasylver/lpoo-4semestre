package model;

public abstract class Imovel implements Portfolio{
    protected String tipoDeLogradouro;
    protected String logradouro;
    protected Integer numero;
    protected String complemento;
    protected String bairro;
    protected String cep;
    protected String cidade;
    protected Double areaUtil;
    protected Double precoDeCotacao;
    protected Double precoDeVenda;

    private Double ITBI;

    public Imovel() {
    }

    public Imovel(String tipoDeLogradouro, String logradouro, Integer numero, String complemento, String bairro, String cep, String cidade, Double areaUtil, Double precoDeCotacao, Double precoDeVenda, Double ITBI) {
        this.tipoDeLogradouro = tipoDeLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.areaUtil = areaUtil;
        this.precoDeCotacao = precoDeCotacao;
        this.precoDeVenda = precoDeVenda;
        this.ITBI = ITBI;
    }

    public String getTipoDeLogradouro() {
        return tipoDeLogradouro;
    }

    public void setTipoDeLogradouro(String tipoDeLogradouro) {
        this.tipoDeLogradouro = tipoDeLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(Double areaUtil) {
        this.areaUtil = areaUtil;
    }

    public Double getPrecoDeCotacao() {
        return precoDeCotacao;
    }

    public void setPrecoDeCotacao(Double precoDeCotacao) {
        this.precoDeCotacao = precoDeCotacao;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    @Override
    public Double getITBI() {
        return ITBI;
    }

    public void setITBI(Double ITBI) {
        this.ITBI = ITBI;
    }

    //public abstract double calcularITBI();
}
