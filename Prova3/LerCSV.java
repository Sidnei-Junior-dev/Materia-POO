import java.io.*;
import java.util.*;

public class LerCSV {
    public static void main(String[] args) throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("pessoas.csv"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(";");
                int id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                int idade = Integer.parseInt(campos[2]);
                pessoas.add(new Pessoa(id, nome, idade));
            }
        }

        pessoas.forEach(System.out::println);
    }
}

/*
    List<Pessoa> pessoas = Files.lines(Paths.get("pessoas.csv"))
    .map(linha -> linha.split(";"))
    .map(campos -> new Pessoa(
        Integer.parseInt(campos[0]),
        campos[1],
        Integer.parseInt(campos[2])
    ))
    .toList();
*/