package test;
import java.io.Console;
import java.io.IOException;
import java.util.List;

//public class A{
	//private  int c=0;
	//public  int get(){return c;}
	//public A(){c++;}
	
	
	
	
//}

public class ConsoleTest {
  private  int id;
  public ConsoleTest(int id){this.id=id;}
  public void updateID(int newid){this.id=newid;}
  public void takelist(List<? extends String> list){

	  Object o=list;
	  
  }
  interface A{void x();void y();}
  class B implements A{public void x(){}
  public void y(){}}
  class C extends B{public void x(){}}
  public void  test1(List<? super String>list1){list1.add("eee");}
  
	public static void main(String[] ARGS){
		
	java.util.List<A>list=new java.util.ArrayList<A>();
	
	
	
		
		
		
		
		Console console=System.console();
		String x;
		
			
//		String name=console.readLine("Plz input name");
		//int x=5;
		boolean b1=true;
		boolean b2=false;
		Long x1=2000L;
		Long x2=1999L;
		Long x3=1000L;
		System.out.print(x1+1);
		System.out.print(x2+1);
		System.out.print(x1>x2);
		
		
		
		if ((x1>x2) && ((x3*2)==x1))
			System.out.print(b1^b1);
		
//		
//		if(x==4 ^ !b2)
//			System.out.print('1');
//		    System.out.print('2');
//		if(b2=true && b1)
//			System.out.print('3');
//	    String o="";
	
		
//		char[] password=console.readPassword("Plz input password");
//		System.out.println();
//		System.out.println("Name="+name);
//		System.out.println("Password="+ new String(password));
//		
		
	}

}
