package _18_interfaceComparable.entites;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//implementação do contrato Comparable
	@Override
	public int compareTo(Employee o) {
		//return name.compareTo(o.getName());
		//return salary.compareTo(o.getSalary());
		return -salary.compareTo(o.getSalary()); //para decrescente: colocar o - na frente
	}
}
