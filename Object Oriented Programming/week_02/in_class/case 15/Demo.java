class Stack{
	private int nextIndex=0;
	private int[] dataArray;
	Stack(int n){
		dataArray=new int[n];
	}
	public void push(int data){
		if(nextIndex>=dataArray.length){
			System.out.println("Stack is full....");
		}else{
			dataArray[nextIndex++]=data;
		}
	}

	public void printData(){
		System.out.print("[");
		for(int i=nextIndex-1; i>=0; i--){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(nextIndex==0? "empty]":"\b\b]");
	}
	public void pop(){
		if(nextIndex<=0){
			System.out.println("Stack is Empty....");
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
		Stack s1=new Stack(10);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40); 
		s1.push(50);
		s1.push(60);
		s1.push(70);
		s1.push(80);
		s1.push(90);
		s1.push(100);
		s1.printData(); //[100,90,80,70,60,50,40,30,20,10]
		System.out.println("Size of the stack : "+s1.size()); //10
		
		s1.clear();
		s1.printData(); //[empty]
		System.out.println("Size of the stack : "+s1.size()); //0
		
		s1.pop(); //Stack is empty....
	}
}


