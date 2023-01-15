package _10_memoriaArrayLista;

import java.util.Locale;
import java.util.Scanner;

public class ExerNumNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de números: ");
		int qtd = sc.nextInt();
		
		//vetor para armazenar os números
		int[] numeros = new int[qtd];
		for(int x=0; x < qtd; x++) {
			System.out.println("digite o número "+ (x+1));
			numeros[x] = sc.nextInt();
		}
		
		//exibir somente negativos
		System.out.println("Os número negativos são: ");
		for(int x=0; x < qtd; x++) {
			if(numeros[x] <0) System.out.println(numeros[x]);
		}
		
		sc.close();
	}

}
