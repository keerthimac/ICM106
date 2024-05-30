import java.util.*;
class Example{
	public static void main(String args[]){
		LinkedList<String> strList= new LinkedList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		strList.add("E");
		strList.add("F");	
		
		strList.addFirst("First");
		strList.addLast("Last");
		System.out.println(strList);//Stack
		
		strList.removeFirst();
		System.out.println(strList);
		strList.removeLast();
		System.out.println(strList);
		
	}
}


