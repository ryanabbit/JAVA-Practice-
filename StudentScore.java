package test;
import java.util.*;
import java.util.ArrayList;
//O(n)
public class StudentScore {
 public class TestResult{
	 int studentid;
	 Date testDate;
	 int testScore;
	 public TestResult( int studentid, int testScore ){
		 this.studentid=studentid;
		 this.testDate=testDate;
		 this.testScore=testScore;
	 }
	 
 }
 public   Map<Integer, Double> getFinalScores(List<TestResult> resultList){ 
	 HashMap<Integer,PriorityQueue> map = new HashMap<Integer, PriorityQueue>();
	 PriorityQueue<Integer> score = new PriorityQueue<Integer>();
	 for (TestResult result: resultList)
	 {     score=null;
		  if (map.containsKey(result.studentid)){
			  score=map.get(result.studentid);
		  }
		  score.offer(result.testScore);
		  map.put(result.studentid, score);
		  }
	 
	 Map<Integer, Double> Avg = new HashMap<Integer, Double>();
	 PriorityQueue<Integer> Avgscore = new PriorityQueue<Integer>();
		 for(int mapkey : map.keySet()){
			 Avgscore= map.get(mapkey);
		     int tmp=0;
		     for(int i=0;i<5;i++){
		    	 tmp+=Avgscore.poll(); 
		     }
		     Avg.put(mapkey, (double) (tmp/5));
		 }

	 
	 
	 return Avg; 
	 
	 }
 public static void main(String[] args){
	 
	 
	 
	 }
	 
	 
	
	

 }

 

