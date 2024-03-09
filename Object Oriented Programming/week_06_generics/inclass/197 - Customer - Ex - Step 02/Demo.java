class Super{

	public boolean equals(Super obj){
		return false;
	}

	public String toString(){
		return null;
	}

	public Super peek(){
		return null;
	}

}

class Item extends Super{
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

	public boolean equals(Super obj){
		Item t1=(Item)obj;
		return this.code.equalsIgnoreCase(t1.code);
	}
			
}
class Customer extends Super{
	private String id;
	private String name;
	private int age;
	private double salary;
	
	public Customer(){
		
	}	
	public boolean equals(Super obj){
		Customer c1 = (Customer)obj;
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
	
	public void push(Super customer){
		Node n1=new Node(customer);
		n1.next=top;
		top=n1;
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public Super peek(){
		return top==null ? null : top.obj;
	}

	public String toString(){
		String list="{";
		Node temp=top;
		while(temp!=null){
			list+=temp.obj.toString()+", ";
			temp=temp.next;
		}
		return top==null ? "[empty]":list+"\b\b}";
	}
	public boolean contains(Super obj){
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
		private Super obj;
		private Node next;
		Node(Super obj){
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
		System.out.println(s1.toString());
		System.out.println("Contains C003-Siripala : "+s1.contains(new Customer("C003","Siripala",21,55000)));
		System.out.println();
		
		Stack s2=new Stack();
		s2.push(new Item("P001","A",50.0));
		s2.push(new Item("P002","B",10.0));
		s2.push(new Item("P003","C",60.0));
		s2.push(new Item("P004","D",40.0));
		System.out.println(s2.toString()); //{[P001-A-50],[P002-B-10],[P003-C-60],[P004-D-40]}
		System.out.println("Contains P002-B : "+s2.contains(new Item("P002","B",10.0))); //true
	}
}
