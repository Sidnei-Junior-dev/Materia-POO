import org.example.ProjetoPublico;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CriacaoValidaDuracao {
    @Test
    public void testCriacaoValidaDuracao() {
        ProjetoPublico p = new ProjetoPublico();
        p.setNumero(101);
        p.setDataInicio(LocalDate.ofEpochDay(2023-01-01));
        p.setDataFim(LocalDate.ofEpochDay(2023-01-31));

        assertEquals(30, p.getDuracao(), "A duracao deve ser 30 dias");
        assertTrue(p.getResumo().contains("30 dias"), "O resumo deve conter a expressao '30 dias'");
    }
}
