import java.util.*;
abstract class WaterLevelObserver{
	abstract public void update(int waterLevel);
}
class Alarm extends WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Alarm : "+(waterLevel>=50 ? "ON":"OFF"));
	}
}
class Splitter extends WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Splitter : "+(waterLevel>=75 ? "ON":"OFF"));
	}
}
class Display  extends WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("WaterLevel : "+waterLevel);
	}
}
class SMSSender extends WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Sending SMS : "+waterLevel);
	}
}
class ControlRoom{
	
	private WaterLevelObserver[] observerArray=new WaterLevelObserver[100];
	private int nextIndex;
	
	private int waterLevel;
	
	public void addWaterLevelObserver(WaterLevelObserver ob){
		observerArray[nextIndex++]=ob;
	}
	//removeWaterLevelObserver
	
	public void setWaterLevel(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
			notifyObjects();
		}
	}
	public void notifyObjects(){
		for(int i=0; i<nextIndex; i++){
			observerArray[i].update(waterLevel);
		} 
	}
}
class Demo{
	public static void main(String args[]){
		ControlRoom controlRoom= new ControlRoom();	
		controlRoom.addWaterLevelObserver(new Alarm());
		controlRoom.addWaterLevelObserver(new SMSSender());
		controlRoom.addWaterLevelObserver(new Display());
		controlRoom.addWaterLevelObserver(new Splitter());
			
		Random r=new Random();
		while(true){
			int waterLevel=r.nextInt(101);//0 to 100
			controlRoom.setWaterLevel(waterLevel);
			try{Thread.sleep(1000);}catch(Exception ex){}
		}
	}
}

 
