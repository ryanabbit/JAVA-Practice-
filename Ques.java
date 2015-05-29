package test;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
public class Ques {
 public static void main(String[] args){
	 NavigableSet<MyInteger> set=new TreeSet<MyInteger>();
      Set<MyInteger> set2=new TreeSet<MyInteger>();
	 
	 set.add(new MyInteger(-10));
	 set.add(new MyInteger(10));
	 set.add(new MyInteger(20));
	 System.out.println(set);
	 
	 System.out.println(new MyInteger(10));
	 System.out.println("......");
	 System.out.println(set.lower(new MyInteger(10)));
	 System.out.println(set.higher(new MyInteger(10)));
 }
}


class MyInteger implements Comparable<MyInteger>{
	private int i;
	public MyInteger(int i){ this.i=i;}
	public int hashCode(){return new Integer(i).hashCode();}
	
	public boolean equals(Object object){
		if(object instanceof MyInteger){
			MyInteger second=(MyInteger)object;
			return i==second.i;
			
		}
		return false;
	}
	@Override
	
	public int compareTo(MyInteger o){
		if(i==o.i){return 0;}
		else if (i<o.i){return -1;}
		return 1;
		
	}
	public String toString(){ return String.valueOf(i);}
	
	
	
	
	
}