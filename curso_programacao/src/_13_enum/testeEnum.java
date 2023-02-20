package _13_enum;

import java.util.Date;

import entities.enums.OrderStatus;

public class testeEnum {

	public static void main(String[] args) {
		Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order.toString());
		
		
		//Conversão de String para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1+" - "+os2);

	}

}
