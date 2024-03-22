package generics_wildcard.parte_2.exercicio_generic_1;

import java.util.ArrayList;
import java.util.List;

public class Apartamento<T> {
	List<T> itens;
	public Apartamento() {
		this.itens = new ArrayList<T>();
	}
	
	void adicionarItem(T item) {
        this.itens.add(item);
    }

	public void listarItens() {
        for (T item : this.itens) {
            System.out.println("Nome: " + item.toString());
        }
    }
}
