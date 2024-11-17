package exemploAula08;

import java.util.Arrays;

import java.util.Scanner;


public class ExercicioNotaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double nt [];
		float md, soma=0;
		int quantidade;
		
		System.out.println("Entre com a quantidade de alunos");
		quantidade= sc.nextInt();
		
		nt = new double[quantidade];
		
		for(int i=0; i<quantidade;i++)
		{
			System.out.println("Informe a nota "+(i+1)+":");
			nt[i]=sc.nextDouble();
			soma= (float)( soma + nt[i]);			
		}
		sc.close();
		md = soma/quantidade;
		System.out.println("Média da turma: "+md);
		
		Arrays.sort(nt);
		System.out.println("Notas ordenadas:");
		System.out.println(Arrays.toString(nt));

}}


/* Faça um programa para leitura de notas de uma turma. Você deve
perguntar ao usuário quantos alunos a turma possui e criar um array com
espaço para a quantidade informada. As notas devem ser lidas e o
programa deve calcular a média. Ao final, você deve imprimir a média e o
vetor de notas ordenado 
 */
 
