package _18_interfaceDefaultMethods.services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {
	private double interstRate;

	public UsaInterestService(double interstRate) {
		this.interstRate = interstRate;
	}

	@Override
	public double getInterestRate() {
		return interstRate;
	}
}
