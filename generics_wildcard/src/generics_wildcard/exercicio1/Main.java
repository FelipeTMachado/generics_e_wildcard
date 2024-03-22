package generics_wildcard.exercicio1;

public class Main {
	public static void main(String[] args) {
		MinhaLista<Pessoa> listaPessoas = new MinhaLista<Pessoa>();

		listaPessoas.inserir(new Pessoa());
		listaPessoas.retornar(0)
			.setCpf("09288566588")
			.setNome("Felipe Caue Machado")
			.setIdade(26);
		
		System.out.println(listaPessoas.toString());
		
		
		MinhaLista<String> listaStrings = new MinhaLista<String>();
		
		listaStrings.inserir("Felipe");
		listaStrings.inserir("Pedro");
		listaStrings.inserir("Paulo");
		
		System.out.println(listaStrings.toString());
		
		
		MinhaLista<Integer> listaInteger = new MinhaLista<Integer>();
		
		listaInteger.inserir(3);
		listaInteger.inserir(4);
		listaInteger.inserir(6);
		
		System.out.println(listaInteger.toString());
	}
}
