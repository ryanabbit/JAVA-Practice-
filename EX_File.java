package test;
import java.io.*;

public class EX_File {
	public static void main(String[] args){
		String path="/Users/RYAN/Desktop";
		File f1=new File(path);
		String[] filelist=f1.list();

		for(int i=0;i<filelist.length;i++)
		{ 
			
			File f2=new File(path+"/"+filelist[i]);
			if(f2.isDirectory())
				System.out.println(filelist[i]+" : is a directory");
			
			else
				System.out.println(filelist[i]+" : is a file");
			
			
			
		}
			
		
		
		
		
		
		
	}

}
