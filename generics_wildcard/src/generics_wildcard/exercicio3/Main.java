package generics_wildcard.exercicio3;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Banana");
		produto.setId(1);
		produto.setValor(2.99);
		produto.setDataVencimento("29/03/2024");
		
		Pedido<ProdutoX> pedidos = new Pedido<ProdutoX>();
		
		pedidos.adicionarProduto(produto);
		System.out.println(pedidos.mostrarListaProdutos());
	}
}
