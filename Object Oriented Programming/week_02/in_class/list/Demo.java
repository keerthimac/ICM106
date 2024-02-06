import java.util.*;
class List{
	private int nextIndex;
	private int[] dataArray;
	List(int size){
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
	public void add(int data){
		if(isFull()){
			extendsArray();
		}	
		dataArray[nextIndex++]=data;
	}

	public void add(int index, int data){
		if(index>=0 && (index<=nextIndex)){
			if(isFull()){
				extendsArray();
			}
			for (int i = nextIndex; i>=index ; i--){
				dataArray[i] = dataArray[i-1];
			}
			dataArray[index]=data;
			nextIndex++;	
		}
	}

	public void remove(int index){
		if(index>=0 && (index<=nextIndex)){
			for (int i = index; i<nextIndex-1 ; i++){
				dataArray[i] = dataArray[i+1];
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
	public void printList(){
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
	public int[] toArray(){
		int[] temp=new int[nextIndex];
		for (int i = 0; i < temp.length; i++){
			temp[i]=dataArray[i];
		}
		return temp;
	}
	
	public int get(int index){
		if(index>=0 && (index<nextIndex)){
			return dataArray[index];
		}else{
			return -1;
		}
		
	}
}
class Demo{
	public static void main(String args[]){
		List list1=new List(100);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.printList(); //[10,20,30,40,50]
		
		System.out.println("Data of index 2 : "+list1.get(2));//30;
		System.out.println("Data of index -1 : "+list1.get(-1));//-1;
		System.out.println("Data of index 5 : "+list1.get(5));//-1;
		
		list1.add(2,33);
		list1.printList(); //[10,20,33,30,40,50]
		
		list1.add(-1,11); //out of bounds
		list1.printList(); //[10,20,33,30,40,50]
		
		list1.add(6,55); 
		list1.printList(); //[10,20,33,30,40,50,55]
		
		list1.add(8,77); //out of bounds
		list1.printList(); //[10,20,33,30,40,50,55]
		
		list1.remove(2);
		list1.printList(); //[10,20,40,50]
	}
}
