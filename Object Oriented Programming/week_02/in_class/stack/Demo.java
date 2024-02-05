class Stack{
	private int[] dataArray;
	
	Stack(){
		dataArray=new int[0];
	}
	private boolean isEmpty(){
		return dataArray.length<=0;
	}
	private void extendsArray(){
		int[] tempDataArray=new int[dataArray.length+1];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i+1]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public void push(int data){
		extendsArray();
		dataArray[0]=data;
	}
	public void printData(){
		System.out.print("[");
		for(int i=0; i<dataArray.length; i++){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}
	public void pop(){
		if(!isEmpty()){
			int[] tempDataArray=new int[dataArray.length-1];
			for (int i = 0; i < tempDataArray.length; i++){
				tempDataArray[i]=dataArray[i+1];
			}
			dataArray=tempDataArray;
		}
	}
	public int size(){
		return dataArray.length;
	}
	public void clear(){
		dataArray=new int[0];
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
		s1.printData(); //[50,40,30,20,10]
		System.out.println("Size of the stack : "+s1.size()); //5
		
		s1.pop();
		s1.printData(); //[40,30,20,10]
		System.out.println("Size of the stack : "+s1.size()); //4
		
		s1.clear();
		s1.printData(); //[empty]
		System.out.println("Size of the stack : "+s1.size()); //0
	}
}
