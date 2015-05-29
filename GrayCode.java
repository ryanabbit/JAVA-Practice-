package test;

public class GrayCode {
public static void main(String args[]){
	String code1="1001000";
	String code2="1001001";
	//System.out.print(Math.pow(4,3 ));
	System.out.println(Gray(code1,code2));
	//System.out.print((code2.charAt(5)=='1'));
	
	
}
public static boolean Gray(String First,String Second){
	int count1=0;
	int count2=0;
	int k=0;
	for(int i=First.length()-1;i>=0;i--){
		if (First.charAt(k)=='1')
	     count1+=Math.pow(2,i);
	    if (Second.charAt(k)=='1')
	     count2+=Math.pow(2,i);
		k++;
		}
	if (count2-count1==1)
		{System.out.println(count1+","+count2);
		return true;}
	
	return false;
}
}
