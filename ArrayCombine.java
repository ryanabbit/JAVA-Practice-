package test;

import java.util.ArrayList;

public class ArrayCombine {
public static void main(String[] args){
	ArrayList<String> FinalList=new ArrayList<String>();
	String a[]={"a1","a2","a3","a4"};
	String b[]={"b1","b2","b3","b4"};
	String c[]={"c1","c2","c3","c4"};
	
	
	for(int i=0;i<a.length;i++)
		
	{	
		
		FinalList.add(a[i]);
		FinalList.add(b[i]);
		FinalList.add(c[i]);
	}
	
	
	
	
		System.out.print(FinalList);
		
	
	
	
	
}
}
