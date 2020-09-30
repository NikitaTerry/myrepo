import java.io.*;
import java.util.*;

class GFG {

public static void main(String[] args) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.parse.Int(br.readLine().trim());
while(t-- >0) {
String inputLine[] = br.readLine().trim().split(" ");
int n = Integer.parseInt(inputLine[0]);
int m = Integer.parseInt(inputLine[1]);
int arr1[] = new int[n];
int arr2[] = new int[m];
inputLine = br.readLine().trim().split(" ");
for(int i = 0; i< n; i++) {
arr1[i] = Integer.parseInt(inputLine[i]);
}
inputLine = br.readLine().trim().split(" ");
for(int i = 0; i< m;i++) {
arr2[i] = Integer.parseInt(inputLine[i]);
}
new Solution().merge(arr1, arr2, n,m);

StringBuffer str = new StringBuffer();
for(int i = 0; i<n;i++) {
str.append(arr1[i] + " ");
}
for(int i = 0;; i<m; i++) {
str.append(arr2[i] + " ");
}
System.out.println(str);

}
}
}

class Solution {
    
    static void merge(int arr1[], int arr2[],int m, int n) 
    { 
        // Iterate through all elements of ar2[] starting from 
        // the last element 
        for (int i=n-1; i>=0; i--) 
        { 
            /* Find the smallest element greater than ar2[i]. Move all 
               elements one position ahead till the smallest greater 
               element is not found */
            int j, last = arr1[m-1]; 
            for (j=m-2; j >= 0 && arr1[j] > arr2[i]; j--) 
                arr1[j+1] = arr1[j]; 
       
            // If there was a greater element 
            if (j != m-2 || last > arr2[i]) 
            { 
                arr1[j+1] = arr2[i]; 
                arr2[i] = last; 
            } 
        } 
    } 
      
   
} 
