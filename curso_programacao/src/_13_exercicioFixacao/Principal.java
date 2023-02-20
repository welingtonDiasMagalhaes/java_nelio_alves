package _13_exercicioFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;

public class Principal {

	public static void main(String[] args) throws ParseException {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para a data de nascimento
		
		//Product p1 = new Product("TV", 1200.00);		
		//OrdemItem oi1 = new OrdemItem(2, 1200.00, p1);		
		//testes de acesso das propriedades
		//System.out.println(oi1.getQuantity());
		//System.out.println(oi1.getPrice());
		//System.out.println(oi1.getProduct().getName());
		//System.out.println(oi1.subTotal());
		//System.out.println(oi1.toString());
		
		//Client c1 = new Client("cliente 1", "email.cliente@teste.com", sdf.parse("02/10/1975"));
		//System.out.println(c1.toString());
		
		System.out.println("Enter client data:");
		System.out.println("Name:");
		String name = sc.next();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("birthDate (dd/MM/yyyy):");
		Date birthDate = sdf.parse(sc.next()); //para a data
		Client client = new Client(name, email, birthDate);
		System.out.println();
		
		System.out.println("Enter order data: ");
		System.out.println("Status ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); //converte a string digitada para o valor do enum
		
		//instanciando a ordem
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		for (int i=0; i < n; i++) {
			System.out.println("Enter "+ (i+1) +" data:");
			
			System.out.println("Product name: ");
			String productName = sc.next();
			
			
			System.out.println("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.println("Quantity: ");
			Integer quantity= sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			//adiciona o  produto ao item
			OrdemItem ordemItem = new OrdemItem(quantity, productPrice, product);	
			
			//adiciona o item a ordem
			order.addItem(ordemItem);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();	

	}

}
