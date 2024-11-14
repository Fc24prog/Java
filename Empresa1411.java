package main;
import modelo.Funcionario1411;
import modelo.Pessoa1411;
import modelo.Data1411;


public class Empresa1411 {
	public static void main(String[] args)
	{
// TODO Auto-generated method stub
		Pessoa1411 p1;
		Funcionario1411 f1,f2;
		Data1411 dt1,dt2;
		dt1= new Data1411(15,6,2001);
		dt2= new Data1411(13,5,9001);
		
		p1 = new Pessoa1411 ("Cássia Franco",dt1 ,"18367578100");
        f1= new Funcionario1411 ("Joao Pedro",dt2,"54646484664");
        
        System.out.println("Pessoa: " + p1.getCpf());
        System.out.println("Funcionario: " + f1);


// não ta funcionando, rever isso. mas só copiei o codigo. 
}

}

