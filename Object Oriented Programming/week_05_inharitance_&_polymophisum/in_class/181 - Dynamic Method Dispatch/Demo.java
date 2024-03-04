class A{
	int a;
	public void mA(){
		System.out.println("mA : "+a);
	}
	public void print(){
		System.out.println("print() of A");
	}
}
class B extends A{
	int b;
	public void mB(){
		System.out.println("mB : "+b);
	}
	public void print(){ 
		System.out.println("print() of B");
	}		
}

class Demo{
	public static void main(String args[]){
		A a1=new B();
		a1.print();
	}
}
 
