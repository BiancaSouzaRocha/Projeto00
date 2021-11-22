package Projeto03;

public class Produto {
	
	
	//atributos 
	public String nome; 
	public double preco; 
	public int quantidade; 
	
	//métodos 
	
	public double totalValorEstoque () {
		return preco* quantidade; 
	}
	
	public void adionandoProduto (int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void removendoProduto (int quantidade) {
		this.quantidade -= quantidade; 
	}
	
	public String toString () {
		return nome 
		+ " - R$ "
		+ String.format("%.2f", preco)
		+ " ("
		+ quantidade 
		+ " unidades) Total: R$ "
		+ String.format("%.2f",totalValorEstoque()); 
	}
	
	

}
