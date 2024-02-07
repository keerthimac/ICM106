class PriorityQueue{
	private int nextIndex;
	private int[] dataArray;
	PriorityQueue(int size){
		nextIndex = 0;
		dataArray = new int[size];
	}
	private int findMaxIndex(){
		int max=dataArray[0];
		int index = 0;
		for (int i = 0; i < nextIndex; i++){
			if(dataArray[i]>max){
				max=dataArray[i];
				index = i;
			}
		}
		return index;
	}

	private void swapNum(int a, int b){
		int temp = dataArray[a];
		dataArray[a]=dataArray[b];
		dataArray[b]=temp;
	}
	
	public void enQueue(int num){
		dataArray[nextIndex++]=num;
		int maxIndex=findMaxIndex();
		swapNum(0,maxIndex);
	}
	public void deQueue(){
		for (int i = 0; i < nextIndex; i++){
			dataArray[i]=dataArray[i+1];
		}
		int maxIndex=findMaxIndex();
		swapNum(0,maxIndex);
		nextIndex--;
	}
	public void printQueue(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(nextIndex==0?"empty]":"\b\b]");
	}

}


class Demo{
	public static void main(String args[]){
		PriorityQueue pq=new PriorityQueue(10); //PriorityQueue(int initialSize)
		pq.enQueue(12);
		pq.enQueue(90);
		pq.enQueue(16);
		pq.enQueue(45);
		pq.enQueue(96);
		pq.enQueue(23);
		pq.printQueue(); //[96, 16, 12, 90, 45, 23]
		pq.deQueue();
		pq.printQueue(); //[90, 16, 23, 45, 12]
		pq.deQueue();
		pq.printQueue(); //[45, 16, 23, 12]
	}
}
