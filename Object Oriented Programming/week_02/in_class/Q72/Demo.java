class Stack{
	private int nextIndex=0;
	private int[] dataArray;
	private float loadFact;
	Stack(int n, float loadFact){
		dataArray=new int[n];
		this.loadFact =loadFact;
	}
	private boolean isEmpty(){
		return nextIndex<=0;		
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	} 
	private void extendsArray(){
		int size = dataArray.length + (int)(loadFact*dataArray.length);
		int[] tempDataArray=new int[size];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public void push(int data){
		if(isFull()){
			extendsArray();
		}
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
		if(isEmpty()){
			System.out.println("Stack is empty...");
		}else{
			nextIndex--;
		}
	}
	public int size(){
		return nextIndex;
	}
	public void clear(){
		nextIndex=0;
	}
}

class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(5,0.5f);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40); 
		s1.push(50);
		s1.printData(); //[50,40,30,20,10]
		System.out.println("Size of the stack : "+s1.size()); //5
		
		s1.push(60);
		s1.printData(); //[60,50,40,30,20,10]
		System.out.println("Size of the stack : "+s1.size()); //6
		
		s1.push(70);
		s1.push(80);
		s1.push(90);
		s1.push(100);
		s1.printData(); //[100,90,80,70,60,50,40,30,20,10]
		System.out.println("Size of the stack : "+s1.size()); //10
	}
}
