package Treino03;

import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		Retangulo r = new Retangulo (); 
		
		
		System.out.println("Digite a base e altura do ret�ngulo: ");
		r.base = leia.nextDouble();
		r.altura = leia.nextDouble(); 
		
		System.out.println();
		System.out.println ("--------RESULTADO---------");
		System.out.println ("�REA: " + r.area());
		System.out.println ("PERIM�TRO: " + r.perimetro());
		System.out.println ("DIAGONAL: " + r.diagonal());
		
		
		leia.close();
	}
}