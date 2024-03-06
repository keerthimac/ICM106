interface Vehicle{
	public void start();
}
class Car implements Vehicle{
	public void start(){
		System.out.println("Starting..");
	}
} 
 
class Demo{
	public static void main(String args[]){
		Vehicle v1=new Car();
	}
}

//Car IS-A Vehicle
//Car-->Subclass
//Vehicle-->Super class

