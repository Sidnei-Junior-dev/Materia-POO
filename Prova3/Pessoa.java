//Usada quando a própria classe define sua forma de comparação.

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.nome);
    }
}

/* 
List<Pessoa> lista = new ArrayList<>();
lista.add(new Pessoa("Carlos", 25));
lista.add(new Pessoa("Ana", 30));
Collections.sort(lista);
*/