package Treino02;

import java.util.Scanner;
 

public class Programa {
	
	public static void main (String [] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		Produto produto = new Produto (); 
		
		System.out.println("Entre com as informa��es do produto: "); 
		
		
		System.out.print("Nome do produto: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Pre�o: ");
		produto.preco = sc.nextDouble ();
		
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		


		System.out.println();
		System.out.println ("Informa��es do Produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o n�mero de produtos para ser adicionado ao estoque: "); 
		int quantidade = sc.nextInt();
		produto.adionandoProduto(quantidade);
		
		System.out.println();
		System.out.println ("Atualizando informa��es: " + produto);
		
		System.out.println();
		System.out.print("Entre com o n�mero de produtos para ser removidos do estoque: "); 
		quantidade = sc.nextInt();
		produto.removendoProduto(quantidade);
		
		System.out.println();
		System.out.println ("Atualizando informa��es: " + produto);
		
		
		sc.close();
		
	}

}
