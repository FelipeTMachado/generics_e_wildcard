package generics_wildcard.parte_1.exercicio4;

import java.util.ArrayList;
import java.util.List;


public class Dicionario<K extends String, V> {
	private List<K> chaves;
	private List<V> valores;
	
	public Dicionario() {
		chaves = new ArrayList<K>();
		valores = new ArrayList<V>();
	}
	
	public boolean add(K prChave, V prValor) {
		for (K chave: chaves) {
			if (chave.equals(prChave)) {
				return false;
			}
		}
		
		chaves.add(prChave);
		valores.add(prValor);
		
		return true;
	}
	
	public Par<K, V> buscar(String prChave){
		Integer index = chaves.indexOf(prChave);
		
		if (index != -1) {
			return new Par<>(chaves.get(index), valores.get(index));
		}
		
		return null;
	}

	@Override
	public String toString() {
		String lista = "[";
		
		int cont = 0;
		for (K chave: chaves) {
			 lista += String.format("{%s: %s}, ", chaves.get(cont).toString(), valores.get(cont).toString());
			 cont++;
		}
		
		
		return lista.substring(0, lista.length() - 2) + "]";
	}
}
