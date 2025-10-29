package L08;

public class Procedimento {
    private String nome;
    private double custo;
    private String observacao;

    public Procedimento(String nome) {
		this.nome = nome;
	}

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getCusto(){
        return custo;
    }

    public void setCusto(double custo){
        this.custo = custo;
    }

    public String getObservacao(){
        return observacao;
    }

    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    
    @Override
	public String toString() {
		return "Procedimento: " + nome + ", Custo: R$" + custo + ", Observações: " + (observacao != null ? observacao : "Nenhuma");
	}
}
