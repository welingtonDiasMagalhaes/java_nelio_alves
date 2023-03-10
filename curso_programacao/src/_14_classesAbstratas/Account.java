package _14_classesAbstratas;

public abstract class Account {
	private Integer number;
	private String holder;
	protected Double balance; //para que balance seja aceito em subclasse
	
	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	/*
	 * alterar o saldo pelos métodos e não pelo setBalance
	 * public void setBalance(Double balance) { this.balance = balance; }
	 */
	
	public void withdraw(Double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
}
