package application02;

import java.util.Scanner;

public class Resultado {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in); 
		Funcionario f = new Funcionario (); 
		
		
		System.out.print("Digite o nome do funcion�rio: " ); 
		f.nome = leia.next(); 
		
		System.out.print("Digite o sal�rio bruto do funcion�rio: " );
		f.salarioBruto = leia.nextDouble();
		
		System.out.print("Digite o imposto no sal�rio: " );
		f.imposto = leia.nextDouble(); 
		
		System.out.println();
		System.out.print("Funcion�rio: " + f);
		System.out.println();
		System.out.print("Quando a porcentagem de acrescimo de sal�rio? ");
		double porcentagem = leia.nextDouble();
		f.incrementoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + f);
		
	
		leia.close();
		
	}

}
