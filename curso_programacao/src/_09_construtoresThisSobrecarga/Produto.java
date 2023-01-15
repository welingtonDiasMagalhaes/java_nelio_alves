package _09_construtoresThisSobrecarga;

public class Produto {
	private String nome;
	private Double preco;
	private int quantidade;
	
	//construtor
	public Produto(String nome, Double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
		
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//metodos
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
