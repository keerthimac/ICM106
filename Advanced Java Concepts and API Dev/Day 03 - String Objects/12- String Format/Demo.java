import java.util.*;
class Demo{
	public static void main(String args[]){
		String fs;
		fs=String.format("Niroth");
		System.out.println(fs);
		
		fs=String.format("",100,1.5,'A',"Hello",true);
		System.out.println(fs);
		
		fs=String.format("%d%f%c%s%b",100,1.5,'A',"Hello",true);
		System.out.println(fs);
	}
}
//Conversion char
//%d --Decimal
//%f --Floating point
//%c --Characters
//%s --String
//%b --Boolean

