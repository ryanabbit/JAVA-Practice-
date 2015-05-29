package test;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.io.*;

public class EX_test {
	public static void main(String[] args){
		String test="This is a test";
		String[] tokens=test.split("\\s");
		//System.out.print(tokens.length);
	
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,Locale.TAIWAN);
		//System.out.print(df);
		 try{
		//BufferedWriter out=null;
		BufferedWriter out=new BufferedWriter(new FileWriter("test.txt",true));
		out.write("rr");
		out.close();
		
		 }catch (IOException e){
			 e.printStackTrace();
		 }
		StringBuffer s=new StringBuffer("123456789");
		s.delete(0,3).replace(1, 3, "24").delete(4, 6);
		System.out.println(s);
		
		
	} 

}
