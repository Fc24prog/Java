package aula1;
import java.util.Scanner;
public class Exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       
       int identidade;
   
       float n1,n2,n3,me,ma;
       
       System.out.println("Entre com o numero de identificacao");
       identidade=sc.nextInt();
       
              
       System.out.println("Entre com a 1º nota");
       n1=sc.nextFloat();
       
       System.out.println("Entre com a 2º nota");
       n2=sc.nextFloat();
       
       System.out.println("Entre com a 3º nota");
       n3=sc.nextFloat();
       
       System.out.println("Entre com a media dos exercicios");
       me=sc.nextFloat();
       
       ma= (n1+n2*2+n3*3+me)/7;
      System.out.println("A media e: " +ma);
       
       if (ma>=9)
       {
           System.out.println("conceito A: Aprovado" +ma);

       }
       
       if (ma<9 && ma>=7.5)
       {
           System.out.println("conceito B: Aprovado" + ma );

       }
       
       
       if (ma<7.5 && ma>=6)
       {
           System.out.println("conceito C: Aprovado" + ma );

       }
       
       if (ma<6 && ma>=4)
       {
           System.out.println("conceito D: Reprovado" + ma );
       }           
        if(ma<4) {
       	                 
                   System.out.println("conceito E: Reprovado" + ma );

	}      } }   
             

