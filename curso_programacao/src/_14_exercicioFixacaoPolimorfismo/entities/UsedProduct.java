package _14_exercicioFixacaoPolimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// constante para data
	private Date ManufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		ManufactureDate = manufactureDate;
	}
	
	
	
	public Date getManufactureDate() {
		return ManufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		ManufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append("(used) $ "+this.getPrice());
		sb.append("(Manufactured date: $ " + sdf.format(ManufactureDate)+ ")");
		return sb.toString();
	}

}
