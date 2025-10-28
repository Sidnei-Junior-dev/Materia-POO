import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Calculadora;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void vum(){
        assertEquals(2, calc.calculador(1,1));
    }
}
