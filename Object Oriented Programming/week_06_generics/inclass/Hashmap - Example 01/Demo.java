import java.util.*;
class Customer{
	private String id;
	private String name;
	private int age;
	private double salary;
	
	public Customer(){
		
	}	
	public Customer(String id, String name, int age, double salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary; 
	}	
	public String toString(){
		return id+"-"+name;
	}
}

class Demo{
	public static void main(String args[]){
		HashMap <String,Customer>hm=new HashMap<>();
		hm.put("D", new Customer("C001","Danapala",34,2333));
		hm.put("G", new Customer("C002","Gunapala",34,2333));
		hm.put("T", new Customer("C003","Siripala",34,2333));
		hm.put("B", new Customer("C004","Somapala",34,2333));
		
		System.out.println(hm);
		
		Customer c1=hm.get("G");
		System.out.println(c1); //C002-Gunapala
	}
}
