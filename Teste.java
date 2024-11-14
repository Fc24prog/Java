package Administracao;

import Empresa.Funcionario;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario f1, f2;
       
        f1 = new Funcionario("Cássia","Santana",3600);
        f2 = new Funcionario("Paola", "Cristina", 2500);

   
        System.out.println("Funcionario 1 antes do aumento : " + f1.getNome());
        System.out.println("Funcionario 1 antes do aumento : " + f1.getSobrenome() );
        System.out.println("Funcionario 1 antes do aumento: " + f1.getSalario());
       
        System.out.println("Funcionario 2 antes do aumento: " + f2.getNome());
        System.out.println("Funcionario 2 antes do aumento: " + f2.getSobrenome() );
        System.out.println("Funcionario 2 antes do aumento: " + f2.getSalario());
       
        // Aplicando aumento de 10% para ambos os funcionários
        f1.aplicarAumento();
        f2.aplicarAumento();

        System.out.println("Funcionario 1 depois do aumento : " + f1.getNome());
        System.out.println("Funcionario 1 depois do aumento : " + f1.getSobrenome() );
        System.out.println("Funcionario 1 depois do aumento: " + f1.getSalario());
       
        System.out.println("Funcionario 2 depois do aumento: " + f2.getNome());
        System.out.println("Funcionario 2 depois do aumento : " + f2.getSobrenome() );
        System.out.println("Funcionario 2 depois do aumento: " + f2.getSalario());
        
        sc.close();
    }} /* é a parte principal de funcionario */ 
