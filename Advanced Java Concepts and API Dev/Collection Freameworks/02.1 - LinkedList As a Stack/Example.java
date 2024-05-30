import java.util.*;
class Example{
	public static void main(String args[]){
		LinkedList<String> strList= new LinkedList<>();
		strList.push("A");
		strList.push("B");
		strList.push("C");
		strList.push("D");
		strList.push("E");
		strList.push("F");	
		System.out.println(strList);//Stack
		
		strList.pop();
		System.out.println(strList);
		
	}
}


