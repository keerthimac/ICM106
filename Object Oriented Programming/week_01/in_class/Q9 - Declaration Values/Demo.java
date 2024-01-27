class Demo{
	public static void main(String args[]){
		Box b1=new Box(12,5,3); //"Box(int,int,int)"
		System.out.println("Length : "+b1.length); //12
		System.out.println("Width  : "+b1.width);  //5
		System.out.println("Height : "+b1.height); //3
		System.out.println();
		
		Box b2=new Box(10);
		System.out.println("Length : "+b2.length); //10
		System.out.println("Width  : "+b2.width);  //10
		System.out.println("Height : "+b2.height); //10
		System.out.println();
		
		Box b3=new Box();
		System.out.println("Length : "+b3.length); //1
		System.out.println("Width  : "+b3.width);  //1
		System.out.println("Height : "+b3.height); //1
		System.out.println();
		
		
	}
}




