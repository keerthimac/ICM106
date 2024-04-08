import java.util.*;
class Demo{
	public static void main(String args[]){
		int x=100;
		Integer iob=x; //Legal, autoboxing
		System.out.println(x+" "+iob);//100 100
		
		int y;
		y=iob;//Legal, auto unboxing //
		System.out.println(y+" "+iob);//100 100
	}
}





