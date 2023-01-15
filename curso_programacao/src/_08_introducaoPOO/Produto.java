package _08_introducaoPOO;

public class Produto {
	String nome;
	Double preco;
	int quantidade;
	
	public double ValorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int qtd) {
		quantidade += qtd;
	}
	
	
	public void retirarProduto(int quantidade) {
		if(this.quantidade - quantidade >= 0) {
			this.quantidade -= quantidade; //o this diferencia o atributo da classe do parametro
		};
	}

	@Override
	public String toString() {
		return "Produto: nome=" + nome + ", preco=" + String.format("%.2f", preco) + ", quantidade=" + quantidade ;
	}
	
	
}
