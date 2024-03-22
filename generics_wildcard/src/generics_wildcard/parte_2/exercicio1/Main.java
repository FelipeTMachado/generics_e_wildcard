package generics_wildcard.parte_2.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1 - Escreva um método Java chamado imprimirLista 
		 *     que aceite uma lista de qualquer tipo e imprima todos 
		 *     os elementos dessa lista.
		 * */
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Teste 1");
		lista.add("Teste 2");
		
		imprimirLista(lista);
	}
	
	public static void imprimirLista(List<? extends Object> prLista) {
		for (Object teste: prLista) {
			System.out.println(teste.toString());
		}
	}
}
