package composicao.model.revista;

import java.util.ArrayList;
import java.util.List;

public class RevistaCientifica {
    private String tituloRevista;
    private long issnRevista;
    private String periodoRevista;

    List<Edicao> edicoes = new ArrayList<>();
}
