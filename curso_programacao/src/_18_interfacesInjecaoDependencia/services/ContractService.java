package _18_interfacesInjecaoDependencia.services;

import java.time.LocalDate;

import _18_interfacesInjecaoDependencia.entities.Contract;
import _18_interfacesInjecaoDependencia.entities.Installment;

public class ContractService {
	private OnLinePaymentService onLinePaymentService;

	public ContractService(OnLinePaymentService onLinePaymentService) {
		this.onLinePaymentService = onLinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		/*
		 * teste manual
		 * contract.getInstallments().add(new Installment(LocalDate.of(2018,7, 25),
		 * 206.04)); contract.getInstallments().add(new Installment(LocalDate.of(2018,8,
		 * 25), 208.08));
		 */
		
		double basicQuota = contract.getTotalValue() / months;
		for(int i = 1; i<= months; i++) {
			//data de vencimento
			LocalDate dueDate= contract.getDate().plusMonths(i);
			//calculo da parcela
			double interest = onLinePaymentService.interest(basicQuota, i);
			double fee = onLinePaymentService.paymentFee(basicQuota+interest);
			double quota = basicQuota + interest + fee;
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
