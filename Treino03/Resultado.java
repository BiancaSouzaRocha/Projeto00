package Treino03;

import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in); 
		Retangulo r = new Retangulo (); 
		
		
		System.out.println("Digite a base e altura do retângulo: ");
		r.base = leia.nextDouble();
		r.altura = leia.nextDouble(); 
		
		System.out.println();
		System.out.println ("--------RESULTADO---------");
		System.out.println ("ÁREA: " + r.area());
		System.out.println ("PERIMÊTRO: " + r.perimetro());
		System.out.println ("DIAGONAL: " + r.diagonal());
		
		
		leia.close();
	}
}