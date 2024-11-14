package modelo;

public class ProdutoEntrada {

	/* É o mesmo projeto de supermercado, só coom entrada de dados via teclado
	 * produto ta ligado a supermercado */ 

    private int codigo;
    private String nome;
    private String unidMedida;
    private float preco;
    private float estoque;
   
   
   
    public int getCodigo() {return codigo;} public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNome() {return nome;} public void setNome(String nome) {this.nome = nome;}

    public String getUnidMedida() {return unidMedida;}public void setUnidMedida(String unidMedida) {this.unidMedida = unidMedida;}

    public float getPreco() {return preco;} public void setPreco(float preco) {this.preco = preco;}

    public float getEstoque() {return estoque;}  
    public void setEstoque(float estoque) {this.estoque = estoque;}

    public ProdutoEntrada(int codigo, String nome, String unidMedida, float preco, float estoque)
{
    this.codigo = codigo;
    this.nome = nome;
    this.unidMedida = unidMedida;
    this.preco = preco;
    this.estoque = estoque;
}
    public ProdutoEntrada()
    {}
   
   
}
