package _04_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class _04_entradaDados_variosSeparadosEspaco {

	public static void main(String[] args) {
		//associar a variavel sc ao teclado no modo console
		Locale.setDefault(Locale.US);// Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner
		Scanner sc = new Scanner(System.in);
			
		// Para ler vários dados na mesma linha
		String x;
		int y;
		double z;
		
		System.out.println("digite separados por espaço: string int decimal");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("Dados digitados: %s - %d - %f", x, y, z);
		//atentar para %s (string), %f (decimal) 
		
		sc.close(); //para encerrar o recurso
	}

}
