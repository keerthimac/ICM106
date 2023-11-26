import java.util.*; 
class Example{
	public static  void main(String []args){
		short s=100;
		byte b;
		//b=s; //Illegal

		b=(byte)s; //assign last 8bits of s to b →Casting
		System.out.println(s+" "+b); //100 100

		s=127;
		b=(byte)s; //assign last 8bits of s to b
		System.out.println(s+" "+b); //127 127

		s=128;
		b=(byte)s; //assign last 8bits of s to b
		System.out.println(s+" "+b); //128 -128

		s=255;
		b=(byte)s; //assign last 8bits of s to b
		System.out.println(s+" "+b); //128 -1

		s=256;
		b=(byte)s; //assign last 8bits of s to b
		System.out.println(s+" "+b); //128 0
	}
}
00