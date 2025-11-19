import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

// Cada objeto pode ter um método que retorna seus dados formatados para o arquivo CSV. Em seguida, podemos gravar todos os objetos em um arquivo de forma simples.

class Pessoa {
    private int id;
    private String nome;
    private int idade;

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public String toCSV() {
        return id + ";" + nome + ";" + idade;
    }
}

public class GravarCSV {
    public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1, "Ana", 30));
        pessoas.add(new Pessoa(2, "Carlos", 25));

        try (PrintWriter writer = new PrintWriter("pessoas.csv")) {
            for (Pessoa p : pessoas) {
                writer.println(p.toCSV());
            }
        }

        System.out.println("Arquivo CSV gerado com sucesso!");
    }
}