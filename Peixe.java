package guanabara;

public class Peixe extends Animal
{

	private String corEscama;
	 
	  
	  public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
		public void locomover()
		{
			System.out.println("nadando");
		}
		
		@Override
		public void alimentar()
		{
			System.out.println("Comendo substancias do mar");

		}
		@Override
		public void emitirSom()
		{		System.out.println("Peixe não faz som");
		
		}
		public void SoltarBolhas()
		{
				System.out.println("Soltou uma bolha");

		}
}
