class PriorityQueue{
	private Node front;
	
	public void enQueue(int data){
		Node n1 = new Node(data);
		if(isEmpty()){
			front = n1;
		}else{
			Node lastNode = front;
			while(lastNode.next!=null){
				lastNode=lastNode.next;
			}
			lastNode.next = n1;
		}	
	}

	public void deQueue(){
		front = front.next;
	}

	public void printQueue(){
		Node temp = front;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println("\b\b]");
	}

	private boolean isEmpty(){
		return front==null;
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
		PriorityQueue pq=new PriorityQueue();
		pq.enQueue(12);
		pq.enQueue(90);
		pq.enQueue(16);
		pq.enQueue(45);
		pq.enQueue(96);
		pq.enQueue(23);
		pq.printQueue(); //[96, 16, 12, 90, 45, 23]
		pq.deQueue();
		pq.printQueue(); //[90, 16, 23, 45, 12]
		pq.deQueue();
		pq.printQueue(); //[45, 16, 23, 12]
	}
}
