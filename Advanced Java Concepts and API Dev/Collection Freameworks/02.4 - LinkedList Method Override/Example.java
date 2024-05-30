import java.util.*; 
class Customer{
	private int code;
	private String name;
	Customer(int code, String name){
		this.code=code;
		this.name=name;
	}
	//public String toString(){
	//	return code+"-"+name;
	//}
	//public boolean equals(Object obj){
	//	return obj instanceof Customer ? ((Customer)obj).code==this.code : false;
	//}
}
class Example{
	public static  void main(String []args){
		ArrayList <Customer>customerList=new ArrayList<>();
		customerList.add(new Customer(1001,"Danapala")); 
		customerList.add(new Customer(1002,"Gunapala")); 
		customerList.add(new Customer(1003,"Somapala")); 
		customerList.add(new Customer(1004,"Siripala")); 
		System.out.println(customerList);
		
		System.out.println("Contains 1002-Gunapala : "+customerList.contains(new Customer(1002,"Gunapala"))); //false
		customerList.remove(new Customer(1002,"Gunapala")); 
		System.out.println(customerList);
	}
}



