package test;

import java.util.*;

public class rotate {
	public static void main(String[ ]args){
		
		Scanner sc=new Scanner(System.in);
		
		String St=sc.nextLine();
		int n=Integer.valueOf(St);
	    
		String [][]arrayInput=new String[n][n];
		
		for(int i=0;i<n;i++){
			
		    String [] arrayb=sc.nextLine().split("\\s+");
			
			
			if(arrayInput[i].length!=arrayb.length)
				{
				System.out.print("ERROR ");
				 break;
		   }
			for(int j=0; j<arrayb.length;j++){
				
				 arrayInput[i][j]=arrayb[j];
				 
				 
			}
			 
		}
		
		
		
		
		
		rotateCW(arrayInput, n);
				
	
	}
	static String[][] rotateCW(String[][] mat,int rotate) {
	     int M = mat.length;
	     int N = mat[0].length;
	    String[][] ret = new String[N][M];

	    for (int i = 0; i < M; i++) {
	        for (int j = 0; j < N; j++) {
	        	if(i==0 && j<N-1){
	        		ret[i][j+1]=mat[i][j];
	        		}
	        	else if(j==N-1 && i<M-1){
	        		ret[i+1][j]=mat[i][j];
	        	}
	        	else if(i==M-1 && j>0){
	        		ret[i][j-1]=mat[i][j];
	        	}
	        	else if(i>0 && j==0){
	        		ret[i-1][j]=mat[i][j];
	        	}
	        	else { ret[i][j]=mat[i][j];}
	           
	         }
	    }
	     if(rotate==1){
	    	 for(int i=0;i<ret.length;i++){
	 			for(int k=0;k<ret[i].length;k++){
	 				System.out.print(ret[i][k]+" ");
	 				}
	 			System.out.println();
	 		}
	     }
		
	     else if(rotate>1)
	    	rotateCW(ret, rotate-1);
            
	       return ret;
	  
	}
}
