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
	public void print(){ //Overriding [Same name, same signature (Parameter list)
		System.out.println("print() of B");
	}		
}

class Demo{
	public static void main(String args[]){
		B b1=new B();
		b1.print(); //print() of B
	}
}
