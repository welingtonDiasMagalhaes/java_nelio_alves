package _14_heranca;

public class ExemploPolimorfismo {

	public static void main(String[] args) {
		Account x = new BusinessAccount(1003, "cde", 12.0, 20.0);// sem erro, idem explicação acima
		Account y = new SavingsAccount(1004, "bcd", 10.0, 60.0); // sem erro, idem explicação acima
		
		/*
		POLIMORFISMO recurso que permite que variáveis de um mesmo tipo mais genérico possam
		apontar para objetos de tipos específicos diferentes, tendo assim
		comportamentos diferentes conforme cada tipo específico.
		*/
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
