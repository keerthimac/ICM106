class Demo{
	public static void main(String args[]){
		Box b1; // Create a Refrance Variable "Box"
		b1=new Box(); //Create an Object "Box"
		b1.length=12;
		b1.width=5;
		b1.height=3;
		
		System.out.println("Length : "+b1.length); //12
		System.out.println("Width  : "+b1.width);  //5
		System.out.println("Height : "+b1.height); //3
	}
}
