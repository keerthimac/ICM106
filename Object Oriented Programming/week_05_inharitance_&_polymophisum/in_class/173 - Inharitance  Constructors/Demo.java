class A{
	int a;
	public void mA(){
		System.out.println("mA : "+a);
	}
	A(){
		System.out.println("A()");
	}
	A(int i){
		System.out.println("A(int)");
	}
	A(int i, int j){
		System.out.println("A(int,int)");
	}
}
class B extends A{
	int b;
	B(){
		System.out.println("B()");
	}
	B(int i){
		System.out.println("B(int)");
	}
	B(int i, int j){
		System.out.println("B(int,int)");
	}	
	public void mB(){
		System.out.println("mB : "+b);
	}	
}




class Demo{
	public static void main(String args[]){
		new B();
		System.out.println("---------------");
		new B(100);
		System.out.println("---------------");
		new B(100,200);
	}
}


