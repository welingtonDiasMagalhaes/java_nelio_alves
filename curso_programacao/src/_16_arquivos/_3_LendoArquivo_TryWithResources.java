package _16_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _3_LendoArquivo_TryWithResources {

	public static void main(String[] args) {
		// forma melhorada para a leitura
				
		/*
		 * Bloco try-with-resources 
		 * • É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
		 * • Disponível no Java 7 em diante
		 *  https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		 */
		
		String path = "C:\\Temp\\teste.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine(); //lê uma linha
			while (line != null) { //se não for null, lê a próxima linha
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
	}

}
