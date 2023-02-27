package _15_excecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author wemagalh
 *• É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
 *• Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.
 */
public class _3_finally {
	

	public static void main(String[] args) {
		File file = new File("in.txt"); ///File("C:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file); //classe Scanner lendo arquivo!
			while (sc.hasNextLine()) {//percorrendo as linhas e imprimindo
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();			
			}
			System.out.println("\nexecutou o finally!");
		}

	}

}