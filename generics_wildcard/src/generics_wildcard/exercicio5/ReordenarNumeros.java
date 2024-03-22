package generics_wildcard.exercicio5;

import java.util.Collections;
import java.util.List;

public class ReordenarNumeros {
	public static List<? extends Number> sort(List<? extends Number> prLista){
		Collections.sort(prLista, new java.util.Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                return Double.compare(o1.doubleValue(), o2.doubleValue());
            }
        });
		
        return prLista;
	}
}
