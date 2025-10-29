package L08;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atendimento {
    private LocalDate data;
    private String descricao;
    private Veterinario veterinario;
    private Animal animal;
    private ArrayList<Procedimento> procedimentos = new ArrayList<>();

    public Atendimento(LocalDate data, String descricao, Animal animal, Veterinario veterinario) {
		this.data = data;
		this.descricao = descricao;
		this.animal = animal;
		this.veterinario = veterinario;
	}

    public ArrayList<Procedimento> getProcedimentos(){
        return procedimentos;
    }

    public void adicionarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    public void removerProcedimento(Procedimento procedimento) {
        procedimentos.remove(procedimento);
    }

    public LocalDate getData() {
		return data;
	}

    public void setData(LocalDate data){
        this.data = data;
    }

    public Veterinario getVeterinario(){
        return veterinario;
    }

    public void setVetinario(Veterinario veterinario){
        this.veterinario = veterinario;
    }
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public void registrar(){
        System.out.println("Consulta registrada para o " + animal.getNome() + " com o veterinário " + veterinario.getNome());
    }

    public String exibirDados() {
        StringBuilder dados = new StringBuilder();
        dados.append("Data: ").append(data).append("\n");
        dados.append("Descrição: ").append(descricao).append("\n");
        dados.append("Animal: ").append(animal.getNome()).append("\n");
        dados.append("Veterinário- ").append(veterinario.retornaDados()).append("\n");
        dados.append("Procedimentos:\n");

        if (procedimentos != null && !procedimentos.isEmpty()) {
            for (Procedimento procedimento : procedimentos) {
                dados.append("- ").append(procedimento.toString()).append("\n");
            }
        } else {
            dados.append("- Nenhum procedimento realizado.\n");
        }

        return dados.toString();
    }
}
