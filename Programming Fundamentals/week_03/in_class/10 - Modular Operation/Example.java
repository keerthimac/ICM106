class Example{
	public static  void main(String []args){
		int x=10 % 2 ;
		System.out.println("10 % 2 : "+x); //0

		x=10 % 3 ;
		System.out.println("10 % 3 : "+x); //1

		x=10 % 4 ;
		System.out.println("10 % 4 : "+x); //2

		x=10 % 6 ;
		System.out.println("10 % 6 : "+x); //4

		x=10 % 12 ;
		System.out.println("10 % 12: "+x); //10
	}
}
