package _13_composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	//associações
	private Department departament;
	//lista não tem o setXXX e tem add e remove
	private List<HourContract> contracts = new ArrayList<>(); //lista: instancia e não coloca no construtor
	
	
	public Worker() {
		super();
	}

	//construtor padrão, mas sem os do tipo lista
	public Worker(String name, WorkerLevel level, Double baseSalary, Department departament) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*
	 * não pode ter: trocaria a lista
	 * public void setContracts(List<HourContract> contracts) { this.contracts =
	 * contracts; }
	 */
	
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		//salario base
		double sum = this.baseSalary;
		//data
		Calendar cal = Calendar.getInstance();
				
		//percorrer os contrato para encontrar o mes e o ano
		for(HourContract c : this.contracts){
			//obtendo o mes e o ano do contrato
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH) + 1;
			
			System.out.printf("debug: income() %d/%d -- %d/%d", c_month, c_year, month, year);
			System.out.println();
			
			//compara o mes e o ano do contrato com os parametros
			if(c_year == year && c_month == month) sum += c.totalValue();
		}
		
		return sum;		
	}
}
