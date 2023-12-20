import java.util.*;

class Test{
public static void main(String args[]){
	int x = 0;
	int y = 0;
	for(int i = 0; i<5; i++){
		if((++x > 2) || (++y > 2)){
		x++;
		}
	}
	System.out.println(x+" "+y);
	}
}
