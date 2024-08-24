package aula1;
import java.util.Scanner;
public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  final float PI=3.14159f; // mesmo em constante colocar o tipo e se for float o f no final
      Scanner sc=new Scanner(System.in);
      float raio,p,area;
      System.out.println("Entre com a medida do raio: ");
      
      raio=sc.nextFloat();
      
      p=2*PI*raio;
      
      area=PI*raio*raio;
      
      System.out.print("Area: "+area+ " perimetro " + p);
      
      sc.close();
	}

}
