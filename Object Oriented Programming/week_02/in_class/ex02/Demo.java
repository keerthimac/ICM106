class Stack{
	private int nextIndex=0;
	private int[] dataArray;
	Stack(){
		dataArray=new int[100];
	}
	public void push(int data){
		dataArray[nextIndex++]=data;
	}
	public void printData(){
		System.out.print("[");
		for(int i=nextIndex-1; i>=0; i--){
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
		Stack s1=new Stack(); 
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.printData(); //[40,30,20,10]
		
		s1.pop();
		s1.printData(); //[30,20,10]
	}
}
