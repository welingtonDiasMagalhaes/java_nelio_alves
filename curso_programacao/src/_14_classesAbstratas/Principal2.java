package _14_classesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		//lista da classe mais generica
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(11, "Bsilva", 10.0, 11.1));
		list.add(new BusinessAccount(12, "Csilva", 600.0, 100.0));
		list.add(new SavingsAccount(13, "Dsilva", 40.0, 11.1));
		list.add(new BusinessAccount(14, "Esilva", 350.0, 100.0));
		
		//total das contas
		double sum = 0.0;
		for(Account l: list) {
			sum += l.getBalance();
		}
		
		System.out.printf("total das contas (balance): %.2f%n", sum);
		
		//depositar x em cada conta
		for(Account l: list) {
			l.deposit(10.00);
		}
		
		for(Account l: list) {
			System.out.printf("conta %d - saldo atualizado: %.2f%n",l.getNumber(),l.getBalance());
		}
		

	}

}
