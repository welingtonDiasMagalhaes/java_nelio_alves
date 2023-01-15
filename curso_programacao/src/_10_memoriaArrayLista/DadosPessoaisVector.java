package _10_memoriaArrayLista;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoaisVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de pessoas: ");
		int qtd = sc.nextInt();
		
		DadosPessoais[] DadosPessoaisVector = new DadosPessoais[qtd];
		
		System.out.println("dados das pessoas");
		int idade;
		double altura;
		String nome;
		
		for(int x=0; x < qtd; x++) {
			System.out.println("Idade: ");
			idade = sc.nextInt();
			System.out.println("altura: ");
			altura = sc.nextDouble();
			System.out.println("Nome: ");
			nome = sc.next();
			
			//armazena no vector
			DadosPessoaisVector[x] = new DadosPessoais(altura, nome, idade);
		}
		
		double somaAltura = 0;
		int qtdPessoascomMais16Anos = 0;
		for(int x=0; x < qtd; x++) {
			somaAltura += DadosPessoaisVector[x].getAltura();
			if(DadosPessoaisVector[x].getIdade() > 16) {
				qtdPessoascomMais16Anos++;
				System.out.println("- mais de 16 anos: "+DadosPessoaisVector[x].getNome());
			}
		}
		
		System.out.println("media das alturas: "+ (somaAltura/qtd));
		if(qtdPessoascomMais16Anos > 0) {
			double percentagem =  (double)qtdPessoascomMais16Anos/(double)qtd*100;
			System.out.printf("percentagem das pessoas com mais de 16 anos é %.2f", percentagem);
		}
		
		
		sc.close();
	}

}
