/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Model.Order;

/**
 *
 * @author Keeth
 */
public class OrderList {
	private Node first;

	public OrderList(){
		addSampleOrders();
	}
//=================Private Intenal Classe for Linked List===============
	
	private class Node{
		Order order;
		Node next;
		
		Node(Order order){
			this.order =order;
		}
	
	}

//======================================================================


   private void addSampleOrders() {
        add(new Order("B001", "C001", "Nimal", 3, 1500.00, 0));
        add(new Order("B002", "C002", "Sunil", 5, 2500.00, 0));
        add(new Order("B003", "C001", "Nimal", 2, 1000.00, 0));
        add(new Order("B004", "C003", "Sunimal", 4, 2000.00, 1));
        add(new Order("B005", "C004", "Kamal", 1, 500.00, 0));
        add(new Order("B006", "C005", "Samanmal", 3, 1500.00, 0));
        add(new Order("B007", "C002", "Sunil", 1, 500.00, 0));
        add(new Order("B008", "C004", "Kamal", 7, 3500.00, 2));
    }

	
	private boolean isEmpty(){
		return first==null;
	}

//=================Generate Order IDs===================================
	
	public String generateOrderId() {
		if(first==null){
			return String.format("B%03d",1);
		}else{
			Node temp = first;
			while(temp.next!=null){
				temp=temp.next;
			}
			String lastId = temp.order.getOrderId();
			int lastDigit = Integer.parseInt(lastId.substring(1));
			return String.format("B%03d",lastDigit+1);		
		}
	}

	public String generateCustomerId() {
                int lastDigit = 0;
		if(first==null){
			return String.format("C%03d",1);
		}else{
			Node temp = first;
			while(temp.next!=null){
                            temp=temp.next;                            
                            if(Integer.parseInt(temp.order.getCustomerId().substring(1))>lastDigit){
                                lastDigit = Integer.parseInt(temp.order.getCustomerId().substring(1));
                                System.out.println(lastDigit);
                            }
			}
			//String lastId = temp.order.getCustomerId();
			//int lastDigit = Integer.parseInt(lastId.substring(1));
                        //System.out.println(lastDigit);
			return String.format("C%03d",lastDigit+1);		
		}
	}        
        
//------------Add Order to List-----------------------------------------
	
	public void add(Order order){
		Node n1 = new Node(order);
		if(first==null){
			first = n1;
		}else{
			Node lastNode = first;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next=n1;
		}
	}

//------------Search Order Index----------------------------------------
	
	public int searchOrderIndex(String orderId){
		if(orderId!=null){
			Node temp = first;
			int count = 0;
			while(temp!=null){
				if(orderId.equalsIgnoreCase(temp.order.getOrderId())){
					return count;
				}else{
					temp=temp.next;
					count++;
				}
			}
		}
		return -1;		
	}




//-------------Search Customer Index------------------------------------	
	public int searchCustomerIndex(String cusId){
		if(cusId!=null){
			Node temp = first;
			int count = 0;
			while(temp!=null){
				if(cusId.equalsIgnoreCase(temp.order.getCustomerId())){
					return count;
				}else{
					temp=temp.next;
					count++;
				}
			}
		}		
		return -1;
	}	

//-------------get Customer Oders---------------------------------------

	private int getOrderCount(String customerId){
		if(customerId!=null){
			Node temp = first;
			int orderCount = 0;
			while(temp!=null){
				if(customerId.equalsIgnoreCase(temp.order.getCustomerId())){
					orderCount++;
					temp=temp.next;
				}else{
					temp=temp.next;
				}
			}
			return orderCount;
		}
		return -1;
	}

	public Order[] getCustomerOrders(String customerId){
		if(customerId!=null){
			Order[] tempArr = new Order[getOrderCount(customerId)];
			Node temp =first;
			int count = 0;
			while(temp!=null){
				if(customerId.equalsIgnoreCase(temp.order.getCustomerId())){
					tempArr[count++] = temp.order;
					temp=temp.next;
				}else{
					temp=temp.next;
				}
			}
			return tempArr;
		}
		return null;
	}

//-------------get Orders by Index--------------------------------------

	private int getOrderCount(int option){
		Node temp = first;
		int orderCount = 0;
		while(temp!=null){
			if(option==temp.order.getStatus()){
				orderCount++;
				temp=temp.next;
			}else{
				temp=temp.next;
			}
		}
		return orderCount;
	}

	public Order[] getOrdersByStatus(int option){
		Order[] tempArr = new Order[getOrderCount(option)];
		Node temp =first;
		int count = 0;
		while(temp!=null){
			if(option==temp.order.getStatus()){
				tempArr[count++] = temp.order;
				temp=temp.next;
			}else{
				temp=temp.next;
			}
		}
		return tempArr;		
	}

//-------------Duplicate Removed Arrays---------------------------------

   //-------------Return Copy of Order Array-----------------------//

	public Order[] copyOrderList(){
		Order[] tempArr = new Order[size()];
		Node temp=first;
		int count = 0;
		while(temp!=null){
			tempArr[count++]=temp.order;
			temp=temp.next;
		}
                //System.out.println(tempArr);
		return tempArr;
		
	}

	//-------------Search Customer Index in Array----------------//	
	public static int searchCustomerIndex(String id, Order[] arr){
		for (int i = 0; i < arr.length; i++){
			if(id.equalsIgnoreCase(arr[i].getCustomerId())){
				return i;
			}
		}
		return -1;
	}

//-------------Update Order by Index------------------------------------
	
	public void updateOrderByQty(int orderIndex,int bugQty,double price){
		Order order = getOrderInfo(orderIndex);
		order.setQty(bugQty);
		order.setTotal(bugQty*price);
	}

	public int size(){
		Node temp = first;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}

//-------------Return Order Object--------------------------------------
	
	public Order getOrderInfo(int index){
		if(isValidIndex(index)){
			Node temp=first;
			int count=0;
			while(count<index){
				temp=temp.next;
				count++;
			}
			return temp.order;
		}
		return null;
	}


//-------------Validate Index-------------------------------------------
	private boolean isValidIndex(int index){
		return index>=0 && index<=size();
	}
}
