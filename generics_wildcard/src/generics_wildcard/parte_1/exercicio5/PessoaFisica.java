package generics_wildcard.parte_1.exercicio5;

public class PessoaFisica extends Pessoa{
	private String cpf;
	
	
	
	public PessoaFisica(String prNome, int prIdade) {
		super(prNome, prIdade);
	}

	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
