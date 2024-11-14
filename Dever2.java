package Treinamentos;

import java.util.Scanner;

public class Dever2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int num, fat = 1;

        System.out.println("Informe um número positivo:");
        num = sc.nextInt();

        // Verifica se o número é positivo
        if (num < 0) {
            System.out.println("Por favor, informe um número positivo.");
        } else {
            // Calcula o fatorial
            for (int i = num; i > 1; i--) {
                fat = fat * i; // fatorial = fatorial * i
            }

            // Se num for 0 ou 1, o fatorial é 1
            if (num == 0 || num == 1) {
                fat = 1;
            }

            System.out.println("Fatorial de " + num + " é: " + fat);
        }

        sc.close(); // Fecha o Scanner
    }
}

/*
Faça um programa que leia um número inteiro positivo N e calcule o
fatorial desse número.
Exemplo:
Fatorial 5 = 5 * 4* 3 * 2 * 1
*/