package modelo;

public class Produto {
	
	
	private int codigo;
	private String nome;
	private String unidMedida;
	private double preco;
	private double estoque;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidMedida() {
		return unidMedida;
	}

	public void setUnidMedida(String unidMedida) {
		this.unidMedida = unidMedida;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getEstoque() {
		return estoque;
	}

	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}

	public Produto(int codigo, String nome, String unidMedida, double preco, double estoque){
		this.codigo = codigo;
		this.nome = nome;
		this.unidMedida = unidMedida;
		this.preco = preco;
		this.estoque = estoque;
		}
	
/* Supermercado tá ligado com produto 
}
