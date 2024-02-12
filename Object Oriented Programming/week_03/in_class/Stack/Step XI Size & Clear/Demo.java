class Stack{
	private Node top;
	
	public void push(int data){
		Node n1=new Node(data);
		n1.next=top;
		top=n1;
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public void printStack(){
		Node temp=top;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(top==null ? "empty]":"\b\b]");
	}
	
	public int size(){
		Node temp=top;
		int size = 0;
		while(temp!=null){
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	public void clear(){
		top=null;
	}
}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.printStack(); //[empty]
		System.out.println("Size of the stack : "+s1.size()); //0
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack(); //[50,40,30,20,10]
		System.out.println("Size of the stack : "+s1.size()); //5
		


		s1.clear();
		s1.printStack(); //[empty]
	}
}
