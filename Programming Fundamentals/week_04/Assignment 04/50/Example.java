import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter angle a: ");	
		int a = input.nextInt();
		System.out.print("Enter angle a: ");	
		int b = input.nextInt();
		System.out.print("Enter angle a: ");	
		int c = input.nextInt();
		
		//Check angles more than 0
		if(a==0||b==0||c==0){
			System.out.println("triangle can not be formed");
		}else if((a+b+c)==180){
			System.out.println("triangle can be formed");
		}else{
			System.out.println("triangle can not be formed");
		}		
	}
}

