package test;
import java.io.*;

public class Forest implements Serializable {
 //private Tree tree=new Tree();
 public static void main(String[] args){
	 Forest f=new Forest();
	 
	 try{
		 FileOutputStream fs=new FileOutputStream("try.ser");
		 ObjectOutputStream os=new ObjectOutputStream(fs);
	
		 
		 
		 os.writeObject(f);
		 os.close();
		 
		 
	 }catch(Exception ex){ex.printStackTrace();}
	 
 }
 

}
//class Tree implements Serializable{}