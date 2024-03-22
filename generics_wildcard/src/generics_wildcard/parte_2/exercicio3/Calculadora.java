package generics_wildcard.parte_2.exercicio3;

import java.util.List;

public class Calculadora {
	public static double calcularMedia(List<? extends Number> listaNumeros) {
        double soma = 0.0;
        if (listaNumeros.isEmpty()) {
            return soma;
        }
        for (Number numero : listaNumeros) {
            soma += numero.doubleValue();
        }
        return soma / listaNumeros.size();
    }
}
