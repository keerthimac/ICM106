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
		A a1;
		a1=new A();
		a1.print(); //
		
		a1=new B();
		a1.print();
		
		a1=new C();
		a1.print();
	}
}

 
