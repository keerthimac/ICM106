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

	public boolean contains(int num){
		Node temp=top;
		while(temp!=null){
			if(search(num)!=-1){
				return true;
			}
			temp=temp.next;
		}
		return false;
	} 

	public int search(int num){
		int index=0;
		Node temp=top;
		while(temp!=null){
			if(temp.data==num){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
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
		System.out.println("Contains 30 : "+s1.contains(30)); //true
		System.out.println("Contains 33 : "+s1.contains(33)); //false

		System.out.println("Index of 30 : "+s1.search(30));   //2
		System.out.println("Index of 33 : "+s1.search(33));   //-1
	}
}
