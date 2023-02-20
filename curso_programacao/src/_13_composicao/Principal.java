package _13_composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.WorkerLevel;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para data
		
		//dados do trabalhador
		System.out.println("Entre com o Departamento (Department):");
		String departamentName = sc.nextLine();
		
		System.out.println("Entre com os dados do trabalhador (Worker):");
		System.out.println("Nome do trabalhador: ");
		String workerName = sc.nextLine();
		System.out.println("Nivel: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		//WorkerLevel.valueOf(workerLevel) -> para o enum, deve transformar em string
		//departamento, deve estanciar, pois é uma classe
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));
		
		//qtd e dados dos contratos
		System.out.println("quantidade de contratos (Contracts) desse trabalhador: ");
		int qtd = sc.nextInt();
		
		for (int i=1; i<= qtd; i++) {
			System.out.println("Entre com os dados do contrato "+i);
			//data
			System.out.print("data (dd/mm/yyyy): ");
			//precisa do SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date contractDate = sdf.parse(sc.next());
			//valor por hora
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			//duração
			System.out.print("duração do contrato: ");
			int hours = sc.nextInt();
			
			//instanciando o contrato
			HourContract contract = new HourContract(contractDate,valuePerHour, hours);	
			
			//associar o contrato ao trabalhador
			worker.addContract(contract);
		}
		
		//para buscar o ganho de um contrato pelo mes e ano
		System.out.println();
		System.out.println("entre com mês e ano (MM/yyyy) para buscar o vencimento:");
		String monthAndYear = sc.next();
		//quebrando para obter o mes e ano
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		//para imprimir os dados do trabalhador e o ganho
		System.out.println("Nome: "+worker.getName()); //obtendo o nome
		System.out.println("Departamento: "+worker.getDepartament().getName()); //obtendo o departamento de uma composiçao
		//System.out.println("Ganho em "+ monthAndYear +": "+ String.format("%2.f",worker.income(year, month)) );
		System.out.println("Ganho em "+ monthAndYear +": "+ worker.income(year, month));
		
		sc.close();
		
	}

}
