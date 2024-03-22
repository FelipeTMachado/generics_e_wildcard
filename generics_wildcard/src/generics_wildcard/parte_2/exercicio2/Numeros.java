package generics_wildcard.parte_2.exercicio2;

import java.util.List;

public class Numeros {
	public Numeros() {
		// TODO Auto-generated constructor stub
	}
	
	public <T extends Number> void adicionarNumeros(List<T> lista, T novoNumero) {
        lista.add(novoNumero);
    }
}
