package associacaoBinaria.model;


import java.time.LocalDate;
//import java.util.Date;

public class Dependente {
    private String nomeDependente;

    //private Date aniversarioDependente;
    private LocalDate aniversarioDependente;

    private Socio socio;
    /*se existir um objeto da classe Dependente, terá de se relacionar obrigatoriamente com um objeto
    da classe Socio, isto significa que esta é 1..1, ou seja, um objeto da classe Dependente precisa relacionar-se exclusivamente com um
    objeto da classe Socio.*/


    public Dependente(String nomeDependente, LocalDate aniversarioDependente) {
        this.nomeDependente = nomeDependente;
        this.aniversarioDependente = aniversarioDependente;
    }

    public Dependente(String nomeDependente, LocalDate aniversarioDependente, Socio socio) {
        this.nomeDependente = nomeDependente;
        this.aniversarioDependente = aniversarioDependente;
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "\nDependente{" +
                "nomeDependente='" + nomeDependente + '\'' +
                ", aniversarioDependente=" + aniversarioDependente +
                ", socio=" + socio +
                '}';
    }
}


