import java.util.*;

class WaterLevelObserver{
	public void update(int waterLevel){
	}
}

class Splitter extends WaterLevelObserver{
	public void update (int waterLevel){
		System.out.println("Splitter :"+(waterLevel>=75?"ON":"OFF"));
	}
}

class Alarm extends WaterLevelObserver{
	public void update (int waterLevel){
		System.out.println("Alarm :"+(waterLevel>=50?"ON":"OFF"));
	}
}

class Display extends WaterLevelObserver{
	public void update (int waterLevel){
		System.out.println("Water Level : "+waterLevel);
	}	
}

class SMSSender extends WaterLevelObserver{
	public void update (int waterLevel){
		System.out.println("Sending SMS : "+waterLevel);
	}	
}

class ControlRoom{
	private int waterLevel;
	private WaterLevelObserver[] observerArray = new  WaterLevelObserver[100];
	private int nextIndex;
	
	public void addWaterLevelObserver(WaterLevelObserver ob){
		observerArray[nextIndex++]= ob;
	}
	
	public void setWaterLevel(int waterLevel){
		if (this.waterLevel!=waterLevel){
			this.waterLevel = waterLevel;
			notifyObjects();
		}
	}
	
	public void notifyObjects(){
		for (int i = 0; i < nextIndex; i++){
			observerArray[i].update(waterLevel);
		}

	}
		
}

class Demo{
	public static void main(String args[]){
		ControlRoom controlRoom = new ControlRoom();
		controlRoom.addWaterLevelObserver(new Alarm());
		controlRoom.addWaterLevelObserver(new Display());
		controlRoom.addWaterLevelObserver(new SMSSender());		
		controlRoom.addWaterLevelObserver(new Splitter());		
		
		Random r = new Random();
		while (true){
			int waterLevel = r.nextInt(101);
			controlRoom.setWaterLevel(waterLevel);
			try{Thread.sleep(1000);}catch(Exception ex){};
		}
	}
}
 
