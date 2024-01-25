class MyClass{
	int x;
	static int y;
}
class Demo{
	public static void main(String args[]){
		MyClass c1=new MyClass();
		MyClass c2=new MyClass();
		MyClass c3=new MyClass();
		
		c1.x=1;
		c1.y=2;
		
		c2.x=10;
		c2.y=20;
		
		c3.x=100;
		c3.y=200;
		
		System.out.println("c1 : "+c1.x+" "+c1.y);//1 200
		System.out.println("c2 : "+c2.x+" "+c2.y);//10 200
		System.out.println("c3 : "+c3.x+" "+c3.y);//100 200
	}
}







