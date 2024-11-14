package modelo;

public class Funcionario extends Pessoa {
	
	private Data dtAdm; // data de admissao 
	private double salario;
	
	public Funcionario(String nome, Data dtNasc, String cpf)
	{
		super(nome,dtNasc,cpf);
		this.dtAdm = dtAdm;
		this.salario = salario;
	}

	public Data getDtAdm() {
		return dtAdm; //super -  caso seja necesario acessar os dados
	}

	public void setDtAdm(Data dtAdm) {
		this.dtAdm = dtAdm;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	} 
	
	public String toString()
	{
		return ("\n"+ super.toString()+ "\nData de admissão" + dtAdm + " \nSalario"	);
	}

} // funcionario,pessoa e data fazem parte 
