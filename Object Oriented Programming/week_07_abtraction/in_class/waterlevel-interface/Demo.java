import java.util.*;
interface WaterLevelObserver{
	public void update(int waterLevel);
}
class Alarm implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Alarm : "+(waterLevel>=50 ? "ON":"OFF"));
	}
}
class Splitter implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Splitter : "+(waterLevel>=75 ? "ON":"OFF"));
	}
}
class Display  implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("WaterLevel : "+waterLevel);
	}
}
class SMSSender implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Sending SMS : "+waterLevel);
	}
}   
class ControlRoom{
	
	private ArrayList <WaterLevelObserver>observerList=new ArrayList<>();
	
	private int waterLevel;
	
	public void addWaterLevelObserver(WaterLevelObserver ob){
		observerList.add(ob);
	}
	
	public void removeWaterLevelObserver(WaterLevelObserver ob){
		observerList.remove(ob);
	}
	public void setWaterLevel(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
			notifyObjects();
		}
	}
	public void notifyObjects(){
		for(WaterLevelObserver ob : observerList){
			ob.update(waterLevel); //single interface
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

