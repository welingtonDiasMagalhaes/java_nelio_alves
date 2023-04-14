package _16_arquivos;

import java.io.*;

public class _4_EscritaArquivo_ClassesFileWriterBufferedWriter {

	public static void main(String[] args) {
		/*
		 * • FileWriter (stream de escrita de caracteres em de arquivos)
		 *  https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html
		 *  Cria/recria o arquivo: new FileWriter(path) 
		 *  Acrescenta ao arquivo existente: new FileWriter(path, true) 
		 * • BufferedWriter (mais rápido) 
		 * * https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html
		 */
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "C:\\temp\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path)) ) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
