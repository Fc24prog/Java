package Treinamentos;

import java.util.Scanner;

public class Dever3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int num,quant1=0,quant2=0,quant3=0,quant4=0;
		
		System.out.println("Entre com os numeros: ");
		num= sc.nextInt();
        		
		while(num>=0)
		{
		
				if(num<= 25)
			{
				quant1++;
			}
			else 
				if ( num<= 50)
			{
				      quant2++;
			}
			   else 
				   if ( num<= 75)
			{
				      quant3++;
			}
			   else 
				   if ( num<= 100)
			{
				quant4++;
			}
				System.out.println("Entre com os numeros: ");
				num=sc.nextInt();
				}	
		sc.close();
			
		System.out.println("A quantidade de numeros de [0-25] " + quant1 + quant2);
		//System.out.println("A quantidade de numeros de [26-50] " + quant2);
		System.out.println("A quantidade de numeros de [51-75] " + quant3);
		System.out.println("A quantidade de numeros de [76-100] " + quant4);
		}}

/*
 Faça um programa que leia uma quantidade desconhecida de números e
conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75]
e [76-100]. A entrada de dados deve terminar quando for lido um número
negativo

*/