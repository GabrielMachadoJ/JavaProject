package classes;

public class Product {
	
	private String productDescription;
	private String date;
	private Double purchasePrice;
	private String suppliersName;
	
	
	public Product() {
	}
	
	public Product(String productDescription, String date, Double purchasePrice, String suppliersName) {
		this.productDescription = productDescription;
		this.date = date;
		this.purchasePrice = purchasePrice;
		this.suppliersName = suppliersName;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getSuppliersName() {
		return suppliersName;
	}
	public void setSuppliersName(String suppliersName) {
		this.suppliersName = suppliersName;
	}
	

}
