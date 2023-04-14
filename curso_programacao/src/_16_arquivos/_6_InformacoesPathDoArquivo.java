package _16_arquivos;

import java.io.File;
import java.util.Scanner;

public class _6_InformacoesPathDoArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: "); //c:\temp
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		//obtendo e apresentando os dados do path
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		
		sc.close();

	}

}
