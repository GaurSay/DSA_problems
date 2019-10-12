package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10, 34, 5, 10, 3, 5, 10};
		// Creates an empty HashMap 
	        HashMap<Integer, Integer> hmap =  
	                     new HashMap<Integer, Integer>(); 
	  
	        // Traverse through the given array 
	        for (int i = 0; i < arr.length; i++) 
	        { 
	            Integer c = hmap.get(arr[i]); 
	  
	            // If this is first occurrence of element  
	            if (hmap.get(arr[i]) == null) 
	               hmap.put(arr[i], 1); 
	  
	            // If elements already exists in hash map 
	            else 
	              hmap.put(arr[i], ++c); 
	        } 
	  
	        // Print result 
	        for (Map.Entry<Integer, Integer> m:hmap.entrySet()) 
	          System.out.println("Frequency of " + m.getKey() +  
	                             " is " + m.getValue()); 
	
	        
	        System.out.println();
	        System.out.println();
      //----------------treemap-------------------------------- 
        TreeMap<Integer, Integer> tmap = 
                new TreeMap<Integer, Integer>(); 

   // Traverse through the given array 
   for (int i = 0; i < arr.length; i++) 
   { 
       Integer c = tmap.get(arr[i]); 

       // If this is first occurrence of element    
       if (tmap.get(arr[i]) == null) 
          tmap.put(arr[i], 1); 

       // If elements already exists in hash map 
       else
         tmap.put(arr[i], ++c); 
   } 

   // Print result 
   for (Map.Entry<Integer, Integer> m:tmap.entrySet()) 
     System.out.println("Frequency of " + m.getKey() +  
                        " is " + m.getValue()); 
		
	}
	
	 static public class student{
		String name;
		int age;
		student(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
	}

}
