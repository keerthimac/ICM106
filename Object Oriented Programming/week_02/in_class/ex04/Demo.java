import java.util.*;

class Stack{
	private int[] dataArray;
	private int nextIndex=0;
	Stack(int n){
		dataArray=new int[n];
	}
	public void push(int data){
		if(nextIndex>=dataArray.length){
			System.out.println("Stack is full");
		}
		dataArray[nextIndex++]=data;
	}
	public void printData(){
		System.out.print("[");
		for (int i = nextIndex-1; i >= 0; i--){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(nextIndex==0? "empty]":"\b\b]");
	}
	
	public void pop(){
		nextIndex--;
	}
}

class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(5); 
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40); //Line 17
		s1.push(50);
		s1.printData();
		
		s1.pop();
		s1.printData(); //[40,30,20,10]
		
		s1.pop();
		s1.printData(); //[30,20,10]
	}
}

