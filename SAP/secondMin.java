package SAP;

public class secondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {89,24,75,11,23};
		//int arr2[]= {56,42,21,23,65,20};
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				secMin=min;
				min=arr[i];
			}
			else if(arr[i]<secMin && arr[i]!=min)
			{
				secMin=arr[i];
			}
			
		}
		System.out.println(secMin);
	}

}
