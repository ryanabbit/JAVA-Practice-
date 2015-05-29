package test;
import java.util.*;
import java.io.*;
import java.util.HashSet;

public class DuplicateArray {
	public static void main(String args[] ) throws Exception {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String[][] arrayInput=new String[n][n];
	    for(int i=0; i<n;i++){
	        String number=sc.next();
	        String [] arrayTmp=number.split(",");
	        for(int j=0;j<arrayTmp.length;j++){
	            arrayInput[i][j]=arrayTmp[j];
	        }
	    }
	    System.out.println("------");
	    int index=sc.nextInt()-1;
	    HashSet<String> Hset=new HashSet<String>();
	    for(int i=0;i<arrayInput[index].length;i++){
	        if(Hset.contains(arrayInput[index][i])){
	            System.out.print("Yes");
	            return;
	        }else 
	            Hset.add(arrayInput[index][i]);
	    }
	       System.out.print("No");
	}
}
