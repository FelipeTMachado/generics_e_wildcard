package generics_wildcard.parte_2.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(6);
		lista.add(2);
		lista.add(5);
		
		System.out.printf("Media %f", Calculadora.calcularMedia(lista));
	}
}
