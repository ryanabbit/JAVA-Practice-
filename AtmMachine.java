package test;
// this class is used to simulate ATM machine using different tread. 
// The most important concept is to implement Runnable class and override the constructor and synchronized the thread. 
public class AtmMachine {
 public static void main(String[] args)
 {
	 Account MyAccount=new Account(10000);
     System.out.println("the original balance: "+ MyAccount.checkaccount()+" dollars");
     WithDraw Action1=new WithDraw(MyAccount,5000);
     WithDraw Action2=new WithDraw(MyAccount,2000);
     WithDraw Action3=new WithDraw(MyAccount,4000);
     
     Thread Thread1=new Thread(Action1,"Thread1");
     Thread Thread2=new Thread(Action2,"Thread2");
     Thread Thread3=new Thread(Action3,"Thread3");
     
     Thread1.start();
     Thread2.start();
     Thread3.start();
     
     
     
	 
	 
	 
 }
}
  
class WithDraw implements Runnable{
	private Account account;
	private double withdrawMoney;
	public WithDraw(Account account, double withdrawMoney){
		this.account=account;
		this.withdrawMoney=withdrawMoney;
	}
	public void run(){
		account.withDraw(account, withdrawMoney);
	}
	
	
}
class Account{
	private double balance;
	public Account(double balance){this.balance=balance;}
	public synchronized void withDraw(Account account, double withDrawMoney){
		String tName=Thread.currentThread().getName();
		System.out.println(tName+ "Start to withdraw");
		double tmpBalance=balance;
		
		
		for(double delay=0;delay<9999999;delay++);
		
		
		tmpBalance=tmpBalance-withDrawMoney;
		
		if(tmpBalance<0){
			System.out.println("~~~~~~~");
			System.out.println("the account balance is not enough");
			System.out.println("~~~~~~~");
			
		}
		else{balance=tmpBalance;}
		
		System.out.println(" Print this receipt : \n withdraw Money:"+
		withDrawMoney+"dollars"+ "the Balance is :"+ account.checkaccount());
		System.out.println("~~~~~~~");
		System.out.println(tName+" Transaction completed");
		System.out.println("~~~~~~~");
	
		
		
	}
	public double checkaccount(){
		return balance;
		
	}
	
	
	
	
}