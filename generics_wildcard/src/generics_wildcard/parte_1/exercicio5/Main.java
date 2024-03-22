package generics_wildcard.parte_1.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// WILD CARD DE NIVEL HIPER GENERICO OU SEJA PODE SER QUALQUER 
		// TIPO AQUI FIXEI COMO NUMBER PARA ORDENAR OS DADOS NUMERICOS DE UM LIST
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(2);
		numeros.add(8);
		numeros.add(5);
		
		System.out.println(ReordenarNumeros.sort(numeros).toString());
		
		
		
		PessoaFisica pessoa = new PessoaFisica("Felipe", 26);
		
		List<PessoaFisica> Pessoas = new ArrayList<PessoaFisica>();
		
		Pessoas.add(pessoa);
		
		System.out.println(RetornarPessoaEspecifica.listaComUmaPessoa(Pessoas).toString());
	}
}
