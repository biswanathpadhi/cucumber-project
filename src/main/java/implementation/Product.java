package implementation;

import java.util.ArrayList;
import java.util.List;



public class Product {

	private String productName;
	private String productPrice;
	private List<String> productNamelist = new ArrayList<String>();

	public Product(String productName, String productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		productNamelist.add(productName);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	public List<String> getListOfProductName() {
		productNamelist.add("Macbook");
		return productNamelist;
	}

}
