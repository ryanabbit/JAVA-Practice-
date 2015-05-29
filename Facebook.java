package test;
// This is a practice function in Hashmap. 
// Direct friends of a person are level 1 friends,
//Friends of friends are level 2 friends and so on
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//O(n) because the depth of recursion correlates with n linearly.

class Member {
String name;
String email;
List <Member> friends;
public Member( String name, String email ){
	 this.name=name;
	 this.email=email;
	 }
public void addFriends(Member Friend){
	if (this.friends==null)
		this.friends=new ArrayList<Member>();
	
	this.friends.add(Friend);
	return ;
}
}

public class Facebook {
	
static HashMap<Integer,List> map = new HashMap<Integer, List>();
static List<String> detectloop = new ArrayList();

public static void main(String[] args){
	 Member Ryan = new Member("Ryan", "Ryan@email.com");
     Member Joe = new Member("Joe", "Joe@email.com");
     Member Dylan = new Member("Dylan", "Dylan@email.com");
     Member Rose = new Member("Rose", "Rose@email.com");
     Member Grace = new Member("Grace", "Grace@email.com");
     Member Allen = new Member("Allen", "Allen@email.com");
     Member Josh = new Member("Josh", "Josh@email.com");
     Member Brian = new Member("Brain", "Brain@email.com");
     Member Kumo = new Member("Kumo", "Kumo@email.com");
     Member Chen = new Member("Chen", "Chen@email.com");
     Ryan.addFriends(Joe);
     Ryan.addFriends(Dylan);
     Ryan.addFriends(Rose);
       
     Joe.addFriends(Allen);
     Dylan.addFriends(Kumo);
     Allen.addFriends(Chen);
     Chen.addFriends(Brian);
     Brian.addFriends(Josh);
     
     // print Ryan's friends level. 
     PrintFriends(Ryan,0);
     System.out.println(map);
     
	
}

public  static void PrintFriends(Member m, int level)
{     
	  List<String> Friend = new ArrayList();
	  
	   //detectloop is used to see if there is a loop in the network. 
	  // For example, Ryan.addFriends(Rose); Rose.addFriends(Kumo),Kumo.addFriends(Ryan);
	   if(detectloop.contains(m.name))
	    	return;
		 
	 if (map.containsKey(level))
	   Friend=map.get(level);
       
     Friend.add(m.name);
     detectloop.addAll(Friend);
     
     map.put(level, Friend); 
    
    
	if (m.friends!=null)
     for(Member f: m.friends){
		 PrintFriends(f,level+1);
     }
	else return;
    
}
}

