package _10_memoriaArrayLista;

import java.util.Scanner;

public class _MatrizesExerc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qtd elementos NxN: ");
		int qtd = sc.nextInt();
		
		int[][] matriz = new int[qtd][qtd]; 
		
		for(int x=0; x < qtd; x ++) {
			for(int y=0; y< qtd; y++) {
				System.out.println("entre com o elemento "+(x+1)+"X"+(y+1));
				int num = sc.nextInt();
				matriz[x][y] = num;
			}
		}
		
		System.out.println("Diagonal principal: ");
		for(int x=0; x < qtd; x ++) {
			System.out.print(matriz[x][x]+" ");
		}
		
		System.out.println();
		System.out.println("numeros negativos: ");
		int qtdNegativos = 0;
		for(int x=0; x < qtd; x++) {
			for(int y=0; y < qtd; y++) {
				if(matriz[x][y] < 0) {
					System.out.println(matriz[x][y]+" ");
					qtdNegativos++;
				}
			}
		}
		System.out.println("Qtd numeros negativos: "+ qtdNegativos);
		
		
		
		sc.close();
	}

}
