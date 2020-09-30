class Solution  
{
// The main function that prints the  
    // arrangement with the largest value. 
    // The function accepts a vector of strings     
    static String printLargest(String[] arr){ 
        
        Vector<String> vector = new Vector<String>(Arrays.asList(arr));
      
        Collections.sort(vector, new Comparator<String>(){ 
  
        // A comparison function which is used by  
        // sort() in printLargest() 
        @Override
        public int compare(String X, String Y) { 
          
        // first append Y at the end of X 
        String XY=X + Y; 
          
        // then append X at the end of Y 
        String YX=Y + X; 
          
        // Now see which of the two formed numbers  
        // is greater 
        return XY.compareTo(YX) > 0 ? -1:1; 
    } 
    }); 
          
    //Iterator it = vector.iterator(); 
  
    //while(it.hasNext()) 
      //  System.out.print(it.next()); 
      String[] array = vector.toArray(new String[vector.size()]);
      StringBuffer sb = new StringBuffer();
      for(int i = 0; i < array.length; i++) {
         sb.append(array[i]);
      }
      String str = sb.toString();
      
    return str;  
    } 
    
}