package associacaoBinaria.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nomeSocio;
    private String enderecoSocio;
    private String telefoneSocio;
    //private Date aniversarioSocio;
    private LocalDate aniversarioSocio;

    //ligacao entre socio e dependente

    /*um objeto da classe Socio pode relacionar-se ou não com instâncias da classe Dependente, conforme
    demonstra a multiplicidade 0..*  */
    List<Dependente> dependentes = new ArrayList<>();

    public Socio(String nomeSocio, String enderecoSocio, String telefoneSocio, LocalDate aniversarioSocio) {
        this.nomeSocio = nomeSocio;
        this.enderecoSocio = enderecoSocio;
        this.telefoneSocio = telefoneSocio;
        this.aniversarioSocio = aniversarioSocio;
    }

    public Socio(String nomeSocio, String enderecoSocio, String telefoneSocio, LocalDate aniversarioSocio, List<Dependente> dependentes) {
        this.nomeSocio = nomeSocio;
        this.enderecoSocio = enderecoSocio;
        this.telefoneSocio = telefoneSocio;
        this.aniversarioSocio = aniversarioSocio;
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "\nSocio{" +
                "nomeSocio='" + nomeSocio + '\'' +
                ", enderecoSocio='" + enderecoSocio + '\'' +
                ", telefoneSocio='" + telefoneSocio + '\'' +
                ", aniversarioSocio=" + aniversarioSocio +
                ", dependentes=" + dependentes +
                '}';
    }
}

