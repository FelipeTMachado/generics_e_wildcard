package generics_wildcard.parte_1.exercicio2;

public class Produto<T> {
	// ATRIBUTOS
	private T id;
	private Double valor;
	private String dataFabricacao;
	private String dataVencimento;
	
	
	// CONSTRUTOR
	public Produto(T prId) {
		this.id = prId;
	}
	
	
	// GETTERS AND SETTERS
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", valor=" + valor + ", dataFabricacao=" + dataFabricacao + ", dataVencimento="
				+ dataVencimento + "]";
	}
}
