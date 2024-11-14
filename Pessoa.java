package modelo;

public class Pessoa {
	
	private String nome;
	private Data dtNasc;
	private String cpf;
	
	Pessoa()
	{
		
	}
	public Pessoa(String nome, Data dtNasc, String cpf) {
		super();
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Data dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString()
	{
		return ("Nome: "+ nome + "\nData de nascimento: " + dtNasc + "\nCPF: cpf"  );
	}

}} // funcionario,pessoa e data fazem parte 


