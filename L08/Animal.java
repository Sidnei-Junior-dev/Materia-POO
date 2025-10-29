package L08;

import java.util.ArrayList;

public class Animal{
    private String nome;
    private String especie;
    private int idade;
    private String historico;
    private Tutor tutor;
    private ArrayList<Atendimento> atendimentos = new ArrayList<>();
    
    public Animal(String nome, Tutor tutor) {
		this.nome = nome;
		this.tutor = tutor;
	}
    public String getNome(){
        return nome;
    }

    public Tutor getTutor(){
        return tutor;
    }

    public void setTutor(Tutor tutor){
        this.tutor = tutor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getHistorico(){
        return historico;
    }

    public void setHistorico(String historico){
        this.historico = historico;
    }

    public void adicionarHistorico(String historico) {
		if (this.historico == null || this.historico.isEmpty()) {
			this.historico = historico;
		} else {
			this.historico += ", " + historico;
		}
	}

    public ArrayList<Atendimento> getAtendimentos(){
        return atendimentos;
    }

    public void adicionarAtendimento(Atendimento atendimento){
        atendimentos.add(atendimento);
    }

    public void removerAtendimento(Atendimento atendimento){
        atendimentos.remove(atendimento);
    }
}