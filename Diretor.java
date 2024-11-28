package filme;

public class Diretor
{
	// •	Atributos: nome, tempo de experiência (em anos), local de origem.

	
	private String nome;
	private String local_origem;
	private int tempo_experiencia;
	
	     // •	Construtores para a classe;

	public Diretor(String nome, String local_origem, int tempo_experiencia)
	{
		super();
		this.nome = nome;
		this.local_origem = local_origem;
		this.tempo_experiencia = tempo_experiencia;
	}
	// •	Métodos getters e setters;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal_origem() {
		return local_origem;
	}
	public void setLocal_origem(String local_origem) {
		this.local_origem = local_origem;
	}
	public int getTempo_experiencia() {
		return tempo_experiencia;
	}
	public void setTempo_experiencia(int tempo_experiencia)
	{
		this.tempo_experiencia = tempo_experiencia;
	}

	// •	Método para impressão.
	
	public String toString()
	{
		return ("Nome do filme: " + nome + "\nLocal de origem do filme: " + local_origem +
				"Tempo de experiencia do diretor" + tempo_experiencia);
	}}
	
