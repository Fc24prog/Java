package Alunos;
import java.util.Scanner;
public class MediaAlunos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int identificacao;
		float n1,n2,n3,mdexercicio,mda;
		
		System.out.println("Entre com o numero de identificação do aluno");
		identificacao=sc.nextInt();
		
		System.out.println("Entre com a 1ª nota");
		n1=sc.nextFloat();
		
		System.out.println("Entre com a 2ª nota");
		n2=sc.nextFloat();
		
		System.out.println("Entre com a 3ª nota");
		n3=sc.nextFloat();
		
		System.out.println("Entre com as medias dos exercicios");
		mdexercicio=sc.nextFloat();
        
		mda=(n1*1 + n2*2 + n3*3 + mdexercicio)/7;
		System.out.println("A media " + mda);

        
		if (mda >= 9) {
            System.out.println("Conceito: A, Aprovado");
        } else
        	if (mda >= 7.5 && mda < 9) {
            System.out.println("Conceito: B, Aprovado");
        }   else
        	  if (mda >= 6.0 && mda <7.5) {
            System.out.println("Conceito: C, Aprovado");
        }     else 
        	      if (mda >= 4.0 && mda < 6.0 ) {
            System.out.println("Conceito: D, Reprovado");
        }           else {
            System.out.println("Conceito: E, Reprovado");
        }
		sc.close();
		}}		    	
