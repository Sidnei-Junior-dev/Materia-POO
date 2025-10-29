

import java.util.ArrayList;

public class Tutor extends Pessoa{
    private String telefone;
    private String endereco;
    private ArrayList<Animal> animais = new ArrayList<>();

    public Tutor(String nome, String cpf, String telefone, String endereco){
        super(nome, cpf);
        setTelefone(telefone);
        setEndereco(endereco);
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public ArrayList<Animal> getAnimais(){
        return animais;
    }

    public void adicionarAnimal(Animal animal) {
		animais.add(animal);
	}

    public void removerAnimal(Animal animal){
        animais.remove(animal);
    }

    @Override
    public String getResumo(){
        return getNome() + " é tutor de " + animais.size() + " animais";
    }

    @Override 
    public void registrarNoSistema(){
        System.out.println("Tutor registrado no sistema.");
    }
}
