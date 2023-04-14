package _04_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _03_entradaDados {

	public static void main(String[] args) {
		/*
		 * Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" da
		 * seguinte forma:
		 *  Scanner sc = new Scanner(System.in);
		 *  import java.util.Scanner;
		 *  faça sc.close() quando não precisar mais do objeto sc
		 */
		
		//associar a variavel sc ao teclado no modo console
		Locale.setDefault(Locale.US);// Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner
		Scanner sc = new Scanner(System.in);
				
		//ler palavra sem espaço
		System.out.println("digite uma palavra");
		String x;
		x = sc.next(); //ler palavra
		System.out.println("String que você digitou "+ x);
		
		//ler inteiro
		System.out.println("digite um inteiro");
		int i;
		i = sc.nextInt(); //ler inteiro
		System.out.println("Inteiro que você digitou "+ i);
		
		//ler ponto flutuante
		System.out.println("digite um decimal");
		double d;		
		d = sc.nextDouble();//ler ponto flutuante
		System.out.println("decimal que você digitou "+ d);
		
		//ler um caractere
		System.out.println("digite uma palavra para apresentar o primeiro caractere");
		char c;
		c = sc.next().charAt(0);
		System.out.println("caractere que você digitou "+ c);
		
		sc.close(); //para encerrar o recurso
	}

}
