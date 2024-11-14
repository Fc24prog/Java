package modelo;

public class Funcionario1411 extends Pessoa1411
{
	private Data1411 dtAdm; // data de admissao
    private double salario;
    
    
    public Funcionario1411(Data1411 dtAdm, double salario) 
    {
		super();
		this.dtAdm = dtAdm;
		this.salario = salario;
	}



     public Data1411 getDtAdm()
     {
		return dtAdm;
	}

	public void setDtAdm(Data1411 dtAdm) 
	{
		this.dtAdm = dtAdm;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}



   public String toString()
{
     return ("\n"+ super.toString()+ "\nData de admissão" + dtAdm + " \nSalario" );
}

} // funcionario,pessoa e data fazem parte ;super -  caso seja necesario acessar os dados

