class Example{
public static void main(String asrg[]){
char a='a';
System.out.println(a=='\u0061');
System.out.println(\u0061=='\u0061');
System.out.println(\u0061==97);
\u0061='\u0041';
System.out.println('A'=='\u0041');
System.out.println(65=='\u0041');
System.out.println(65==a);
System.out.println('\u0041'==a);
}
}