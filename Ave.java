package guanabara;

public class Ave extends Animal
{
	private String CorPena;

	public String getCorPena() {
		return CorPena;
	}

	public void setCorPena(String corPena) {
		CorPena = corPena;
	}
	
	@Override
	public void locomover()
	{
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar()
	{
		System.out.println("Comendo frutas");

	}
	@Override
	public void emitirSom()
	{		System.out.println("Som de ave");
	
	}
	public void FazeendoNinho()
	{
			System.out.println("Construiu um ninho");

	}
	
	
	
	
}
