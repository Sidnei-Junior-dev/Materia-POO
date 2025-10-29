import org.example.Profissional;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtribuicaoValidaDados {

    @Test
    public void testAtribuicaoValidaDados(){
        Profissional p1 = new Profissional();

        p1.setCpf("1221312");
        p1.setNome("Sidnei");

        assertEquals("Sidnei", p1.getNome());
        assertEquals("1221312", p1.getCpf());
    }
}
