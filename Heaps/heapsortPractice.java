package Heaps;

public class heapsortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {12, 11, 13, 5, 6, 7}; 
	        int n = arr.length; 
	  
	       sort(arr); 
	  
	        System.out.println("Sorted array is"); 
	        printArray(arr); 
	}
	
	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=n/2;i>=0;i--)
		{
			//create max heap
			heapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			//swap 1st and last
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			
			//create max heap on remaining array
			heapify(arr,i,0);
		}		
	}
	

	private static void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=(i*2)+1;
		int r=(i*2)+2;
		
		if(l<n && arr[l]>arr[largest])
		{
			largest=l;
		}
		if(r<n && arr[r]>arr[largest])
		{
			largest=r;
		}
		if(largest!=i)
		{
			int swap=arr[largest];
			arr[largest]=arr[i];
			arr[i]=swap;
			
			heapify(arr,n,largest);
		}
		
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
