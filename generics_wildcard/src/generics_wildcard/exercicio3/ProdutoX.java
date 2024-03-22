package generics_wildcard.exercicio3;

public class ProdutoX {
	private Integer id;
	private String nome;
	private Double valor;
	private String dataVencimento;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
	
	
	@Override
	public String toString() {
		return "ProdutoX [id=" + id + ", nome=" + nome + ", valor=" + valor + ", dataVencimento=" + dataVencimento
				+ "]";
	}
}
