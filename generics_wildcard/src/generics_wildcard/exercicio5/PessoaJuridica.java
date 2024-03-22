package generics_wildcard.exercicio5;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	
	
	public PessoaJuridica(String prNome, int prIdade) {
		super(prNome, prIdade);
	}
	
	
	
	public String getCpf() {
		return cnpj;
	}
	public void setCpf(String cpf) {
		this.cnpj = cpf;
	}
}
