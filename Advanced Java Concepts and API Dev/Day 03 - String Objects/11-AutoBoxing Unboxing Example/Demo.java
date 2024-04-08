import java.util.*;
class Demo{
	public static void main(String args[]){
		ArrayList <Integer>integerList=new ArrayList<>();
		integerList.add(100); //autoboxing
		integerList.add(200);
		integerList.add(300);
		integerList.add(400);
		
		System.out.println(integerList); //[100, 200, 300, 400]
	}
}
