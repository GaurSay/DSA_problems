package Arrays;

public class leadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[]{16, 17, 4, 3, 5, 2}; 
	        int n = arr.length; 
	        printLeaders(arr, n); 
	}
	public static void printLeaders(int arr[],int n)
	{

		int max_from_right =  arr[n-1]; 
		   
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " "); 
       
        for (int i = n-2; i >= 0; i--) 
        { 
            if (arr[i] > max_from_right ) 
            {            
            max_from_right = arr[i]; 
            System.out.print(max_from_right + " "); 
            } 
        }  
	}

}
