import java.util.*;
class Example{
	public static void subjectPrinter(String[] group1){
		Random ranNum = new Random();
		int num = ranNum.nextInt(group1.length);
		System.out.println(group1[num]);
	}
	public static void main(String args[]){
		String[] group1 = {"Business & Accounting", "Geography", "Citizenship Education", "Entrepreneurship studies","2nd language Sinhala","2nd Language Tamil","Arabic","Hindi","French","Janapn"};
		String[] group2 = {"Art", "Tamil Literature", "English Literature", "Sinhala Literature","2nd language Sinhala","Music","Dancing"};
		String[] group3 = {"Information & technology", "Agriculture", "Home Economics", "Health Science","Art & Craft","Media"};
		subjectPrinter(group1);
		subjectPrinter(group2);
		subjectPrinter(group3);
	}
}
