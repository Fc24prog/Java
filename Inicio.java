package aula1; // nome do pacote
import java.util.Scanner; // leitura de dados por meio de um objeto 

public class Inicio { // nome da classe, letra maiuscula 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final = constante 
        Scanner sc=new Scanner(System.in);
        int idade;
        System.out.println("Infome sua idade ");
        idade = sc.nextInt(); // int pq meu tipo de dados é int, mas poderia ser float 
        System.out.println("Você tem: "+ idade+" anos");
        /***
         * comentario oficial do java
         */
	}

}