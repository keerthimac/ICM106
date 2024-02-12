class Stack{
	private Node top;
	
	public void push(int data){
		top = new Node(data);
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
	}
}
