package _14_exercicioFixacaoPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import _14_exercicioFixacaoPolimorfismo.entities.ImportedProduct;
import _14_exercicioFixacaoPolimorfismo.entities.Product;
import _14_exercicioFixacaoPolimorfismo.entities.UsedProduct;
import _14_exercicioResolvidoPolimorfismo.entities.Employee;

public class Principal {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> product = new ArrayList<>();
		
		System.out.println("enter with number of products:");
		int qtd = sc.nextInt();
		
		for(int x=1; x <=qtd; x++) {
			System.out.println("Product n. "+x);
			
			String type = "";
			do {
				System.out.println("Common (C), Used (U), Imported (I): ");
				type = sc.next().toUpperCase();
			} while (!type.equals("C") &&  !type.equals("U") && !type.equals("I"));
			
			System.out.println("Name of product: ");
			String name = sc.next();
			
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			
			if(type.equals("C")) {
				Product p = new Product(name, price);	
				product.add(p);
			}
			else if(type.equals("U")){
				System.out.println("Manufactured date (dd/mm/yyyy):");
				String date = sc.next();
				Product p = new UsedProduct(name, price, sdf.parse(date));	
				product.add(p);
			}
			else {
				System.out.println("Custom fee:");
				Double customFee = sc.nextDouble();
				Product p = new ImportedProduct(name, price, customFee);
				product.add(p);
			}			
		}		
		
		for (Product p : product) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
