package modelo;

public class Pessoa1411 {
	
	private String nome;
    private Data1411 dtNasc;
    private String cpf;
    
    Pessoa1411()
    {
    	
    }
    
    public Pessoa1411(String nome, Data1411 dtNasc, String cpf) 
    {
    	
    	super();
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
    }
    public String getNome() 
    {
     return nome;
     }

     public void setNome(String nome)
     {
        this.nome = nome;
      }
     public Data1411 getDtNasc() 
     {
    	 return dtNasc;
     }
     public void setDtNasc(Data1411 dtNasc)
     {
    	 this.dtNasc = dtNasc;
      }
     public String getCpf()
     {
       return cpf;
      }
     public void setCpf(String cpf)
     {
    	 this.cpf = cpf;
      }

      public String toString()
      {
          return ("Nome: "+ nome + "\nData de nascimento: " + dtNasc + "\nCPF: cpf"  );
       }

}// funcionario,pessoa e data fazem parte