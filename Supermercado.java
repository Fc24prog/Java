package principal;

import modelo.Produto;

import java.util.Scanner;            // essa é a parte principal, por isso tem o main

public class Supermercado {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
  	
    		Scanner sc = new Scanner(System.in);
    		Produto p1, p2;
    		
    		
    		Produto p1 = new Produto(1,"Arroz Tio João", "kg", 3.45, 100);
    		Produto p2 = new Produto(2, "Suco uva DelValle", "Garrafa 1L", 4.99, 200);
    		
    		
    /* é a parte principal de produtos