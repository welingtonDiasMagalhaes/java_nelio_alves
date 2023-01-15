package _10_memoriaArrayLista;

public class DadosPessoais {
	private double altura;
	private String nome;
	private int idade;
	
	public DadosPessoais(double altura, String nome, int idade) {
		super();
		this.altura = altura;
		this.nome = nome;
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
