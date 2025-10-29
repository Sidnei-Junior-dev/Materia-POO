package L08;

import java.time.LocalDate;

public class AtendimentoEmergencia extends Atendimento{
    private int nivelUrgencia;

    public AtendimentoEmergencia(LocalDate data, String descricao, Animal animal, Veterinario veterinario, int nivelUrgencia){
        super(data, descricao, animal, veterinario);
        this.nivelUrgencia = nivelUrgencia;
    }

    public int getNivelUrgencia(int nivelUrgencia){
        return nivelUrgencia;
    }

    public void setNivelUrgencia(int nivelUrgencia){
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public void registrar(){
        System.out.println("Consulta de emergência registrada para o " + getAnimal().getNome() + " (urgência: " + nivelUrgencia + ") com o veterinário " + getVeterinario().getNome());
    }
}
