package generics_wildcard.exercicio5;

import java.util.List;

public class RetornarPessoaEspecifica {
	public static List<? super PessoaFisica> listaComUmaPessoa(List<? super PessoaFisica> prPessoas){
		return prPessoas.subList(0, 1);
	}
}
