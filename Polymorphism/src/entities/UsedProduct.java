package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	String pattern = "dd/MM/yyyy";
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	
	private Date manufactureDate;
	
	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public String priceTag() {
		return name 
				+ " (used) $ "
				+ String.format("%.2f", price)
				+ " Manufacture date: "
				+ sdf.format(manufactureDate)
				;
	}
	
}
