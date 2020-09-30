/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
   static void printLeaders(int arr[], int size)  
    { 
        for (int i = 0; i < size; i++)  
        { 
            int j; 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] < arr[j]) 
                    break; 
            } 
            if (j == size) // the loop didn't break 
                System.out.print(arr[i] + " "); 
        } 
    }
    
	public static void main (String[] args) throws Exception{
	    
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
int t = Integer.parseInt(br.readLine().trim());
while(t-- > 0) {
int n = Integer.parseInt(br.readLine());
String input[] = br.readLine().split(" ");

int arr[] = new int[n];
for(int i = 0; i< n;i++){
arr[i] = Integer.parseInt(input[i]);
}
 printLeaders(arr, arr.length);
		
	}
}
}