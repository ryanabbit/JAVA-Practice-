package test;

import java.io.FileWriter;
import java.io.IOException;


public class Ex_FileWriter {
	
  public static void main(String[] args) throws Exception{
	  String data=" JAVA input & output";
	  System.out.println("將字串\""+data+"\"寫到檔案");
	  System.out.println("資料長度："+data.length()+"bytes.");
	  System.out.println();
	  FileWriter fw=null;
	  try{
		  fw=new FileWriter("Sample.txt");
		  fw.write(data);
		  
	  }
	  catch(IOException e){}
	  finally{
		  try {
			  fw.close();
		  }
		  catch(IOException e){}
	  }
	
	  
  }
}
