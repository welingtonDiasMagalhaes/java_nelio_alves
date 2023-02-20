package _14_heranca;

public class TesteSobreposição {

	public static void main(String[] args) {
		Account acc1 = new Account(10001,"Alex",1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account acc2 = new SavingsAccount(10002,"Maria",1000.0, 0.10);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003,"ABC",1000.0, 0.10);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
