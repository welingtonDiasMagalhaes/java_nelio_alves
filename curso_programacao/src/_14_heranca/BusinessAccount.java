package _14_heranca;

public class BusinessAccount extends Account{
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //Chama o construtor da super Classe: Account
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= this.loanLimit) {
			//deposit(amount);
			balance += amount - 10;
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);//executa na superclasse
		balance -=2.0; //aplica o desconto no saldo
	}
	
}
