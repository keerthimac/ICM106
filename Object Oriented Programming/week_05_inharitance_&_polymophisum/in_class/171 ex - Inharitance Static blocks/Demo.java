class A{
	int a;
	static{
		System.out.println("Static block A");
	}
}
class B extends A{
	int b;
	static{
		System.out.println("Static block B");
	}
}
class C extends B{
	int c;
	static{
		System.out.println("Static block C");
	}
}
class Demo{
	public static void main(String args[]){
		new C();
	}
}
