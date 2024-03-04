class A{
	int a;
	public void print(){
		System.out.println("print() of A");
	}
}
class B extends A{
	int b;
	public void print(){ 
		System.out.println("print() of B");
	}		
}
class C extends B{
	int c;
	public void print(){ 
		System.out.println("print() of C");
	}		
}

class Demo{
	public static void main(String args[]){
		A a1=new A();
		A a2=new B();
		A a3=new C();
		
		B b1=new B();
		B b2=new C();
		
		C c1=new C();
		
		a1.print(); // print A
		a2.print(); // Print B
		a3.print(); // Print C
		
		b1.print(); // print B
		b2.print(); // print C
		
		c1.print(); // print C
	}
}


 
