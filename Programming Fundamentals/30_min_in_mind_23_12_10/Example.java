import java.util.*;

class Example {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Telephone number: ");	
		int telNumber = input.nextInt();
		
		//Extract 1st 3 numbers
		
		int areaCode = telNumber/10000000;
		
		
		if(areaCode==11){
			System.out.println("Telephone Number Area is Colombo");	
		}else if(areaCode==21){
			System.out.println("Telephone Number Area is Jaffna");
		}else if(areaCode==23){
			System.out.println("Telephone Number Area is Mannar");	
		}else if(areaCode==24){
			System.out.println("Telephone Number Area is Vavuniya");	
		}else if(areaCode==25){
			System.out.println("Telephone Number Area is Anuradhapura");	
		}else if(areaCode==26){
			System.out.println("Telephone Number Area is Trincomalee");	
		}else if(areaCode==27){
			System.out.println("Telephone Number Area is Polonnaruwa");
		}else if(areaCode==31){
			System.out.println("Telephone Number Area is Negombo");
		}else if(areaCode==32){
			System.out.println("Telephone Number Area is Puttalam");
		}else if(areaCode==33){
			System.out.println("Telephone Number Area is Gampaha");
		}else if(areaCode==34){
			System.out.println("Telephone Number Area is Kaluthara");
		}else if(areaCode==35){
			System.out.println("Telephone Number Area is Kegalle");
		}else if(areaCode==36){
			System.out.println("Telephone Number Area is Avissawella");
		}else if(areaCode==37){
			System.out.println("Telephone Number Area is Kurunagala");
		}else{
			System.out.println("Incorrect phone number..");
		}
			
	}
}

