package controllers;

import java.util.ArrayList;

import classes.Product;

public class ProductController {
	
	ArrayList<Product> products = new ArrayList<>(); 
	
	
	public void handleCreateNewRegister(String productDescription, String date, Double purchasePrice, String suppliersName) {
		Product product = new Product();
		product.setProductDescription(productDescription);
		product.setPurchasePrice(purchasePrice);
		product.setDate(date);
		product.setSuppliersName(suppliersName);
		
		products.add(product);
	}
	
	

}
