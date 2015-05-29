package test;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class QuickSort {
	static Random random = new Random();
	public static void main(String[] args){
		int[] test={34,55,77,45,45,34,55};
		List<Integer> list = new ArrayList<Integer>();
        for (int n : test)
            list.add(n);
        list = Sort(list);
        System.out.println(list);
		
	}
	
	
public static List<Integer> Sort(List<Integer> list){
	    if(list.size()<2)
		    return list;	
	    List<Integer> less=new ArrayList<Integer>();
		List<Integer> greater=new ArrayList<Integer>();
		List<Integer> result=new ArrayList<Integer>();
		int pivot=list.get(list.size()/2);
		// use random pivot instead of middle pivot
		//int pivot=list.get(random.nextInt(list.size()-1))
		  System.out.println("the first"+pivot);
		  System.out.println( "list size is"+list.size());
		  System.out.println(list);
	    list.remove(list.size()/2);
		
		for(int a : list){
			if(a>pivot)
				greater.add(a);
			else
				less.add(a);
		}
		
		result.addAll(Sort(less));
		result.add(pivot);
		result.addAll(Sort(greater));
	
		return result;
	}
}
