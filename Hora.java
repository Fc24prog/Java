package modelo;

public class Hora {
	
	private double hora, minuto,segundo;

	public Hora(double h, double min, double s) 
	{
		super();
		this.hora = h;
		this.minuto = min;
		this.segundo = s;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public double getMin() {
		return minuto;
	}

	public void setMin(double min) {
		this.minuto = minuto;
	}

	public double getSegundo() {
		return segundo;
	}

	public void setSegundo(double segundo) {
		this.segundo = segundo;
	}
	
	public boolean elgual (int h, int min, int s)
	{
		if ((h==hora) && (minuto==min) && (s==segundo))
		
			return true;
		
		else
			return false; 
	}
	public String toString()
	{
		return (hora + ":" + minuto + ":" + segundo);
	}

}
