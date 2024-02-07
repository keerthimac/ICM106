class Registry{
	private nextIndex;
	private int[] dataArray;
	
	Registry(int size){
		nextIndex=0;
		dataArray = new int[size];
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
