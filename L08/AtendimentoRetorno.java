package L08;

import java.time.LocalDate;

public class AtendimentoRetorno extends Atendimento{
    private Atendimento atendimentoAnterior;

    public AtendimentoRetorno(LocalDate data, String descricao, Animal animal, Veterinario veterinario, Atendimento atendimentoAnterior){
        super(data, descricao, animal, veterinario);
        this.atendimentoAnterior = atendimentoAnterior;
    }   

    public Atendimento getAtendimentoAnterior(){
        return atendimentoAnterior;
    }

    public void atendimentoAnterior(Atendimento atendimentoAnterior){
        this.atendimentoAnterior = atendimentoAnterior;
    }

    @Override
	public void registrar() {
		System.out.println("Consulta de retorno registrada para " + getAnimal().getNome() + ", referente à consulta anterior em " + atendimentoAnterior.getData());
	}
}
