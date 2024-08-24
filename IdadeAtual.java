package aula1;
import java.util.Scanner;
public class IdadeAtual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    int ano_atual,ano_nascimento,idade;
    
    System.out.println("Entre com o ano atual ");
    ano_atual=sc.nextInt();
    
    System.out.println("Entre com o ano de nascimento ");
	ano_nascimento=sc.nextInt();
	
	idade=(ano_atual-ano_nascimento);
	
    System.out.println("A sua idade é:  "+ idade);
	
	sc.close();
	
	
	
	
	}

}
