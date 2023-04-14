package _18_interfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import _18_interfaceComparable.entites.Employee;

public class Program2 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\interfaceComparable2.txt";

		// try with resources
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// para leitura do arquivo e preenchimento da lista
			String employeCSV = br.readLine();
			while (employeCSV != null) {
				String[] fields = employeCSV.split(","); // para cada linha, quebra pela ",", gerando vetor
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeCSV = br.readLine();// lê a próxima linha
			}

			// ordena coleção
			Collections.sort(list);

			// exibe a lista
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
