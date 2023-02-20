package _14_heranca;

public class Principal {

	public static void main(String[] args) {
		BusinessAccount ba = new BusinessAccount();
		// ba.___ terá todos os metodos de Account
		
		//downcasting e upcasting
		Account acc = new Account(1001, "Abc", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//upcasting
		Account acc1 = bacc; //não gera erro, pois a superclasse recebeu a subclasse. Essa contem aquela
		Account acc2 = new BusinessAccount(1003, "cde", 12.0, 20.0);// sem erro, idem explicação acima
		Account acc3 = new SavingsAccount(1004, "bcd", 10.0, 60.0); // sem erro, idem explicação acima
		
		//downcasting
		//BusinessAccount acc4 = new acc2();//erro, operação 'insegura', a conversão não é natural
		BusinessAccount acc4 = (BusinessAccount) acc2; // então forçar o casting manual
		acc4.loan(10.9);//método loan está na BusinessAccount()
		//acc2.loan(5.0); //método loan não está na Account
		

		//BusinessAccount acc5 = acc3;  //erro, operação 'insegura', a conversão não é natural
		//BusinessAccount acc5 = (BusinessAccount) acc3; // então forçar o casting manual
		//mas acima tem um problema, pois acc3 é do tipo Account que na verdade é um SavingAccount
		//o erro vai aparecer em tempo de execução!
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * _14_heranca.SavingsAccount cannot be cast to class
		 * _14_heranca.BusinessAccount (_14_heranca.SavingsAccount and
		 * _14_heranca.BusinessAccount are in unnamed module of loader 'app') at
		 * _14_heranca.Principal.main(Principal.java:26)
		 */
		
		//acima tem que testar pelo instanceof()
		if(acc3 instanceof BusinessAccount) { //não vai executar
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(2.2);
			System.out.println("loan");
		}
		
		if(acc3 instanceof SavingsAccount) { // vai executar: acc3 é instancia de SavingsAccount
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("update");
		}
	}

}
