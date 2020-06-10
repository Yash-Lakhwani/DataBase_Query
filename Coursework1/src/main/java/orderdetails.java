
public class orderdetails {

	private int orderNumber;
	private String productCode;
	private int quantityOrdered;
	private double priceEach;
	private int orderLineNumber;
	
	public orderdetails() {
		super();
	}
	public orderdetails(int orderNumber, String productCode, int quantityOrdered,double priceEach,int orderLineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
		
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	
	
	public int getOrderLineNumber() {
		return orderLineNumber;
	}
	public double getPriceEach() {
		// TODO Auto-generated method stub
		return priceEach;
	}
	
}
