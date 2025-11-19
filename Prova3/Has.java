//Usa uma tabela de dispersão (hash table) para armazenar dados.
//Permite null como chave e valor.
//Não garante ordem dos elementos.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Has {
    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Maria", 8);
        notas.put("João", 9);
        notas.put("Ana", 7);

        System.out.println(notas.get("João")); // 9
        

        //TreeMap
        //Mantém os elementos ordenados pela chave.
        //Não aceita null como chave.
        Map<String, Integer> notasOrdenadas = new TreeMap<>(notas);
        System.out.println(notasOrdenadas);
    }
}
