package _18_interfacesInjecaoDependencia.services;

public class PaypalService implements OnLinePaymentService {

	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int mounts) {
		return amount * mounts * 0.01;
	}
	
}
