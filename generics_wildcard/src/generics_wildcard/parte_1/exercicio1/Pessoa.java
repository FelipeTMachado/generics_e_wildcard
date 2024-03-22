package generics_wildcard.parte_1.exercicio1;

public class Pessoa {
	// ATRIBUTOS
	private String nome;
	private String cpf;
	private int idade;
	
	
	
	
	// CONSTRUTOR
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}


	
	
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public Pessoa setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public String getCpf() {
		return cpf;
	}
	public Pessoa setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}
	public int getIdade() {
		return idade;
	}
	public Pessoa setIdade(int idade) {
		this.idade = idade;
		return this;
	}




	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
}
