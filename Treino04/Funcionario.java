package Treino04;

public class Funcionario {
	
	public String nome; 
	public double salarioBruto; 
	public double imposto; 
	
	
	//métodos 
	
	public double salarioLiquido () {
		return salarioBruto - imposto; 
	}
	
	public void incrementoSalario ( double porcentagem) {
		salarioBruto += salarioBruto * porcentagem/100;
		
	}
	
	public String toString() {
		return nome + " - Salário atual: R$ " + String.format("%.2f", salarioLiquido());
	}
}