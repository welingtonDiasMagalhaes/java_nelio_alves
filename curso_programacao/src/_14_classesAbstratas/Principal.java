package _14_classesAbstratas;

public class Principal {

	public static void main(String[] args) {
		//Account ACC1 = new Account(10, "Asilva", 100.00); // tempo de compilação, não pode instanciar devido ao abstract class
		Account ACC2 = new SavingsAccount(11, "Bsilva", 10.0, 11.1);
		Account ACC3 = new BusinessAccount(12, "Csilva", 600.0, 100.0);

	}

}
