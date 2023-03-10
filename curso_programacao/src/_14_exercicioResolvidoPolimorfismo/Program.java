package _14_exercicioResolvidoPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _14_exercicioResolvidoPolimorfismo.entities.Employee;
import _14_exercicioResolvidoPolimorfismo.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de funcionarios: ");
		int n = sc.nextInt();
		
		List<Employee> employee = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.println("Funcionario (Employee) "+ (i+1));
			String outsorcedEmployee = "";
			do {
				System.out.println("é terceirizado (OutsorcedEmployee) <S/N>?");
				outsorcedEmployee = sc.next().toUpperCase();
			} while (!outsorcedEmployee.equals("N") &&  !outsorcedEmployee.equals("S") );
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println("Value per Hour: ");
			double valePerHour = sc.nextDouble();
			
			if(outsorcedEmployee.equals("S")) {
				System.out.println("Additional charge: ");
				double Additionalcharge = sc.nextDouble();
				
				//para o terceirizado
				Employee emp = new OutsourcedEmployee(name, hours, valePerHour, Additionalcharge);
				employee.add(emp);
			}
			else {
				Employee emp = new Employee(name, hours, valePerHour);
				employee.add(emp);
			}		
			
		}
		
		//exibir pagamentos
		System.out.println("");
		System.out.println("** pagamentos **");
		for(Employee e : employee) {
			System.out.println(e.getName()+ " - $ "+ String.format("%.2f",e.payment()));
		}
		
		sc.close();

	}

}
