package obj3Lista1.usuarioCorridaMotoristaVeiculo.model;

public class Veiculo {
    private String placa;
    private String renavam;
    private String fabricante;
    private String modelo;
    private Integer anoFabricacao;

    //ligacao entre classe veiculo x motorista
    private Motorista motorista;

    public Veiculo(String placa, String renavam, String fabricante, String modelo, Integer anoFabricacao) {
        this.placa = placa;
        this.renavam = renavam;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Veiculo(String placa, String renavam, String fabricante, String modelo, Integer anoFabricacao, Motorista motorista) {
        this.placa = placa;
        this.renavam = renavam;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "\nVeiculo{" +
                "placa='" + placa + '\'' +
                ", renavam='" + renavam + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
