package _16_arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _1_LendoArquivo_ClassesFileScanner {
	public static void main(String[] args) {
		
		/*
		 * File - Representação abstrata de um arquivo e seu caminho
		 * https://docs.oracle.com/javase/10/docs/api/java/io/File.html
		 * 
		 * Scanner - Leitor de texto
		 * https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
		 * 
		 * IOException (Exception)
		 * https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html
		 */		
		File file = new File("C:\\Temp\\teste.txt");
		Scanner sc = null;
		try{
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally	{ //para o scanner ser fechado se tiver conteudo
			if (sc != null) {
				sc.close();
			}
		}
	}

}
