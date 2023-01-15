package _08_introducaoPOO;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class PrincipalCalculator {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// Para considerar o separador de decimais como ponto, ANTES da declaração do
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//chamada de metodos estáticos: classe.metodo()
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		
		//chamada de constante: classe.constante
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}

}
