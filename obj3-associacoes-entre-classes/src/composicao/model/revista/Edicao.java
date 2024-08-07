package composicao.model.revista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Edicao {
    private int numeroEdicao;
    private int volumeEdicao;
    private LocalDate dataEdicao;
    private int tiragemEdicao;

    List<Artigo> artigos = new ArrayList<>();
    private RevistaCientifica revista;

}
