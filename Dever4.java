package Treinamentos;
import java.util.Scanner;
public class Dever4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int soma=0,num,i;
		
		System.out.println("Informe o numero: ");
		num=sc.nextInt();
		
		for (i=1;i<=num;i++)
		{
			soma=1+1/i;
		}
		System.out.println("A soma eh: " + soma);
		sc.close();
	}

}



/* ) Faça um programa que lê um valor n inteiro e positivo e que calcula a
seguinte soma:
S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n */