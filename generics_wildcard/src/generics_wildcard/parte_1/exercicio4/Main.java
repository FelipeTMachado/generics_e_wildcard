package generics_wildcard.parte_1.exercicio4;

public class Main {
	public static void main(String[] args) {
		Dicionario<String, Integer> dicionario = new Dicionario<String, Integer>();
		
		dicionario.add("Felipe", 26);
		dicionario.add("Paulo", 15);
		dicionario.add("Joaquim", 32);
		System.out.println(dicionario.toString());
		
		System.out.println(dicionario.buscar("Paulo").getChave());
	}
}
