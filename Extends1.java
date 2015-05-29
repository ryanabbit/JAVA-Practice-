package test;
import static java.lang.System.out;

class Father{
	public int money=800;
	public void undertaking(){
		System.out.println("fathers:");
		
	}
}

class Son extends Father{
	public int money;
	Son(int money){
		setMoney(money);
		
		
		
	}
	public void setMoney(int money){
		this.money=money;
		
	}
	public void undertaking(){
		System.out.println("Sons:");
		
	}
	public void go(){
		undertaking();
		System.out.println("value: "+money);
		System.out.println("---------------");
		super.undertaking();
		System.out.println("value"+super.money);
		
		
	}
	
	
}



public class Extends1 {
	public enum Week{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
	public static void main(String[] args){
		//new Son(5000).go();
		//Week week=Week.Sunday;
		//Week[] week2=Week.values();
		//for(int i=0;i<=week2.length;i++){
			//System.out.println(week2[i]);
		 for(Week w:Week.values()){
			 System.out.println(w);
		 }
		}
		
	}
	


