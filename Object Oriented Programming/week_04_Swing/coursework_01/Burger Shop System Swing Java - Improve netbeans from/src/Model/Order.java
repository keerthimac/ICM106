/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Keeth
 */
public class Order {
	private String orderId;
	private String customerId;
	private String customerName;
	private int qty;
	private double total;
	private int status;
		
	public Order(String orderId,String customerId,String customerName,int qty,double total,int status){
		this.orderId=orderId;
		this.customerId=customerId;
		this.customerName=customerName;
		this.qty=qty;
		this.total=total;
		this.status=status;
	}
		
	public String getOrderId(){
		return orderId;
	}
	public String getCustomerId(){
		return customerId;
	}
	public String getCustomerName(){
		return customerName;
	}
	public int getQty(){
		return qty;
	}
	public double getTotal(){
		return total;
	}
	public int getStatus(){
		return status;
	}

	public void setQty(int qty){
		this.qty = qty;
	}
	public void setTotal(double total){
		this.total = total;
	}
	public void setStatus(int status){
		this.status = status;
	}
        public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	public void setCustomerId(String customerId){
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}  
}
