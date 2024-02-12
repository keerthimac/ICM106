import java.util.*;
class List{
	private Node first;
	
	public void add(int index, int data){
		//
		//
		//
		//
	}	
	public void add(int data){
		Node n1=new Node(data);
		if(isEmpty()){
			first=n1;
		}else{
			Node lastNode=first;
			while(lastNode.next!=null){
				lastNode=lastNode.next; 
			}
			lastNode.next=n1; 
		}
	}
	public void remove(){ //remove the first element
		if(first!=null){
			first=first.next;
		}
	}
	public int search(int data){
		Node temp=first;
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
	public boolean contains(int data){
		return search(data)!=-1;
	}
	public int size(){
		int count=0;
		Node temp=first;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	private boolean isEmpty(){
		return first==null;
	}
	public void clear(){
		first=null;
	}
	public void printList(){
		Node temp=first;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(first==null ? "empty]":"\b\b]");
	}
	public int[] toArray(){
		int[] tempArray=new int[size()];
		int i=0;
		Node temp=first;
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
		List list1=new List();
		list1.add(10);		
		list1.add(20);		
		list1.add(30);		
		list1.add(40);		
		list1.add(50);		
		list1.printList(); //[10,20,30,40,50]
		
		list1.add(3,33);
		list1.printList(); //[10,20,30,33,40,50]
	}
}
