// Sliding Window Time o(n^2) Space o(n)
// Question By : geeksforgeeks 
// Implemtation By : darren.ng.2016

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
		    int sizeOfArray = scan.nextInt();
		    int[] arr = new int[sizeOfArray];
		    for(int i = 0; i<sizeOfArray;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    printNumOfTriplets(arr);
		    numOfTestCases--;
		}   
    } 
    
    static void printNumOfTriplets (int[] arr){
            int numOfTriplets = 0;
            
            Arrays.sort(arr);
            for(int i = 2 ; i < arr.length ; i++){
                
                for (int j = 0 ; j < i ; j++){
                    for ( int k = j+1 ; k < i ; k++){
                        if (arr[j]+arr[k]==arr[i]){
                            numOfTriplets ++; 
                        }
                    }
                }
            }
            
            if(numOfTriplets!=0){
                System.out.println(numOfTriplets);
            } else {
                System.out.println(-1);
            }
          
    }
} 