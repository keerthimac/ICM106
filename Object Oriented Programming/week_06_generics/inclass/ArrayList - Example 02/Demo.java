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
		ar.add(new Customer("C001","Danapala",20,45000));
		ar.add(new Customer("C002","Gunapala",22,75000));
		ar.add(new Customer("C003","Siripala",21,55000));
		ar.add(new Customer("C004","Somapala",25,25000));
		System.out.println(ar);//need to override the toString method to return string otherwise retuns addresses of the objects
		
		//ar.add("Darshana"); // Ilegal, add(Object) because can only add Customer objects
		//ar.add(new Integer(100));//Legal, add(Object) because can only add Customer objects
		System.out.println(ar);
		
		//Customer c1= ar.get(2);//Illigal, Object get(int Index);
		Customer c1 = ar.get(2);//Legal, no need to cast
		System.out.println(c1);
	}
}

//This Have
//add(index,object)
//remove(index)
//contains(object)->boolean
//get(index)->Object
