package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestelement {
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Please input kth number");
    int n=sc.nextInt();
    System.out.print("Please input a set of number");
    String number=sc.next();
  
    String [] arrayTmp=number.split(",");
   
    ArrayList<Integer> list=new ArrayList<Integer>();
     for(String c: arrayTmp){
	  list.add(Integer.valueOf(c));
      }
    Collections.sort(list);
     
    System.out.print(list.get(list.size()-n));
   
    
	}
	
	
}
