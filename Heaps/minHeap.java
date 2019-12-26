package Heaps;

public class minHeap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		sort(arr);

		System.out.println("Sorted array is");
		printArray(arr);
	}
	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapifyMin(arr,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			// swap first and the last node  
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			//create min heap on the subtree
			heapifyMin(arr,i,0);
			
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

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
