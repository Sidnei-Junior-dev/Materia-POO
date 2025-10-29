import org.example.Profissional;
import org.example.Projeto;
import org.example.TipoProjeto;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdicionarProjeto {
    @Test
    public void testAdicionarProjeto(){
        Profissional p1 = new Profissional();
        Projeto prj = new Projeto() {
            @Override
            public TipoProjeto getTipoProjeto() {
                return null;
            }

            @Override
            public String getResumo() {
                return "";
            }
        };

        p1.adicionaProjeto(prj);

        assertEquals(1, p1.getProjetos().size(),"Deve haver exatamente 1 projeto associado");
        assertTrue(p1.getProjetos().contains(prj), "A lista de projetos deve conter o objeto Prj");
    }
}
