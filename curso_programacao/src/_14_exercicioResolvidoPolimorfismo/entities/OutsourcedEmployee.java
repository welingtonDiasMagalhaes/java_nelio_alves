package _14_exercicioResolvidoPolimorfismo.entities;

public class OutsourcedEmployee extends Employee{
	private double additionalcharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalcharge) {
		super(name, hours, valuePerHour);
		this.additionalcharge = additionalcharge;
	}

	public double getAdditionalcharge() {
		return additionalcharge;
	}

	public void setAdditionalcharge(double additionalcharge) {
		this.additionalcharge = additionalcharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + this.additionalcharge * 1.1;
	}
}
