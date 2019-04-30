package VendasTotais;

public class Vendedor {
	private String nomeCompleto;
	private int Id;
	private String nomeProduto;
	private int numeroProduto;
	private int valor;


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public void setId(int id) {
		Id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public void setNumeroProduto(int numeroProduto) {
		this.numeroProduto = numeroProduto;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getId() {
		return Id;
	}

	public int getNumeroProduto() {
		return numeroProduto;
	}

	public int getValor() {
		return valor;
	}
}
