

class Example {
	public static void main(String args[]) {
		boolean b=true;
		
		System.out.println(b);
		System.out.println(b=true);
		System.out.println(b==true);
		System.out.println(b!=true);
		System.out.println(b=true==true);
		System.out.println((b=true)==false);
		System.out.println(b=(true!=false));
	}
}
