class Stack{
	private int nextIndex=0;
	private int[] dataArray;
	Stack(){
		dataArray=new int[100];
	}
	public void push(int data){
		dataArray[i++]=data;
	}
}

class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(); 
		s1.push(10);
	}
}
