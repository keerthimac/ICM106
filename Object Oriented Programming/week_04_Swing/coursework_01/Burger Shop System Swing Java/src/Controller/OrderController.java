/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.OrderList;
import Model.Order;

/**
 *
 * @author Keeth
 */
public class OrderController {
	static OrderList db = new OrderList();
	
	public String generateOrderId(){
		return db.generateOrderId();
	}

	public String generateCustomerId(){
		return db.generateCustomerId();
	}        
        
	public Order getOrderInfo(int Index){
		return db.getOrderInfo(Index);
	}
	public void addOrder(Order order){
		db.add(order);
	}
	
	public int searchOrderIndex(String orderId){
		return db.searchOrderIndex(orderId);
	}
	
	public int searchCustomerIndex(String customerId){
		return db.searchCustomerIndex(customerId);
	}
	
	public Order[] getCustomerOrders(String customerId){
		return db.getCustomerOrders(customerId);
	}

	public Order[] getOrdersByStatus(int option){
		return db.getOrdersByStatus(option);
	}
	public void updateOrderByQty(int orderIndex,int bugQty,double price){
		db.updateOrderByQty(orderIndex,bugQty,price);
	}
	
	//--------------Extend Custom Order Array---------------------//
	private Order[] extendCustArray(Order[] arr){
		Order[] tempArr = new Order[arr.length+1];
		for (int i = 0; i < arr.length; i++){
			tempArr[i]=arr[i]; 
		}
		arr=tempArr;
		return arr;
	}

	
	public Order[] removeDupCusId() {
		Order[] dupRemovedArr = new Order[0];
		Order[] orderArray = db.copyOrderList();
		for (int i = 0; i < orderArray.length; i++){
			if(db.searchCustomerIndex(orderArray[i].getCustomerId(),dupRemovedArr)==-1){
				dupRemovedArr = extendCustArray(dupRemovedArr);
				dupRemovedArr[dupRemovedArr.length-1] = orderArray[i];
			}
		}
		return dupRemovedArr;
	}

	public double[] findTotalForEach(){
		Order[] cusArray = removeDupCusId();
		Order[] orderArray = db.copyOrderList();
		double[] totalForEach = new double[cusArray.length];
		for (int i = 0; i <cusArray.length;i++){
			int total = 0;
			for (int j = 0; j<orderArray.length; j++){
				if(cusArray[i].getCustomerId().equalsIgnoreCase(orderArray[j].getCustomerId())&& orderArray[j].getStatus()!=2){
					total+=orderArray[j].getTotal();
				}
			}
			totalForEach[i] = total;
		}
		return totalForEach;
	}
	
	public int[] findTotalQtyForEach(){
		Order[] cusArray = removeDupCusId();
		Order[] orderArray = db.copyOrderList();
		int[] totalQtyForEach = new int[cusArray.length];
		for (int i = 0; i <cusArray.length;i++){
			int total = 0;
			for (int j = 0; j<orderArray.length; j++){
				if(cusArray[i].getCustomerId().equalsIgnoreCase(orderArray[j].getCustomerId())&& orderArray[j].getStatus()!=2){
					total+=orderArray[j].getQty();
				}
			}
			totalQtyForEach[i] = total;
		}
		return totalQtyForEach;
	}


	public Order[] findBestCustomers(){
		Order[] cusArray = removeDupCusId();
		Order[] tempCusArray = new Order[cusArray.length];
		double[] totalForEach = findTotalForEach();
		int[] totalQtyForEach = findTotalQtyForEach();
		
		//Sort totalForEach and Customer Arrays
		for (int i = totalForEach.length-1; i>0; i--){
			for(int j = 0 ; j<i ; j++){
				if(totalForEach[j]<totalForEach[j+1]){
					double temp = totalForEach[j];
					totalForEach[j] = totalForEach[j+1];
					totalForEach[j+1]=temp;
					
					//Sort cusId array
					Order tempIdStr = cusArray[j];
					cusArray[j] = cusArray[j+1];
					cusArray[j+1]=tempIdStr;
					
					//Sort qty array
					int tempQty = totalQtyForEach[j];
					totalQtyForEach[j] = totalQtyForEach[j+1];
					totalQtyForEach[j+1]=tempQty;
					
				}
			}
		}
		//Create New Order array for return
		for (int i = 0; i < cusArray.length; i++){
			tempCusArray[i] = new Order(cusArray[i].getOrderId(),cusArray[i].getCustomerId(),cusArray[i].getCustomerName(),totalQtyForEach[i],totalForEach[i],cusArray[i].getStatus());
		}
		cusArray = tempCusArray;
		return cusArray;		
			
	}	
	
}
