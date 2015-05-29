package test;
import java.util.*;
import java.io.*;

public class EX_FORMATTER {
	public static void main(String[] args){
		Calendar now =java.util.Calendar.getInstance();
		System.out.println(now);
		try{
			Formatter f=new Formatter(new File("format.txt"));
			f.format("¶ê©P²v¡×%f",Math.PI);
			
			f.close();
		}
		catch(IOException e){}
		
		
	}

}
