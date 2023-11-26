import java.util.*; 
class Example{
	public static  void main(String []args){
		char ch='\t';//tab
		double d;
		d=ch; //wider conversion
		System.out.println(d); //

		System.out.println('A'+1.234); //Legal, wider conversion-->66.234

	}
}
