package Treinamentos;

import java.util.Scanner; 

public class Dever1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);


		int i,num;
		float cont=0,md;
		
		for (i=1;i<=10;i++)
		{
			System.out.println("Entre com o numero: " + i );
			num=sc.nextInt();
			cont=cont+num;	
		}
		md=cont/10;
		
		System.out.println("A media dos numeros sao: " + md);
		sc.close();		
	}

}

/*Faça um programa que leia 10 números inteiros e calcule a média
desses números.
*/