// Sliding Window Time o(n) Space o(n)
// Question By : geeksforgeeks 
// Implemtation By : darren.ng.2016

// Java program to demonstrate BufferedReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*;

public class Test  
{ 
    public static void main(String[] args) throws IOException  
    { 
        Scanner scan = new Scanner(System.in);
		int numOfTestCases = scan.nextInt();
		while(numOfTestCases>0)
		{
		    int sizeOfArray = scan.nextInt() , targetSum = scan.nextInt();
		    int[] arr = new int[sizeOfArray];
		    for(int i = 0; i<sizeOfArray;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    printSubArrayIndices(targetSum, arr);
		    numOfTestCases--;
		}   
    } 
    
    static void printSubArrayIndices (int targetSum , int[] arr){
            int startingPointer = 0;
            int runningCount = 0;
            
            for (int i = 0; i < arr.length ; i++){
                runningCount += arr[i];
                while ( runningCount > targetSum){
                    runningCount -= arr[startingPointer];
                    startingPointer += 1;
                } 
                if ( runningCount == targetSum ) {
                    System.out.println(startingPointer + 1 + " " + (i + 1));
                    return;
                }
                
            }
            System.out.println(-1);
    }
} 