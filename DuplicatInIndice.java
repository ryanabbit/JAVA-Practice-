package test;


import java.util.Scanner;
import java.util.HashSet;
public class DuplicatInIndice {
public static void main(String[] args){
	
	HashSet<String> map = new HashSet<String>();
	Scanner sc=new Scanner(System.in);
	String St=sc.nextLine();
    int n=Integer.valueOf(St);
	String tmp="NO";
	
	String [][]arrayInput=new String[n][n];

	for(int i=0;i<n;i++){
		String [] arraya=sc.nextLine().split("\\s+");
		arrayInput[i]=arraya;
		
	}
	String Indice=sc.nextLine();
    int Index=Integer.valueOf(Indice);
    
    for(int i=0;i<n;i++){
	for(int k=0;k<Index;k++){
		if(map.contains(arrayInput[i][k])){
			tmp="YES";
			break;
		}else map.add(arrayInput[i][k]);
		}}
	System.out.println(tmp);
	
} 
}

