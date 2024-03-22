package generics_wildcard.parte_2.exercicio_generic_1;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1 - Crie uma classe genérica que representa um apartamento, 
		 * 	   permitindo acomodar uma variedade de itens, 
		 *     desde móveis até eletrodomésticos e decorações.
		 */
		
		Item geladeira = new Item("Geladeira");
		Item sofa = new Item("Sofa");
		
		Apartamento<Item> ap = new Apartamento<Item>();
		
		ap.adicionarItem(geladeira);
		ap.adicionarItem(sofa);
		
		ap.listarItens();
	}
}
