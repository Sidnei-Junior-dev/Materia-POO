import org.example.Profissional;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AtribuicaoDadosNulosVazios {
    @Test
    public void testAtribuicaoDadosNulosVazios() {
        Profissional p1 = new Profissional();

        p1.setCpf(null);
        p1.setNome("");

        assertNull(p1.getCpf(), "O CPF deve ser null");
        assertEquals("", p1.getNome(),"O nome deve ser uma string vazia");
    }
}
