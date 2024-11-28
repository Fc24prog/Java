package filme;


public class Filme {
	// •	A classe deve possuir quatro atributos: titulo, descrição, diretor e duracaoEmMinutos.
	
	private String titulo;
	private String descricao;
	private String diretor;
	private int duracao_minutos;
	
	
	// construtor com parametros
	public Filme(String titulo, String descricao, String diretor, int duracao_minutos) 
	{
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.diretor = diretor;
		this.duracao_minutos = duracao_minutos;
	}
   // •	Crie os métodos de acesso (get e set) para os atributos da classe; 
	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}

	public String getDiretor()
	{
		return diretor;
	}

	public void setDiretor(String diretor) 
	{
		this.diretor = diretor;
	}

	public int getDuracao_minutos() {
		return duracao_minutos;
	}

	public void setDuracao_minutos(int duracao_minutos) {
		this.duracao_minutos = duracao_minutos;
	}
	
	/* •	Crie um método exibirDuracaoEmHoras que converta o valor em minutos para horas 
	e apresente a mensagem “O filme TITULO possui X horas e Y minutos de duração”. */
	
	public int exibir_duracao_horas()
	{
	   int h = (duracao_minutos)/60;
	   int m_restantes = (duracao_minutos) % 60;
       System.out.println("O filme " + titulo + " possui " + h + " horas  " + m_restantes+ 
    		   " minutos de duração.");
       return m_restantes ;
	}
	
	/* Faça um método de comparação na classe que retorne os dados do filme caso o título do
	 objeto em questão seja igual ao informado; */
	
	public boolean comparacao(String titulo_comparacao)
	{
        if (this.titulo.equalsIgnoreCase(titulo_comparacao))
        
                return true;
        else
        	return false;
    }
	// •	Acrescente também na classe um método para exibição dos dados do filme.
	public String toString()
   {
	    return ("Título: " + titulo + "Descrição: " + descricao +  "Diretor: " + diretor + 
	    		"Duranção" + duracao_minutos + "minutos");       
    }}
