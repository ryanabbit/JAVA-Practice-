package test;
import static java.lang.System.*;

class MemberIDException extends Exception{
	public MemberIDException(String mID){
	super("會員證號"+mID+"驗證失敗！");
	}
	public void contactWith(){
      out.println("plz contact the staff: TEL:xxx-xxx");
      
	}
	
}


 
public class ErrorHandling {
	public static void main(String[] arg){
		
		boolean verify=true;
		try{
			checkMemberID("123456789");
		}
		catch(MemberIDException e){
			out.println("Error msg:"+ e.getMessage());
			e.contactWith();
			verify=false;
			
		}
		if(verify)
			out.println("successed!");
		else
			out.println("Failed");
		
	}
	public static void checkMemberID(String mID)
	throws MemberIDException{
		if(mID.length()!=5){ throw new MemberIDException(mID);}
	}

}


