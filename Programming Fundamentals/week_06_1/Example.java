import java.util.*;

class Example{
	public static void myMethod(){
		Random r=new Random();
		int num=r.nextInt(101); //0 to 100
		if(num!=100){
			myMethod();
		}
		System.out.println(num);
	}
	public static void main(String args[]){
		myMethod();
	}
}


