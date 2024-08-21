package lista1HerancaMultipla.exer1.model;

public class Caminhao extends Veiculo implements Automovel{

    //preciso colocar os atributos dos métodos da interface na classe q esta implementando dela

    //atributos da propria classe
    private int capacidadeDeCarga;

    //atributos da interface Automovel
    private String renavam;
    private String chassi;
    private String placa;

    //heranca de atributos de veiculo


    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    //sobrescrita dos metodos abstratos da interface Automovel
    @Override
    public String getRenavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nCaminhao{" +
                "capacidadeDeCarga=" + capacidadeDeCarga +
                ", renavam='" + renavam + '\'' +
                ", chassi='" + chassi + '\'' +
                ", placa='" + placa + '\'' +
                ", numeroDeEixos=" + getNumeroDeEixos() +
                ", propulsao='" + getPropulsao() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                "} ";
    }
}
