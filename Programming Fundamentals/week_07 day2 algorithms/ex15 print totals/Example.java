import java.util.*;
class Example{

	public static void main(String args[]){
		String[] id={"C001","C002","C001","C002","C001","C003","C004","C003"};
		int[] cost={10000,20000,40000,20000,50000,20000,10000,30000};
		String [] tempId = new String[0];
		
		int[] totalCost = new int[tempId.length];
		//
		//remove duplicates
		//
		
		for (int =0 ; i<tempId; i++){
			for(int j=0; j<id.length;j++){
				if(tempId[i].equals(id[j])){
					totalCost[i]+=cost[j];
				}
			}
		}
		
	}
}
/*
ID		TotalCode
=================
C001	100000
C002	40000
C003	50000
C004	10000
*/














