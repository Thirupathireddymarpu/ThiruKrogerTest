package kroger.product.vo;

import java.util.Date;

public class Product {

	private int productNumber;
	private ProductCategories productCategories;
	private String productName;
	private Date dateOfExpiry;
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public ProductCategories getProductCategories() {
		return productCategories;
	}
	public void setProductCategories(ProductCategories productCategories) {
		this.productCategories = productCategories;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productCategories=" + productCategories + ", productName="
				+ productName + ", dateOfExpiry=" + dateOfExpiry + "]";
	}
	
	
	

	

}
