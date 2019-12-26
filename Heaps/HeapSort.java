package Heaps;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {12, 11, 13, 5, 6, 7}; 
	        int n = arr.length; 
	  
	        HeapSort ob = new HeapSort(); 
	        ob.sort(arr); 
	  
	        System.out.println("Sorted array is"); 
	        printArray(arr); 
	}
	

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private void sort(int[] arr) {
		
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			//creates a heap
			heapifyMax(arr,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			
			// Move current root to end
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			
			//create max heap on the subtree
			heapifyMax(arr,i,0);
		}
		
	}

	private void heapifyMax(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
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
			int swap=arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			
			
			// Recursively heapify the affected sub-tree 
			heapifyMax(arr, n, largest); 
		}
	}
	static void heapifyMin(int arr[], int n, int i) 
    { 
        int smallest = i; // Initialize smallest as root 
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
  
        // If left child is smaller than root 
        if (l < n && arr[l] < arr[smallest]) 
            smallest = l; 
  
        // If right child is smaller than smallest so far 
        if (r < n && arr[r] < arr[smallest]) 
            smallest = r; 
  
        // If smallest is not root 
        if (smallest != i) { 
            int temp = arr[i]; 
            arr[i] = arr[smallest]; 
            arr[smallest] = temp; 
  
            // Recursively heapifyMin the affected sub-tree 
            heapifyMin(arr, n, smallest); 
        } 
    } 

}
