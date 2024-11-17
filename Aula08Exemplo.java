package exemploAula08;

import java.util.Scanner;

import java.util.Arrays;

public class Aula08Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		int[] numero = new int[10];
		int soma=0;

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<numero.length;i++)
		{

			System.out.println("Número: "); 
			numero[i] = sc.nextInt();
			soma = soma + numero[i];
      }
		
       System.out.println("Soma: "+soma);
       sc.close(); 
		double numeros[] = new double[5];
		Arrays.fill(numeros, 12.8);}}