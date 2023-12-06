

class Example {
	public static void main(String args[]) {
		int x=20,y=60;
		boolean bool;
		System.out.println(x=10); //Line 1
		System.out.println(bool=true); //Line 2
		//System.out.println(x=10>0); //Line 3
		System.out.println((x=10)>0); //Line 4
		System.out.println(bool=(x=10)>0); //Line 5
		System.out.println(bool=x+y>100); //Line 6
	}
}
