package Algo;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		selection_sort(arr);
		System.out.println("selection sort done");
		print(arr);
		int arr2[]={5,4,3,2,1};
		bubble_sort(arr2);
		System.out.println("bubble sort done");
		print(arr2);
		int arr3[]={5,4,3,2,1};
		insertion_sort(arr3);
		System.out.println("insertion sort done");
		print(arr3);
	}
	public static void selection_sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int min=arr[i];
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			arr[i]=arr[minIndex];
			arr[minIndex]=min;
		}
	}
	public static void bubble_sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void insertion_sort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
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
