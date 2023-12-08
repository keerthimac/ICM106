import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Extention: ");	
		String url = input.next();
		
		if(url.equals(".com")){
			System.out.println("commercial website");
		}else if(url.equals(".org")){
			System.out.println("organization website");
		}else if(url.equals(".lk")){
			System.out.println("Sri Lankan website");
		}
	}
}

