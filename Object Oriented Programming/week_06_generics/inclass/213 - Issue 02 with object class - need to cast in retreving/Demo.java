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
	public String toString(){
		return "["+id+"-"+name+"-"+age+"-"+salary+"]";
	}
}

class Stack{
	private Node top;
	
	public void push(Object obj){
		Node n1=new Node(obj);
		n1.next=top;
		top=n1;
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public Object peek(){
		return top==null ? null : top.obj;
	}
	public String toString(){
		String list="{";
		Node temp=top;
		while(temp!=null){
			list+=temp.obj+", ";//obj.toString()
			temp=temp.next;
		}
		return top==null ? "[empty]":list+"\b\b}";
	}
	public boolean contains(Object obj){
		Node temp=top;
		while(temp!=null){
			if(temp.obj.equals(obj)){
				return true;
			}
			temp=temp.next;	
		}
		return false;
	}
	//------------Inner class---------------
	class Node{
		private Object obj;
		private Node next;
		Node(Object obj){
			this.obj=obj;
		}
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(new Customer("C001","Danapala",20,45000));
		s1.push(new Customer("C002","Gunapala",22,75000));
		s1.push(new Customer("C003","Siripala",21,55000));
		s1.push(new Customer("C004","Somapala",25,25000));
		System.out.println(s1);
		System.out.println();
		
		//Customer c1=s1.peek(); //Illegal, need to cast
		
		Customer c1=(Customer)s1.peek();
		System.out.println(c1);
		
	}
}
