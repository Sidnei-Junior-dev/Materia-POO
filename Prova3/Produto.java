import java.util.Objects;

public class Produto {
    private int id;
    private String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto)) return false;
        Produto outro = (Produto) obj;
        return id == outro.id && nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}

/*
    Teste:
    Produto p1 = new Produto(1, "Caneta");
    Produto p2 = new Produto(1, "Caneta");
    System.out.println(p1.equals(p2)); // true
*/  
