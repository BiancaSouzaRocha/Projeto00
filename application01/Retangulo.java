package application01;


public class Retangulo {
	
	
	//atributos 
	public double base;
	public double altura; 
	
	
	//m�todos 
	
	public double area () {
		return base*altura;
	}
	public double perimetro () {
		return 2*(base + altura);
	}
	public double diagonal () {
		return Math.sqrt(base*base + altura * altura);
	}


}
