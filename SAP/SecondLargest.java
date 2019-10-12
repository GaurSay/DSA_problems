package SAP;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr2[]= {89,24,75,11,23};
		int arr[]= {42,42,21,23,65,20};
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>secMax && arr[i]!=max)
			{
				secMax=arr[i];
			}
			
		}
		System.out.println(secMax);
	}

}
