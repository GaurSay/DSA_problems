package SAP;

public class maxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 90, 10, 110}; 
        int size = arr.length; 
        System.out.println("MaximumDifference is " +  
                                maxDifference(arr, size)); 
        

	}
	
	public static int maxDifference(int arr[],int n)
	{
		int maxdiff=arr[1]-arr[0];
		int min=arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]-min>maxdiff)
			{
				maxdiff=arr[i]-min;
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		return maxdiff;
	}

}
