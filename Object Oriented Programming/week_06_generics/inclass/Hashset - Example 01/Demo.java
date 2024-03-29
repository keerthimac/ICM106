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
		HashSet<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("B");
		strSet.add("C");
		strSet.add("D");
		System.out.println(strSet);
		
		strSet.add("D");
		System.out.println(strSet);//Dont Allow Duplicates 
		
		strSet.add("E");
		strSet.add("S");
		strSet.add("B");
		strSet.add("Q");
		strSet.add("A");
		System.out.println(strSet);// No order
		
	}
}

// Hashset elaminates duplicates
