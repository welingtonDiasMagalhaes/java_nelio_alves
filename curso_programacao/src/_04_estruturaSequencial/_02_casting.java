package _04_estruturaSequencial;

public class _02_casting {
	public static void main(String[] args) {
		int a, b;
		double resultado, resultadoCasting;
		a = 5;
		b = 2;
		
		resultado = a / b;
		resultadoCasting = (double) a /b;
		
		System.out.println(resultado); // 2.0 devido a divisão de inteiro com inteiro
		System.out.println(resultadoCasting); // 2.5 devido ao casting 
		System.out.println();

		/*
		 * Sempre indique o tipo do número, se a expressão for de ponto flutuante (não
		 * inteira).
		 * Para double use: .0
		 * Para float use: f
		 * 
		 * float b;
		 * b = 6f;
		 * 
		 * double B;
		 * B = 6.0;
		 */
		
		double c;
		int d;
		c = 5.5;
		d = (int) c; //precisa do (int), se não o compilador acusa erro
		System.out.println(d); //5
	}
}
