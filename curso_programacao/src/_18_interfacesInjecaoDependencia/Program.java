package _18_interfacesInjecaoDependencia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import _18_interfacesInjecaoDependencia.entities.Contract;
import _18_interfacesInjecaoDependencia.entities.Installment;
import _18_interfacesInjecaoDependencia.services.ContractService;
import _18_interfacesInjecaoDependencia.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formato da data
		
		System.out.println("*** Entre com os dados do contrato");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy):");
		LocalDate data = LocalDate.parse(sc.next(),fmt); //faz o parse com o formato da data definito anteriormente
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(numero, data, totalValue);
		
		System.out.print("Entre com o numero de parcelas:");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas:");
		for(Installment installment : obj.getInstallments()) System.out.println(installment);
		
		sc.close();

	}

}
