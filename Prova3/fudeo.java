// Baseada em lista duplamente encadeada.
// Inserções e remoções rápidas, mas acesso por índice é mais lento.
import java.util.LinkedList;
import java.util.List;

public class fudeo {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();
        nomes.add("Carlos");
        nomes.addFirst("Beatriz");

        System.out.println(nomes);
    }
}

