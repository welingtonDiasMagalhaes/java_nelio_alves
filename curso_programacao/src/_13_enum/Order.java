package _13_enum;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	/*
	 * 
	 * 	• É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas
		• Palavra chave em Java: enum
		• Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador
	 */
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Integer id, Date moment, OrderStatus status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
}
