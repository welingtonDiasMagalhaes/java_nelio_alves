package _18_interfaceDefaultMethods.services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {
	private double interstRate;

	public BrazilInterestService(double interstRate) {
		this.interstRate = interstRate;
	}

	@Override
	public double getInterestRate() {
		return interstRate;
	}	
	
}
