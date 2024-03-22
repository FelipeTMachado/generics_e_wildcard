package generics_wildcard.parte_1.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX>{
	private List<T> produtos;

	
	public Pedido() {
		produtos = new ArrayList<T>();
	}
	
	public void adicionarProduto(T prProduto) {
		produtos.add(prProduto);
	}
	
	public String mostrarListaProdutos() {
		return produtos.toString();
	}
	
	public List<T> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<T> produtos) {
		this.produtos = produtos;
	}
}
