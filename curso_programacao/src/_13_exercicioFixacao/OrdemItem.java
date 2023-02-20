package _13_exercicioFixacao;

public class OrdemItem {
	private Integer quantity;
	private double price;
	//associação
	private Product product;
	
	public OrdemItem() {
		super();
	}

	public OrdemItem(Integer quantity, double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}	
	
	
	public double subTotal() {
		return this.price * this.quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getProduct().getName());
		sb.append(", R$");
		sb.append(getProduct().getPrice());
		sb.append(", Qtd.");
		sb.append(this.quantity);
		sb.append(", subtotal ");
		sb.append(subTotal());
		
		return sb.toString();
	}
	
	
}
