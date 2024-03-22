package generics_wildcard.exercicio5;

public class Pessoa {
	private String nome;
	private int idade;
	
	
	public Pessoa(String prNome, int prIdade) {
		this.nome = prNome;
		this.idade = prIdade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
