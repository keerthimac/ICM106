class Box{
	private int length;
	private int width;
	private int height;
	
	public Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box b1 : "+volume); 
	}
	public Box getCopy(){
		Box tem = new Box(length,width,height);
		return tem;
	}
	
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box(12,5,3);
		
		Box b2=b1.getCopy(); //?
		
		b1.printVolume(); //180
		b2.printVolume(); //180
		
		System.out.println(b1==b2); //false
	}
}
