package guanabara;

public class Principal {

	public static void main(String[] args) 
	{
	  Mamifero m = new Mamifero();
	  Reptil r = new Reptil ();
	  Peixe p = new Peixe ();
	  Ave a = new Ave ();
	  
	  System.out.println("Tudo sobre mamifero \n");
	  
	  m.setPeso(3.25f);
	  m.setCorPelo("Azul");
	  m.alimentar();
	  m.emitirSom();
	  m.locomover();
	  
  System.out.println("\nTudo sobre reptil\n");
	  
	  r.setPeso(3.25f);
	  r.setCorEscama("Laranja");
	  r.alimentar();
	  r.emitirSom();
	  r.locomover();
	  
	}

}
// consigo chamar os metodos e esses metodos vão se comportando de forma diferente
// o nome locomover é o mesmo para todos, mas são respostas diferentes.