package generics_wildcard.exercicio2;

public class Main {
	public static void main(String[] args) {
		Produto<Integer> trigo = new Produto<Integer>(0);
		
		trigo.setValor(10.0);
		trigo.setDataFabricacao("15/03/2024");
		trigo.setDataVencimento("15/03/2026");
		
		System.out.println(trigo.toString());
		
		Produto<String> arroz = new Produto<String>("1");
		
		arroz.setValor(20.0);
		arroz.setDataFabricacao("10/02/2024");
		arroz.setDataVencimento("15/03/2025");
		
		System.out.println(arroz.toString());
	}
}
