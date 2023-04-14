package _18_interfacesInjecaoDependencia.services;

public interface OnLinePaymentService {
	double paymentFee(double amount);
	double interest(double amount, int mounts);
}
