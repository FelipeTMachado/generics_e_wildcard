package generics_wildcard.exercicio4;

public class Par<K, V> {
	K chave;
	V valor;
	
	
	
	public Par(K prChave, V prValor) {
		this.chave = prChave;
		this.valor = prValor;
	}

	
	
	public K getChave() {
		return chave;
	}
	public V getValor() {
		return valor;
	}
}
