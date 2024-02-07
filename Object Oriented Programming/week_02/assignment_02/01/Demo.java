class Stack{
	private int nextIndex;
	private int[] dataArray;
	private int loadFactor;
	Stack(int size){
		dataArray=new int[size];
		nextIndex=0;
		loadFactor=2;
	}
	private boolean isEmpty(){
		return nextIndex<=0;
	}
	private boolean isFull(){
		return nextIndex>=capacity();
	}
	private void extendArray(){
		int[] tempArr = new int[capacity()*loadFactor];
		for (int i = 0; i < dataArray.length; i++){
			tempArr[i]= dataArray[i];
		}
		dataArray=tempArr;
	}
	public void push(int data){
		if (isFull()){
			extendArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void printStack(){
		System.out.print("[");
		for(int i=nextIndex-1;i>=0;i--){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(isEmpty() ? "empty]": "\b\b]");
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
	public int capacity(){
		return dataArray.length;
	}
	public int[] toArray(){
		int[] tempArr = new int[nextIndex];
		for (int i = 0; i<nextIndex; i++){
			tempArr[i] = dataArray[(nextIndex-1)-i];
		}
		return tempArr;
	}
	
}

class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(10); //Initial capacity of the stack is 10
		s1.printStack(); //[empty]
		System.out.println("Size of the stack is : "+s1.size()); //0
		System.out.println("Capacity of the stack is : "+s1.capacity()); //10
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.printStack(); //[50, 40, 30, 20, 10]
		System.out.println("Size of the stack is : "+s1.size()); //5
		System.out.println("Capacity of the stack is : "+s1.capacity()); //10
		s1.push(60);
		s1.push(70);
		s1.push(80);
		s1.push(90);
		s1.push(100);
		s1.printStack(); //[100,90,80,70,60,50,40, 30, 20, 10]
		System.out.println("Size of the stack is : "+s1.size()); //10
		System.out.println("Capacity of the stack is : "+s1.capacity()); //10
		s1.push(111);
		s1.printStack(); //[111,100,90,80,70,60,50,40, 30, 20, 10]
		System.out.println("Size of the stack is : "+s1.size()); //11
		System.out.println("Capacity of the stack is : "+s1.capacity()); //20
		s1.push(222);
		s1.push(333);
		s1.push(444);
		s1.printStack(); //[444,333,222,111,100,90,80,70,60,50,40, 30,20,10]
		System.out.println("Size of the stack is : "+s1.size()); //14
		System.out.println("Capacity of the stack is : "+s1.capacity()); //20

		int[] ar=s1.toArray();
		for(int a : ar){
		System.out.print(a+" "); //444 333 222 111 100 90 80 70 60 50 40 30 20 10
		}

	}
}
