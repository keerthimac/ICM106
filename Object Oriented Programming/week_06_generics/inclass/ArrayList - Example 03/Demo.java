import java.util.*;

class Item{
	private String code;
	private String description;
	private double unitPrice;
	
	public Item(String code, String description, double unitPrice){
		this.code=code;
		this.description=description;
		this.unitPrice=unitPrice;
	}
	public String toString(){
		return "["+code+"-"+description+"-"+unitPrice+"]";
	}
	public boolean equals(Object obj){
		Item t1=(Item)obj;
		return this.code.equalsIgnoreCase(t1.code);
	}
}
class Customer{
	private String id;
	private String name;
	private int age;
	private double salary;
	
	public Customer(){
		
	}	
	public boolean equals(Object obj){
		//Customer c1=obj; //Illegal
		Customer c1=(Customer)obj; //Object Reference Casting
		return this.id.equalsIgnoreCase(c1.id);
	}
	public Customer(String id, String name, int age, double salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary; 
	}
	@Override
	public String toString(){
		return "["+id+"-"+name+"]";
	}
}

class Demo{
	public static void main(String args[]){
		ArrayList<Customer> ar = new ArrayList<>();
		ArrayList<String> stringList = new ArrayList<>();
		ArrayList objectList = new ArrayList<>();
		
		//customerList.add(Customer);
		//stringList.add(String);
		//objectList.add(Object);
		
	}
}

//This Have
//add(index,object)
//remove(index)
//contains(object)->boolean
//get(index)->Object
