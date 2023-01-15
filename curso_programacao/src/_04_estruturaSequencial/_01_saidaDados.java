package _04_estruturaSequencial;

import java.util.Locale;

public class _01_saidaDados {

	public static void main(String[] args) {
		// saida de dados
		System.out.println("Hello word"); // com quebra de linha
		System.out.print("sem quebra de linha");
		System.out.print(" tudo junto");
		System.out.println();

		// variavel
		int y = 2;
		System.out.println("int: " + y);
		System.out.println();

		double x = 10.345668;
		System.out.println("double: " + x);
		System.out.printf("%.2f%n", x); // %n = quebra de linha (independente de plataforma)
		System.out.printf("%.4f%n", x);

		// Para considerar o separador de decimais como ponto, ANTES da declaração do
		// Scanner, faça
		Locale.setDefault(Locale.US);
		System.out.printf("com . decimal: %.2f%n", x);
		System.out.printf("com . decimal: %.4f%n", x);

		// concatenação
		System.out.println("int: " + y + " metros");
		System.out.printf("valor total : %.4f metros", x);
		System.out.println();

		/*
		 * concatenação com marcadores %f = ponto flutuante %d = inteiro %s = texto %n =
		 * quebra de linha
		 */

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		//atentar para %s (string), %f (decimal) 

	}

}
