import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Books: ");
		int bookQty= input.nextInt();
		
        //calculate total
        double total = bookQty*100;
        
        double discount=0;        
        if(total>=5000){
			discount = total*0.1;
		}
		
		System.out.println("SubTotal  : "+total);
		System.out.println("Discount  : "+discount);
		System.out.println("Discount  : "+(total-discount));	
	}
}
