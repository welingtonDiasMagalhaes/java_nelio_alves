package _16_arquivos;

import java.io.File;
import java.util.Scanner;

public class _5_ManipulandoPasta_ClasseFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//criar folder
		System.out.println("Enter a folder path: "); //c:\temp
		String strPath = sc.nextLine();
		
		File path = new File(strPath); //File como caminho
		
		//listar o conteudo da pasta: arquivos e pasta
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		//criando uma subpasta na pasta digitada pelo usuario
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();

	}

}
