package _18_interfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "C:\\temp\\interfaceComparable.txt";
		
		//try with resources
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			//para leitura do arquivo e preenchimento da lista
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			//ordena coleção
			Collections.sort(list);
			
			//exibe a lista
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
