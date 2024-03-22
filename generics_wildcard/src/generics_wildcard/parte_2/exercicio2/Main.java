package generics_wildcard.parte_2.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		/*
		 * 2 - Escreva um método Java chamado adicionarNumeros que 
		 *     aceite uma lista de números e adicione um novo 
		 *     número a essa lista.
		 */
		
		List<Integer> lista = new ArrayList<Integer>();
		Numeros num = new Numeros();
		
		num.adicionarNumeros(lista, 2);
		
		generics_wildcard.parte_2.exercicio1.Main.imprimirLista(lista);
		
		
	}
	
	
}
