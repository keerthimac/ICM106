class Demo{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume(); 
		b1.printArea();
		
		b1.setLength(12); //b1.length=120;
		b1.setWidth(5); //b1.width=50;
		b1.setHeight(3); //b1.height=30;
		
		System.out.println("Length : "+b1.getLength());  //12
		System.out.println("Width  : "+b1.getWidth()); //5
		System.out.println("Height : "+b1.getHeight()); //3
	}
}



