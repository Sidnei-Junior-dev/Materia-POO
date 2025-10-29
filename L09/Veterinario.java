
public class Veterinario extends Pessoa{
    private String crmv;
    private String especialidade;
    private Veterinario supervisor;

    public Veterinario(String nome, String cpf, String crmv, String especialidade) {
		super(nome, cpf);
		this.crmv = crmv;
		this.especialidade = especialidade;
	}
    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Veterinario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Veterinario supervisor) {
        this.supervisor = supervisor;
    }

    public String retornaDados() {
		String dados = "Nome: " + getNome() + ", CRVM: " + crmv + ", Especialidade: " + especialidade;
	    if (supervisor != null) {
	        dados += ", Supervisor: " + supervisor.getNome();
	    }
	    return dados;
	}

    @Override
    public String getResumo(){
        return getNome() + " - " + getCpf() + " - " + crmv + " - " + especialidade;
    }

    @Override
    public void registrarNoSistema(){
        System.out.println("Veterinario registrado no sistema com crmv " + crmv + " valido");
    }
}
