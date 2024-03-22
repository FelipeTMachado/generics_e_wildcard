package generics_wildcard.parte_2.exercicio_generic_1;

import java.util.ArrayList;
import java.util.List;

public class Item {
	// ATRIBUTOS
	private String nome;
	private Item tipo;
	List lista = new ArrayList<String>();
	
	// CONSTRUTOR
	Item(String nome) {
        this.nome = nome;
    }
	
	
	
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Item [nome=" + nome + "]";
	}
}
