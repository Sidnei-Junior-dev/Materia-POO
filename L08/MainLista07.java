package L08;

public class MainLista07 {
	public static void main(String[] args) {
		// i. Criar tutores, animais e veterinários.
		// iv. Relacionar veterinários com supervisores.

		// Veterinários
		
		Veterinario vet1 = new Veterinario("Dr. Chase", "1231-123123","5678-SC", "Clínico Geral");

		Tutor tutor2 = new Tutor("Maria Souza", "1223-123123", "47 9888-0002", "Avenida Brasil, 500");

		System.out.println("Resumo de tutor");
		System.out.println(tutor2.getResumo());

		System.out.println("-------------------");
		System.out.println("Resumo de veterinario");
		System.out.println(vet1.getResumo());
	}
}
