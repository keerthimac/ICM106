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
class D extends B{
	int d;
	static{
		System.out.println("Static block D");
	}
}
class Demo{
	public static void main(String args[]){
		new D();
	}
}

