class Queue{
	private int nextIndex;
	private int[] dataArray;
	Queue(int size){
		nextIndex=0;
		dataArray=new int[size];
	}
	public int size(){
		return nextIndex;
	}
	public void enQueue(int data){
		dataArray[nextIndex++]=data;
	}
	public void deQueue(){
		if(!isEmpty()){
			for (int i = 0; i < nextIndex-1; i++){
				dataArray[i]=dataArray[i+1];
			}
			nextIndex--;			
		}
	}
	public void printQueue(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(isEmpty() ? "empty]":"\b\b]");
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public void clear(){
		nextIndex =0;
	}
	public boolean isFull(){
		return nextIndex>=dataArray.length;
	}
}




class Demo{
	public static void main(String args[]){
		Queue q1=new Queue(100);
		System.out.println("Size of the queue : "+q1.size()); //0
		q1.printQueue(); //[empty];
		
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.printQueue(); //[10,20,30,40,50];
		System.out.println("Size of the queue : "+q1.size()); //5
		
		q1.deQueue();
		q1.printQueue(); //[20,30,40,50];
		System.out.println("Size of the queue : "+q1.size()); //4
		
		q1.clear();
		q1.printQueue(); //[empty];
		System.out.println("Size of the queue : "+q1.size()); //0
	}
}

 
