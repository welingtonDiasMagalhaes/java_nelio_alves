package _13_exercicioFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para a data
	private Date moment;
	private OrderStatus order;
	//associações
	private Client client; //tem um cliente: associação
	//lista não tem o setXXX e tem add e remove. lista: instancia e não coloca no construtor
	private List<OrdemItem> items = new ArrayList<OrdemItem>(); //pode ter 1 ou mais orderItem: composição
	
	public Order() {
		super();
	}

	public Order(Date moment, OrderStatus order, Client client) {
		super();
		this.moment = moment;
		this.order = order;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrder() {
		return order;
	}

	public void setOrder(OrderStatus order) {
		this.order = order;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrdemItem> getItems() {
		return items;
	}

	/*
	 * não tem pois trocaria a lista
	 * public void setItems(List<OrdemItem> items) { this.items = items; }
	 */
	
	public void addItem(OrdemItem oi) {
		items.add(oi);
	}
	
	public void removeItem(OrdemItem oi) {
		items.remove(oi);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrdemItem oi : items) {
			sum += oi.subTotal();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status:");
		sb.append(order + "\n");
		sb.append("Client :");
		sb.append(client + "\n");
		sb.append("Itens :");
		for (OrdemItem oi : items) {
			sb.append(oi + "\n");
		}
		sb.append("total Price: " + "\n");
		sb.append(String.format("%.2f", total()) + "\n");
		return sb.toString();
	}
	
	
	
}
