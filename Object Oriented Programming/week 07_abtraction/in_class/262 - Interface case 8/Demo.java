interface Vehicle{
	public void start();
}

class Demo{
	public static void main(String args[]){
		Vehicle v1; //Legal
		v1=new Vehicle(); //Illegal
	}
}
