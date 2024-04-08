import java.util.*;
class Demo{
	public static void main(String args[]){
		String fs;

		fs=String.format("%4$s%3$c%1$d%5$b%2$f",100,1.5,'A',"Hello",true);
		System.out.println(fs);
	}
}
