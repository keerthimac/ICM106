import java.util.*;
class Demo{
	public static void main(String args[]){
		String name="Niroth";
		//System.out.println(name.reverse()); //Illegal
		
		StringBuffer sb=new StringBuffer(name);
		sb.reverse();
		System.out.println(sb); //htoriN
		
		name=sb.toString();
		System.out.println(name); //htoriN
	}
}




