class Demo{
	public static void main(String args[]){
		Box b1=new Box(12,5,3); //"Box(int,int,int)"-->Calling Constructor
		System.out.println("Length : "+b1.length); //12
		System.out.println("Width  : "+b1.width);  //5
		System.out.println("Height : "+b1.height); //3
		b1.printVolume(); //180
	}
}



