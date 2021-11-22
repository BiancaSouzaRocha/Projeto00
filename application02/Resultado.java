package application02;

import java.util.Scanner;

public class Resultado {
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in); 
		Funcionario f = new Funcionario (); 
		
		
		System.out.print("Digite o nome do funcionário: " ); 
		f.nome = leia.next(); 
		
		System.out.print("Digite o salário bruto do funcionário: " );
		f.salarioBruto = leia.nextDouble();
		
		System.out.print("Digite o imposto no salário: " );
		f.imposto = leia.nextDouble(); 
		
		System.out.println();
		System.out.print("Funcionário: " + f);
		System.out.println();
		System.out.print("Quando a porcentagem de acrescimo de salário? ");
		double porcentagem = leia.nextDouble();
		f.incrementoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + f);
		
	
		leia.close();
		
	}

}
