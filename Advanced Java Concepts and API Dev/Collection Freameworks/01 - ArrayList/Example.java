import java.util.*;
class Example{
	public static void main(String args[]){
		ArrayList<String> strList= new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		strList.add("E");
		strList.add("F");	
		System.out.println(strList);//ToString Overrided and Insertion Order
		
		strList.add("A");
		strList.add("B");
		System.out.println(strList);//Duplicate Allowed
		
		for(int i=0; i<strList.size(); i++){
			System.out.print(strList.get(i)+" ");
		}
		
		strList.add(5,"Niroth");
		System.out.println(strList); //[A, B, C, D, ,E, Niroth, F, A, B]
	}
}

//In List Class 
// 01. In ArrayList - Itaration is faster
// 02. In LinkedList - Insertion is Faster

