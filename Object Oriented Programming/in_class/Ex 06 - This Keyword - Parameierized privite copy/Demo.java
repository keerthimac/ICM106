class Box{
	private int length;
	private int width;
	private int height;
	
	public Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public Box(int length){
		this.length=length;
		this.width=length;
		this.height=length;
	}
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box b1 : "+volume); 
	}
	public void setSize(Box b){
		this.length=b.length;
		this.width=b.length;
		this.height=b.length;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box(12,5,3);
		Box b2=new Box(10);
		b1.printVolume(); //180
		b2.printVolume(); //1000
		System.out.println(b1==b2);//false
		System.out.println(); 

		//b1.length=b2.length;
		//b1.width=b2.width;
		//b1.height=b2.height;
		b1.setSize(b2);
		
		b1.printVolume(); //1000
		b2.printVolume(); //1000
		System.out.println(b1==b2); //false
	}
}

