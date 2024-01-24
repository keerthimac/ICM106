class A{
	int a;
	int b=100;
	A(int i,int j){
		a=i;
		b=j;
	}
	A(int i){
		a=i;
	}
	A(){
		
	}
}
class Demo{
	public static void main(String args[]){
		A a1=new A();
		A a2=new A(10);
		A a3=new A(10,20);
		
		System.out.println("a1 : "+a1.a+" "+a1.b);
		System.out.println("a2 : "+a2.a+" "+a2.b);
		System.out.println("a3 : "+a3.a+" "+a3.b);
	}
}





