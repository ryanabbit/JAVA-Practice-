package test;



import java.util.ArrayList;
public class IntersectionArray {
	public static void main(String[] args)
	{
	
	String a="abcdefg";
	String b="abapcef";
	System.out.println();
	
	char[] aArray=new char[a.length()];
	aArray=a.toCharArray();
	char[] bArray=new char[b.length()];
	bArray=b.toCharArray();
	
	ArrayList<Character> intersaction=new ArrayList<Character>();
	ArrayList<Character> AL=new ArrayList<Character>();
	for(int i=0 ; i<aArray.length;i++){
		AL.add(aArray[i]);
				}
	
	for(char c : bArray){
		if(AL.contains(c)){
			if(!intersaction.contains(c))
			intersaction.add(c);
		}
	}
	
	
   System.out.println(intersaction);
		
	}
	
	
	
}

