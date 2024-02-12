class Stack{
	private Node top;
	
	public void push(int data){
		Node n1=new Node(data); //1
		n1.next=top; //2
		top=n1; //3
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
	}
}
