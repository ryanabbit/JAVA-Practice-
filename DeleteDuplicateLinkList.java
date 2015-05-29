package test;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
public class DeleteDuplicateLinkList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}
 
		System.out.println("My List : " + list);
		System.out.println("\nHere are the duplicate elements from list : " + findDuplicate(list));
		//list.removeAll(findDuplicate(list));
		
		System.out.println("\nHere are the list after deleting: " + RemoveAll(list));
		
	}

	//find out the duplicate values 
	public static Set<String> findDuplicate(List<String> Duplicates){
		Set<String> MainSet=new HashSet<String>();
		Set<String> TmpSet=new HashSet<String>();
		for(String a : Duplicates){
			if(!TmpSet.add(a)){
				MainSet.add(a);
				System.out.println(a);
			}
		}
		
		return MainSet;
		}
	//find out the duplicate values and return non-duplicate Linked list
   public static List<String> RemoveAll(List<String> list){
	   
	   Set<String> MainSet=new HashSet<String>();
		Set<String> TmpSet=new HashSet<String>();
		List<String> TmpList=new LinkedList<String>();
		
		for(String a : list){
			if(!TmpSet.add(a)){
				MainSet.add(a);
			}else TmpList.add(a);
		}
		
		for(String a : MainSet){
			if(TmpList.contains(a))
				TmpList.remove(a);
		}
			
		//TmpList return non-duplicate list
		
		return TmpList;
   }
}

