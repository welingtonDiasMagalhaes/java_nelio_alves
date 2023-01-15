package _09_construtoresThisSobrecarga;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dados produto");		
		
		System.out.println("nome: ");
		String nome = sc.next();
		System.out.println("qtd: ");
		int quantidade = sc.nextInt();
		System.out.println("preço: ");
		double preco = sc.nextDouble();
		
		//uso do construtor
		Produto pd = new Produto(nome, preco, quantidade);			
		
		System.out.println("adicionar qtd");
		int qtd = sc.nextInt();
		pd.adicionarProduto(qtd);
		
		System.out.println("remover qtd");
		qtd = sc.nextInt();
		pd.retirarProduto(qtd);		
		
		System.out.println("saldo");
		
		//abaixo não funciona devido ao encapsulamento criado. Acesso apenas pelo método tostring
		//System.out.printf("nome: %s, qtd: %d, preco: %.2f",pd.nome,  pd.quantidade, pd.preco);
		System.out.println();
		System.out.println(pd.toString());
		System.out.println();
		System.out.printf("valor total: %.2f", pd.ValorTotalEstoque());
		sc.close();
	}

}
