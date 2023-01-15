package _10_memoriaArrayLista;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//quantidade de produtos
		System.out.println("Quantidade de produtos: ");
		int qtd = sc.nextInt();
		//vector de produtos
		Produto[] produtoVetor = new Produto[qtd];
		
		for(int i=0; i < qtd; i++) {
			sc.nextLine(); //quebra de linha pendente
			System.out.println("nome:");
			String nome = sc.next();
			System.out.println("preço:");
			double preco = sc.nextDouble();
			
			produtoVetor[i] = new Produto(nome, preco);
		}
		
		//para exibir a media dos preços
		double soma = 0;
		
		for(int i=0; i < qtd; i++) {
			soma += produtoVetor[i].getPreco(); //obtendo o preço e somando
		}
		
		double media = soma/qtd;
		
		System.out.printf("a media dos preços é: %.2f", media);
		
		
		sc.close();
	}

}
