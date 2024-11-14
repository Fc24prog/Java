package Empresa;

public class Funcionario {

    private String nome,sobrenome;
    float salario,aum;


    public String getNome()
    {
    	return nome;
    }
    public void setNome(String nome)
    {
    	this.nome = nome;
    }
    
    public String getSobrenome()
    {
    	return sobrenome;
    }
    public void setSobrenome(String sobrenome)
    
    {
    	this.sobrenome = sobrenome;
    }
    public float getSalario() 
    {
    	return salario;
    }
    public void setSalario(float salario)
    {
    	if (salario >0)
    	{
    		this.salario = salario;
    	}
    	else {
    		this.salario=0;
    		}}

    public Funcionario(String nome, String sobrenome, float salario)
    {
    	this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    public double salarioAnual ()
    {
      return salario * 12;
    }
    public void aplicarAumento()
   {
      this.salario += (this.salario * 0.10);
   }    }
   

/* A fim de representar os funcionários em uma empresa, crie uma classe chamada
Funcionario que inclui as três informações a seguir como atributos:
• um primeiro nome,
• um sobrenome, e
• um salário.
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e
get para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0.
Escreva uma classe de teste e crie duas instâncias da classe e exiba o salário anual de
cada funcionário. Então dê a cada funcionário um aumento de 10% e exiba novamente o
salário anual deles. */ 
