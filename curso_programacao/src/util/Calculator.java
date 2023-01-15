package util;
/*
 * classe com atributos e métodos estáticos
 */

public class Calculator {
	public static final double PI = 3.14159; // Constante em Java

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
