package Algo;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		sort(arr,0,arr.length-1);
		System.out.println("merge sort done");
		print(arr);

	}
	
	public static void sort(int arr[],int s,int e)
	{
		if(s>=e)
		{
			return;
		}
		
		int mid=(s+e)/2;
		sort(arr,s,mid);
		sort(arr,mid+1,e);
		merge(arr,s,e);
	}
	public static void merge(int arr[],int s,int e)
	{
		int mid=(s+e)/2;
		int temp[]=new int[e-s+1];
		int i=s;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=e)
		{
			if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				k++;
				i++;
			}
			else
			{
				temp[k]=arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid)
		{
			temp[k]=arr[i];
			k++;
			i++;
		}
		while(j<=e)
		{
			temp[k]=arr[j];
			k++;
			j++;
		}
		for(i=0;i<temp.length;i++)
		{
			arr[s+i]=temp[i];
		}		
	}
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
