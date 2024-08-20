package model;

public class Apartamento extends Imovel{
    private String nomeDoCondomio;

    public Apartamento() {
    }

    public Apartamento(String tipoDeLogradouro, String logradouro, Integer numero, String complemento, String bairro, String cep, String cidade, Double areaUtil, Double precoDeCotacao, Double precoDeVenda, Double ITBI, String nomeDoCondomio) {
        super(tipoDeLogradouro, logradouro, numero, complemento, bairro, cep, cidade, areaUtil, precoDeCotacao, precoDeVenda, ITBI);
        this.nomeDoCondomio = nomeDoCondomio;
    }

    public String getNomeDoCondomio() {
        return nomeDoCondomio;
    }

    public void setNomeDoCondomio(String nomeDoCondomio) {
        this.nomeDoCondomio = nomeDoCondomio;
    }

    @Override
    public Double getITBI() {
        return super.getITBI() * 0.04;
    }

    @Override
    public String toString() {
        return "\nApartamento{" +
                "nomeDoCondomio='" + nomeDoCondomio + '\'' +
                ", tipoDeLogradouro='" + tipoDeLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", areaUtil=" + areaUtil +
                ", precoDeCotacao=" + precoDeCotacao +
                ", precoDeVenda=" + precoDeVenda +
                ", ITBI=" + getITBI() +
                "} ";
    }
}
