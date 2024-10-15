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

        
		if (mda>=9) {
			
			System.out.println("Conceito A, aprovado" + mda);
		}
		else 
		
			if (7.5>=mda && mda<9) 
			{		
			   System.out.println("Conceito B,aprovado" + mda); 
			}
		     else 
		    	if (6.0>=mda && mda <7.5) 
		    	{	
					System.out.println("Conceito C,aprovado" + mda);
		    	}

			      else 
				    	if (4.0>=mda && mda <6.0) 
				    	{   	
							System.out.println("Conceito D,reprovado" + mda);
				    	}
			            else 
							System.out.println("Conceito E,reprovado" + mda);
		sc.close();
		}}		    	

		    

		     

