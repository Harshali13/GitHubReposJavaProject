package coms.lti.github;

public class Product {
	
	private int  prodId;
	private String prodName;
	private double prodCost;
	
	public Product() {
		super();
	}
	public Product(int prodId, String prodName, double prodCost) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}
	
	
	

}
