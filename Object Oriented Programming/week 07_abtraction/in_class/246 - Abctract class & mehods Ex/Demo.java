abstract class Vehicle{
	abstract public void park();
	abstract public void stop();
	public void start(){
		
	}
}
class Car extends Vehicle{}
class Bus extends Vehicle{
	public void stop(){
		//
	}
}
class MB extends Vehicle{
	public void park(){
		//
	}
	public void stop(){
		
	}
}
abstract class Van extends Vehicle{
	
}
