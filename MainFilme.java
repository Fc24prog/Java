package principal;

import java.util.Scanner;
import java.util.ArrayList;

import filme.Diretor;

import filme.Filme;

public class MainFilme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        
        String resposta = "";  

        while (!resposta.equalsIgnoreCase("sair")) {
        	
            System.out.println("DADOS DO DIRETOR : ");
            
            System.out.print("Nome do diretor: ");
            String nome = scanner.nextLine();
            
            System.out.print("Local de origem do diretor: ");
            String local_origem = scanner.nextLine();
            
            System.out.print("Tempo de experiência (em anos): ");
            int ttempo_experiencia = scanner.nextInt();
            
            
            System.out.println("DADOS DO FILME: ");
            
            System.out.print("Digite a duração do filme em minutos: ");
            int duracao_minutos = scanner.nextInt();
            
            scanner.nextLine();  
            
            System.out.print("Digite o título do filme: ");
            String titulo = scanner.nextLine();
            
            // Criar um novo objeto Filme com os dados fornecidos
            Filme filme = new Filme(titulo, "Genero", nome, duracao_minutos);
            
            
            listaDeFilmes.add(filme);
            
            System.out.print("Digite 'sair' para finalizar o cadastro: ");
            resposta = scanner.nextLine();
        }

       
        System.out.print("Digite o título do filme para busca: ");
        String tituloBusca = scanner.nextLine();
        
        boolean filmeEncontrado = false;

        
        for (Filme filme : listaDeFilmes)
{
            if (filme.getTitulo().equalsIgnoreCase(tituloBusca))
            {
               // filme.titulo_comparacao();  
                filme.exibir_duracao_horas();
                filmeEncontrado = true;
                break;  
            }
        }

        if (!filmeEncontrado)
        {
            System.out.println("Filme não encontrado.");
        }

        System.out.println("\nLista de filmes cadastrados:");
        for (Filme filme : listaDeFilmes) {
            System.out.println(filme.getTitulo());
            filme.exibir_duracao_horas();
        }

        scanner.close();
    }
}

