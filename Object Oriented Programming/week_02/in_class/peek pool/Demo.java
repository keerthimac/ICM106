import java.util.*;
class Queue{
	private int nextIndex;
	private int[] dataArray;
	Queue(int size){
		nextIndex=0;
		dataArray=new int[size];
	}
	private void extendsArray(){
		int[] tempDataArray=new int[dataArray.length+(int)(dataArray.length*0.5)];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	public void enQueue(int data){
		if(isFull()){
			extendsArray();
		}	
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
	public void clear(){
		nextIndex=0;
	}
	public int size(){
		return nextIndex;
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
	public boolean contains(int data){
		for (int i = 0; i < nextIndex; i++)	{
			if(dataArray[i]==data){
				return true;
			}
		}
		return false;	
	}
	public int peek(){
		if(isEmpty()){
			return -1; //throws an Exception
		}
		return dataArray[0];
	}
	public int poll(){
		if(isEmpty()){
			return -1; //throws an Exception
		}else{
			int frontData=dataArray[0];
			deQueue();
			return frontData;
		}
	}
	public int[] toArray(){
		int[] tempArr = new int[nextIndex];
		for (int i = 0; i < tempArr.length ; i++){
			tempArr[i]=dataArray[i];
		}
		return tempArr;
		
	}
}
class Demo{
	public static void main(String args[]){
		Queue q1=new Queue(100);
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.printQueue(); //[10,20,30,40,50];
		System.out.println();
		int[] ar=q1.toArray();
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50];
	}
}
