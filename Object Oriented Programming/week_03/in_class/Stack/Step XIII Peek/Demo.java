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
	public int search(int data){
		Node temp=top;
		int index=0;
		while(temp!=null){
			if(temp.data==data){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public int peek(){
		return isEmpty()? -1:top.data;
	}
	public int poll(){
		int topElement=isEmpty()? -1:top.data;
		pop(); //top=top.next;
		return topElement;
	}
	public boolean contains(int data){
		return search(data)!=-1;
	}
	public int size(){
		int count=0;
		Node temp=top;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	private boolean isEmpty(){
		return top==null;
	}
	public void clear(){
		top=null;
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
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack(); //[50,40,30,20,10]
		int topElement=s1.peek();
		System.out.println("Top Element : "+topElement);//50
		
		System.out.println();
		System.out.println("After calling peek()...");
		s1.printStack(); //[50,40,30,20,10]
		System.out.println();
		
		topElement=s1.poll();
		System.out.println("Top Element : "+topElement);//50
		
		System.out.println();
		System.out.println("After calling poll()...");
		s1.printStack(); //[40,30,20,10]
	}
}
