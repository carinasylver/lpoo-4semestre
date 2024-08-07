package agregacao.model.pessoaContaComum;

public class Pessoa {

    protected String nomePessoa;
    protected String enderecoPessoa;
    protected long cepPessoa;
    protected String telefonePessoa;
    protected double rendaPessoa;
    protected int situacaoPessoa = 1;

    public Pessoa(String nomePessoa, String enderecoPessoa, long cepPessoa, String telefonePessoa, double rendaPessoa, int situacaoPessoa) {
        this.nomePessoa = nomePessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.cepPessoa = cepPessoa;
        this.telefonePessoa = telefonePessoa;
        this.rendaPessoa = rendaPessoa;
        this.situacaoPessoa = situacaoPessoa;
    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", enderecoPessoa='" + enderecoPessoa + '\'' +
                ", cepPessoa=" + cepPessoa +
                ", telefonePessoa='" + telefonePessoa + '\'' +
                ", rendaPessoa=" + rendaPessoa +
                ", situacaoPessoa=" + situacaoPessoa +
                '}';
    }
}
