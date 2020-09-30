/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
    { 
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
                                       kadanealgorithm(a)); 
    } 
		//code
		static int kadanealgorithm(int arr[])
		{
		    int MSF = Integer.MIN_VALUE, MEH = 0; 
		    MEH = 0;
		    for(int i = 0; i< arr.length; i++)
		    {
		        MEH = MEH+ arr[i];
		        if(MSF < MEH)
		        MSF = MEH;
		        if(MEH < 0)
		        MEH = 0;
		    }
		    return MSF;
		}
	
}