import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{

     public static void main(String []args){
        System.out.println(addThousandthSeparator(18666));
     }
     
     public static String addThousandthSeparator (int num){
         String toReturn = "";
         char[] arr = (""+num).toCharArray();
         int counter = 0;
         for (int i = arr.length -1 ; i>=0 ; i--){
             if (counter % 3 == 0 && i != arr.length-1){
                 toReturn = "," + toReturn;
             }
             toReturn = arr[i]+toReturn;
             counter++;
         }
         return toReturn;
     }
     
}