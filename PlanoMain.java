package main;
import Exemplo.Ponto;

public class PlanoMain {
	
	public static void main(String[] args)
	{
		Ponto p1,p2,p3;

        p1=new Ponto(-2,5);
        p2=new Ponto(5,8);
        p3=new Ponto(-2,5);
        System.out.println(p1);
        
       
        
        if(p1.eIgual(p2))
        	
        	System.out.println("P1 e p2 são iguais! ");
        
        else
        	
        	System.out.println("P1 e p2 são diferentes! ");
        	
	}}
