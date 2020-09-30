/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int findPlatform(int arr1[], int arr2[], int size)
    {
        int noOfPlatform = 1;
        for(int i = 0; i< size; i++)
        {
            for(int j = i+1; j< size; j++)
            {
                if(arr1[i] < arr1[j] && arr2[i] < arr2[j])
                {
                    break;
                }
                else noOfPlatform ++;
            }
        }
        return noOfPlatform;
    }
    
    
	public static void main(String args[]) throws Exception {
{ 
  //  int arr[] = { 900, 940, 950, 1100, 1500, 1800 }; 
    //int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 }; 
    
    int arr[] = { 900, 1100, 1235}; 
    int dep[] = { 1000, 1200, 1240}; 
    
    
    
    int n = arr.length; 
    System.out.println("Minimum Number of Platforms Required = "
    + findPlatform(arr, dep, n));  
  //  return 0; 
} 
	}
}