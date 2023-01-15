package _04_estruturaSequencial;

import java.util.Scanner;

public class _05_entradaDados_AteQuebraLinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		System.out.println("Digite dados em três linhas");
		s1 = sc.nextLine(); //para ler a linha toda
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
