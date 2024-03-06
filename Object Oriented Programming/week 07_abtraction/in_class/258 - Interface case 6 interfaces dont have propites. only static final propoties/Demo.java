interface Vehicle{
	int x=100; //implicitly public, static and final
	public void start();
}

class Demo{
	public static void main(String args[]){
		System.out.println(Vehicle.x); //Legal
		Vehicle.x=200; //Illegal
	}
}
