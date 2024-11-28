package modelo;

public class DataHora {
	
	private Data dt;
	private Hora hora;
	public DataHora(int d, int m, int a, int h, int min, int s)
	{
		dt = new Data(d,m,a);
	    hora = new Hora(h, min, s);
	}
	
	public DataHora(int d, int m, int a) {
	
		dt = new Data(d, m, a);
		hora = new Hora(0,0,0);
	}
	public String toString() 
	{
	return dt + " "+hora;
	}}

