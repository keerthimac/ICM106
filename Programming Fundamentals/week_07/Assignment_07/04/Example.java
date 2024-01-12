import java.util.*;
class Example {
	public static void main(String args[]) {
		//Institute Of Computer Engineering Technology
		//Enter Data using single Statement
		char[] word = {73,110,115,116,105,116,117,116,101,32,79,102,32,67,111,109,112,117,116,101,114,32,69,110,103,105,110,101,101,114,105,110,103,32,84,101,99,104,110,111,108,111,103,121};
		
		//Print array using foreach method
		for(char a : word){
			System.out.print(a==32?"\n":a);
		}
	}
}
