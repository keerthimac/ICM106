import java.util.*;
class Demo{
	public static void main(String args[]){
		StringBuffer name=new StringBuffer("Niroth");
		System.out.println(name); //Niroth
		
		name.append(" Lakmal");
		System.out.println(name); //Niroth Lakmal
		
		StringBuffer newName=name.append(" Lakmal");
		System.out.println(newName); //Niroth Lakmal
	}
}



