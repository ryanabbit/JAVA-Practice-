package test;
import java.util.HashSet;

public class FindSum {
	 public static void main(String args[]) {
	        int numbers[] = { 2, 5, 3, 7, 9, 8, 4, 6, 11,1, 10};
	        int sum = 11;

	        HashSet<Integer> opposingPair = new HashSet<Integer>();
	        for (int i = 0; i < numbers.length; i++) {
	           // int diff = sum - numbers[i];
	            if (opposingPair.contains(sum - numbers[i])) {
	                System.out.print(numbers[i]);
	                System.out.print(",");
	                System.out.println( sum - numbers[i]);
	                opposingPair.remove( sum - numbers[i]);
	              
	            } else {
	                opposingPair.add(new Integer(numbers[i]));
	            }
	        }
	    }
}
