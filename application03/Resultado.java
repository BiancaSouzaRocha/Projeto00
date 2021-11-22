package application03;

import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		Estudante est = new Estudante (); 
		
		System.out.print("Digite seu nome:");
		est.nome = leia.next();
		
		System.out.println("Digite sua primeira, segunda e terceira nota: ");
		est.nota1 = leia.nextDouble();
		est.nota2 = leia.nextDouble();
		est.nota3 = leia.nextDouble(); 
		
		 
		System.out.println("Nota final: " + est.notaFinal());
		
		if (est.notaFinal() < 60) {
			System.out.println(est.nome + ", você está reprovado (a)!");
			System.out.println("Faltaram " + est.pontosFaltando() + " pontos para aprovação!");
		} else {
			System.out.println();
			System.out.println(est.nome + ", você está aprovado (a)!");
		}
		
		
		
		
		
		
		leia.close();
	}

}
