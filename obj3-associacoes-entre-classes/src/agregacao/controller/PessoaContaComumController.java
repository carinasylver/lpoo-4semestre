package agregacao.controller;

import agregacao.model.pessoaContaComum.Pessoa;
public class PessoaContaComumController {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "camila",
                "rua das flores",
                96030350,
                "53991587452",
                30000,
                1
        );
        System.out.println(pessoa);
    }

}
