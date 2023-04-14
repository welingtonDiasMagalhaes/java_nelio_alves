package _16_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _2_LendoArquivo_ClassesFileReaderBufferedReader {

	public static void main(String[] args) {
		/*
		 * FileReader (stream de leitura de caracteres a partir de arquivos: sequencia
		 * de leitura, vai lendo a medida que precisa)
		 * https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
		 * 
		 * BufferedReader (mais rápido. Usa o FileReader e possui otimizações)
		 * https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
		 * 
		 * https://stackoverflow.com/questions/9648811/specific-difference-betweenbufferedreader-and-filereader
		 */

		String path = "C:\\Temp\\teste.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(path); //estabelece o stream: a sequencia de leitura
			br = new BufferedReader(fr); //usa o buffer, que é otimizado, para tornar a leitura do arquivo mais rápida
			
			String line = br.readLine();//le uma linha, se estiver no final, retorna null
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			//fecha o FileReader e o bufferedReader
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
