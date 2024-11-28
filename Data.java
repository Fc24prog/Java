package modelo;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int d, int m, int a)
	{
		super();
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean elgual (int d, int m, int a)
	{
		if ((d==dia) && (m==mes) && (a==ano))
		
			return true;
		else
			return false; 
	}
	public String toString()
	{
		return (dia + "/" + mes + "/" + ano);
	}
	}
	
	
 
