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
}
class Demo{
	public static void main(String args[]){
		Customer c1=new Customer("C001","Danapala",20,45000);
		Customer c2=new Customer("C001","Danapala",20,45000);
		int x=c1.hashCode();	
		int y=c2.hashCode();	
		
		System.out.println("hash Code c1 : "+x);
		System.out.println("hash Code c2 : "+y);
	}
}
