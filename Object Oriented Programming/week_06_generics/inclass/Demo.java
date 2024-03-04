import java.util.*;

class Alarm{
	public void operateAlarm(int waterLevel){
		System.out.println(waterLevel>=50?"ON":"OFF");
	}
}

class Display{
	public void display(int waterLevel){
		System.out.println("Water Level : "+waterLevel);
	}	
}

class SMSSender{
	public void sendSMS(int waterLevel){
		System.out.println("Sending SMS : "+waterLevel);
	}	
}

class ControlRoom{
	private Alarm alarm;
	private Display display;
	private SMSSender smsSender;
	private int waterLevel;
	
	
	public void addAlarm(Alarm alarm){
		this.alarm=alarm;
	}
	
	public void addDispaly(Display display){
		this.display=display;
	}
	
	public void addSMSSender(SMSSender smsSender){
		this.smsSender=smsSender;
	}
	
	public void setWaterLevel(int waterLevel){
		if (this.waterLevel!=waterLevel){
			this.waterLevel = waterLevel;
			notifyObjects();
		}
	}
	
	public void notifyObjects(){
		alarm.operateAlarm(waterLevel);
		display.display(waterLevel);
		smsSender.sendSMS(waterLevel);
	}
		
}

class Demo{
	public static void main(String args[]){
		ControlRoom controlRoom = new ControlRoom();
		controlRoom.addAlarm(new Alarm());
		controlRoom.addDispaly(new Display());
		controlRoom.addSMSSender(new SMSSender());
		
		Random r = new Random();
		while (true){
			int waterLevel = r.nextInt(101);
			controlRoom.setWaterLevel(waterLevel);
			try{Thread.sleep(1000);}catch(Exception ex){};
		}
	}
}
 
