package principal;
import modelo.ProdutoEntrada;
import java.util.Scanner;
public class SupercadoEntrada {

public static void main(String[] args) {
// TODO Auto-generated method stub


// Criando scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Declarando as variáveis do tipo Produto
        ProdutoEntrada p1, p2;

        // Inicializando o objeto p1 com o construtor padrão
        p1 = new ProdutoEntrada ();
       
        // Informando o código do produto
        System.out.println("Informe o código do produto:");
        p1.setCodigo(sc.nextInt());
       
        // Consumindo a linha em branco após o nextInt()
        sc.nextLine();
       
        // Informando o nome do produto
        System.out.println("Informe o nome do produto:");
        p1.setNome(sc.nextLine());
       
        // Informando a unidade de medida
        System.out.println("Informe a unidade de medida:");
        p1.setUnidMedida(sc.nextLine());
       
        // Informando o preço do produto
        System.out.println("Informe o preço do produto:");
        p1.setPreco(sc.nextFloat());
       
        // Consumindo a linha em branco após o nextFloat()
        sc.nextLine();
       
        // Informando a quantidade em estoque
        System.out.println("Informe a quantidade no estoque:");
        p1.setEstoque(sc.nextFloat());

        // Inicializando o objeto p2 com o construtor com parâmetros
        p2 = new ProdutoEntrada(5, "Suco de Uva Integral", "Garrafa 1L", 4.99f, 200);
  
        System.out.println("\n \n: ");
        sc.nextLine();

        
        System.out.println("Dados do Produto 1: ");
        System.out.println("Produto 1 Codigo: " + p1.getCodigo());
        System.out.println("Produto 1 Nome: " + p1.getNome());
        System.out.println("Produto 1 Unidade de Medida: " + p1.getUnidMedida());
        System.out.println("Produto 1 Preço : " + p1.getPreco());
        System.out.println("Produto 1 Quantidade de Estoque : " + p1.getEstoque());
        
        System.out.println("\n \n ");
       
        
       
        // Exibindo o nome do produto 2
        System.out.println("Dados do Produto 2: ");
        System.out.println("Produto 2 Codigo: " + p2.getCodigo());
        System.out.println("Produto 2 Nome: " + p2.getNome());
        System.out.println("Produto 2 Unidade de Medida: " + p2.getUnidMedida());
        System.out.println("Produto 2 Preço : " + p2.getPreco());
        System.out.println("Produto 2 Quantidade de Estoque : " + p2.getEstoque());
       
        // Fechando o scanner
        sc.close();
}}

/* É o mesmo projeto de supermercado, só coom entrada de dados via teclado, supermercado ta ligado a produto */