import java.util.*;
class Queue{
	private Node front;
		
	public void enQueue(int data){
		Node n1=new Node(data);
		if(isEmpty()){
			front = n1;
		}else{
			Node lastNode = front;
			while(lastNode.next!=null){
				lastNode = lastNode.next;	
			}
			lastNode.next=n1;    	
		}

	}
	public void deQueue(){
		if(front!=null){
			front=front.next;
		}
	}





	public int search(int data){
		Node temp=front;
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
		return isEmpty()? -1:front.data;
	}
	public int poll(){
		int frontElement=isEmpty()? -1:front.data;
		deQueue(); 
		return frontElement;
	}
	
	public boolean contains(int data){
		return search(data)!=-1;
	}
	public int size(){
		int count=0;
		Node temp=front;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	private boolean isEmpty(){
		return front==null;
	}
	public void clear(){
		front=null;
	}
	public void printQueue(){
		Node temp=front;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(front==null ? "empty]":"\b\b]");
	}
	public int[] toArray(){
		int[] tempArray=new int[size()];
		int i=0;
		Node temp=front;
		while(temp!=null){
			tempArray[i++]=temp.data;
			temp=temp.next;
		}
		return tempArray;
	}
	//------------Inner class---------------
	class Node{
		private int data;
		private Node next;
		Node(int data){
			this.data=data;
		}
	}
	
}
class Demo{
	public static void main(String args[]){
		Queue q1=new Queue();
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.printQueue(); //[10,20,30,40,50]
		
		q1.deQueue();
		q1.printQueue(); //[20,30,40,50]
	}
}
