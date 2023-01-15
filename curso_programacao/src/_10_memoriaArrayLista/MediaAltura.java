package _10_memoriaArrayLista;

import java.util.Locale;
import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de alturas para fazer a média.");
		int qtd = sc.nextInt();
		
		//vetor
		double[] altura = new double[qtd];
		
		for(int x = 0; x < qtd; x++) {
			System.out.printf("entre com a media %x", x+1);
			System.out.println();
			altura[x] = sc.nextDouble();			
		}
		
		double somaAltura = 0;
		for(int x = 0; x < altura.length; x++) {
			somaAltura += altura[x];
		}
		
		double media = somaAltura / qtd;
				
		System.out.println("qtd altura: "+ qtd);
		System.out.println("media: "+ media);
		
		sc.close();
	}

}
