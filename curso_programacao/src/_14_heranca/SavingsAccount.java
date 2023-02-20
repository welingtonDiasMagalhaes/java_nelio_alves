package _14_heranca;

public class SavingsAccount extends Account{
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * this.interestRate;
	}
	
	//abaixo, final não permite que o método seja herdado
	@Override
	public final void withdraw(Double amount) {
		balance -= amount;
	}
}
