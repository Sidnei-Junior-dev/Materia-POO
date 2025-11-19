import java.io.*;
// Usadas para serializar objetos — ou seja, converter um objeto em bytes para armazenar em arquivo. O objeto deve implementar a interface Serializable.

class Pessoa implements Serializable {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}

public class ExemploObjeto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Pessoa p = new Pessoa("Ana", 30);

        // Gravar objeto
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pessoa.dat"));
        out.writeObject(p);
        out.close();

        // Ler objeto
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("pessoa.dat"));
        Pessoa recuperada = (Pessoa) in.readObject();
        in.close();

        System.out.println("Objeto lido: " + recuperada);
    }
}