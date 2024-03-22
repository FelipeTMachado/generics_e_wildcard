package generics_wildcard.parte_1.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista <T>{
	private List<T> itens;
	
	public MinhaLista() {
		itens = new ArrayList<T>();
	}
	
	public void inserir(T prItem) {
		itens.add(prItem);
	}
	
	public T retornar(int prIndex) {
		return itens.get(prIndex);
	}
	
	public int tamanho() {
		return itens.size();
	}

	@Override
	public String toString() {
		return "MinhaLista [itens=" + itens + "]";
	}
}
