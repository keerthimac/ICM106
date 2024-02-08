class Registry{
	private int nextIndex;
	private int[] dataArray;
	
	Registry(int size){
		nextIndex=0;
		dataArray = new int[size];
	}
	public void add(int num){
		dataArray[nextIndex++]=num;
	}

	public void add(int index, int num){
		for (int i = nextIndex-1; i >= index; i--){
			dataArray[i+1]=dataArray[i];
		}
		dataArray[index]=num;
		nextIndex++;
	}

	public void add(int[] arr){
		for (int i = 0; i < arr.length; i++){
			add(arr[i]);
		}
			
	}

	public void add(int index, int[] arr){
		for (int i = arr.length-1; i >=0; i--){
			add(index, arr[i]);
		}
	}
	
	public void remove(){
		for (int i = 0; i<nextIndex; i++){
			dataArray[i]=dataArray[i+1];
		}
		nextIndex--;
	}

	public void remove(int index){
		for (int i = index; i<nextIndex; i++){
			dataArray[i]=dataArray[i+1];
		}
		nextIndex--;
	}

	public void remove(int startIndex, int endIndex){
		for (int i = endIndex-1; i >= startIndex; i--){
			remove(i);
		}
		
	}

	public void printRegistry(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(nextIndex<=0?"empty]":"\b\b]");
	}
	
}


class Demo{
	public static void main(String args[]){
		Registry reg=new Registry(100); //
		reg.add(10);
		reg.add(20);
		reg.add(30);
		reg.add(40);
		reg.printRegistry(); //[10,20,30,40]
		reg.remove(); //remove the first element
		reg.printRegistry(); //[20,30,40]
		reg.add(1,25);//add(int index, int data)
		reg.printRegistry(); //[20,25,30,40]
		reg.add(new int[]{100,200,300,400}); //add(int[] data)
		reg.printRegistry(); //[20,25,30,40,100,200,300,400]
		reg.remove(1); //remove(int index)
		reg.printRegistry(); //[20,30,40,100,200,300,400]
		reg.add(3,new int[]{1,2,3}); //add(int index, int[] data)
		reg.printRegistry(); //[20,30,40,1,2,3,100,200,300,400]
		reg.remove(3,6); //remove(int startIndex, int endIndex-1)
		reg.printRegistry(); //[20,30,40,100,200,300,400]
	}
}
