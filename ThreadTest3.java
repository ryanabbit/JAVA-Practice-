package test;

public class ThreadTest3 {
  public static void main(String[] arg){
	  HelloThread t1=new HelloThread();
	  HelloThread t2=new HelloThread();
	  t1.setName("T1");
	  t2.setName("T2");
	  t1.start();
	 
	  t2.start();
	  t1.setPriority(1);
	  
  }
}


class HelloThread extends Thread{
	public void run(){
		for (int i=1;i<=1000;i++){
				
			
			String tName=Thread.currentThread().getName();
			
			System.out.println(tName+" : "+ i);
			
		}			
		
	}
}
	

