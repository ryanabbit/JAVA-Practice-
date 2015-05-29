package test;


import java.util.*;

import java.io.*;

 class Plant{
	private String name;
	public Plant(String name){this.name=name;}
	public String getName(){return name;}
	public Plant(){this("try");}
	
}
class Tree extends Plant{
	
	
	public void A(){}
	public void B(){}
	
	
}


	

public class test {
	
	private static int c=0;
	public static int get(){
		return c;
		
	}
   static public void main(String[] args){
	   String[] elements={"1","2","3"};
	   String first=(elements.length>0)? elements[0]:null;
	   //System.out.println(first);
	    
	   List<String> list=new LinkedList<String>();
	   list.add("12345");
	   list.add("2");
	   System.out.println(list.get(0).length());
	   
	   
	   
	   new Thread(new Runnable(){
		   public void run(){System.out.println("BAR");}
	   }).start();
	   
	   
	   new test().go();
	   
	   
	   
	   Properties p=System.getProperties();
	   Enumeration names=p.propertyNames();
	   while(names.hasMoreElements()){
		   String name=(String)names.nextElement();
		   //System.out.println(name+"="+System.getProperty(name));
		   
	   }
	   }
   public void go(){
	   Runnable r =new Runnable(){
		   public void run(){
			   System.out.println("foo");
		   }
	   };
	   Thread t= new Thread(r);
	   t.start();
	   t.start();
	   
   }
}

   




