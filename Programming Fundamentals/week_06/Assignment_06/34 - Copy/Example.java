import java.util.*;

class Example {
	public static int fact(int num){
		int f = 1;
		while(num>0){
			f*=num--;
		}
		return f;
	}
	public static int numberOfGroups(int n, int r){
		return fact(n)/fact(n-r)*fact(r);
	}
	
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of children : ");
		int children = input.nextInt();
		System.out.print("Number of group members : ");
		int group = input.nextInt();
		int groups = numberOfGroups(children,group);
		System.out.print("The number of groups = "+groups);
		
	}
}

