import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of classes: ");
		int classes = input.nextInt();
		System.out.print("Enter classes attended: ");
		int attendance = input.nextInt();
		
        //calculate presentage
        double present = attendance*100/classes;

		if(present<70){
			System.out.print("have you got medical cause? (yes for 'Y' and no for 'N'): ");
			String answer = input.next();
			if(answer.equals("Y")){
				System.out.println("You can sit for Exam");
			}else if(answer.equals("N")){
				System.out.println("You can not sit for Exam");
			}
		}else if(present>=70){
			System.out.println("You can sit for Exam");
		}
	}
}
