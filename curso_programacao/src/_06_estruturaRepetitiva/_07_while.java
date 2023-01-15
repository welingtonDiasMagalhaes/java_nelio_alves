package _06_estruturaRepetitiva;

import java.util.Scanner;

public class _07_while {

	public static void main(String[] args) {
		int soma = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lê valores inteirosaté o primeiro 0.\n Quando digitar 0 apresenta a soma");
		System.out.println("entre com o primeiro valor");
		
		int x = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			System.out.println("digite o próximo numero: ");
			x = sc.nextInt();
		}
		
		System.out.printf("O valor da soma é %d", soma);
		
		sc.close();

	}

}
