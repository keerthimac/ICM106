class A{
	int a;
	public void print(){
		System.out.println("print() of A");
	}
	public void callPrint(){
		print();
	}
}
class B extends A{
	int b;
	public void print(){ 
		System.out.println("print() of B");
	}		
}
class Demo{
	public static void main(String args[]){
		A a1=new A();
		A a2=new B();
		B b1=new B();
		
		a1.print(); // print A
		a1.callPrint(); // print A
		
		a2.print(); // print B
		a2.callPrint(); // print B
		
		b1.print(); // print B
		b1.callPrint(); //print B
	}
}
