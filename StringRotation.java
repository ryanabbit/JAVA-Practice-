package test;

public class StringRotation {
public static void main(String args[]){
	String x= "hello";
	String y= "holle";
	
	System.out.println(rotation(x,y));
}
public static boolean rotation(String First,String Second){
	if( First.length()!=Second.length())
	     return false;


	for(int i=0;i<Second.length();i++){
	 if((Second.substring(i)+Second.substring(0, i)).equals(First)){
		 return true;
	 }

	}
	
	return false;
	
	
}
}
