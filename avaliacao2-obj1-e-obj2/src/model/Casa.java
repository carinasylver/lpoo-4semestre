package model;

public class Casa extends Imovel{
    private Double tamanhoDoTerreno;


    public Casa() {
    }

    public Casa(String tipoDeLogradouro, String logradouro, Integer numero, String complemento, String bairro, String cep, String cidade, Double areaUtil, Double precoDeCotacao, Double precoDeVenda, Double tamanhoDoTerreno) {
        super(tipoDeLogradouro, logradouro, numero, complemento, bairro, cep, cidade, areaUtil, precoDeCotacao, precoDeVenda);
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }

    public Double getTamanhoDoTerreno() {
        return tamanhoDoTerreno;
    }

    public void setTamanhoDoTerreno(Double tamanhoDoTerreno) {
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }


    @Override
    public Double getITBI() {
        return precoDeCotacao * 0.03;
    }


    @Override
    public String toString() {
        return "\nCasa{" +
                "tipoDeLogradouro='" + tipoDeLogradouro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", areaUtil=" + areaUtil +
                ", precoDeCotacao=" + precoDeCotacao +
                ", precoDeVenda=" + precoDeVenda +
                "} ";
    }


}
