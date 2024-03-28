import java.util.*;


class WaterLevelObserver{
	public void update(int waterLevel){
	}
}

class Alarm extends WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println(waterLevel>=50 ? "ON":"OFF");
	}
}

class Display extends WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("WaterLevel :"+waterLevel);
	}
}
class SMSSender extends WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Sending SMS :"+waterLevel);
	}
}

class ControlRoom{
	private Alarm alarm;
	private Display display;
	private SMSSender sMSSender;
	private int waterLevel;
	private WaterLevelObserver [] objArr = new WaterLevelObserver[50]; 
	int nextIndex;
	
	public void setWaterLevel(int waterLevel){
		if(this.waterLevel != waterLevel){
			this.waterLevel = waterLevel;
			notifyObjects(waterLevel);
		}
	}
	
	public void addWaterLevelObserver(WaterLevelObserver obj){
		objArr[nextIndex++]=obj;
	}
	
	public void notifyObjects(int waterLevel){
		for (int i = 0; i < nextIndex; i++){
			objArr[i].update(waterLevel);
		}
		
	}
}


class Demo{
	public static void main(String args[]){
		ControlRoom controlRoom = new ControlRoom();
		controlRoom.addWaterLevelObserver(new Alarm());
		controlRoom.addWaterLevelObserver(new Display());
		controlRoom.addWaterLevelObserver(new SMSSender());
			
		
		Random r = new Random();
		while (true){
			int waterLevel = r.nextInt(101);
			controlRoom.setWaterLevel(waterLevel);
			try{Thread.sleep(1000);}catch(Exception ex){};
		}
	}
}
