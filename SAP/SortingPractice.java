package SAP;

public class SortingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		selection_sort(arr);
		print(arr);
		
		int arr2[]= {5,4,3,2,1};
		bubble_sort(arr2);
		print(arr2);
		
		int arr3[]= {5,4,3,2,1};
		insertion_sort(arr3);
		print(arr3);
		
		int arr4[]= {5,4,3,2,1};
		merge_sort(arr4,0,arr4.length-1);
		print(arr4);
		
		int arr5[]= {5,4,3,2,1};
		quick_sort(arr5,0,arr5.length-1);
		print(arr5);
	}
	
	
	private static void quick_sort(int[] arr, int s, int e) {
		
		if(s>=e)
		{
			return ;
		}
		int pivotpos=partition(arr,s,e);
		quick_sort(arr,s,pivotpos-1);
		quick_sort(arr,pivotpos+1,e);
	}
	private static int partition(int arr[],int s,int e)
	{
		int pivot=arr[s];
		int c=0;
		for(int i=s+1;i<=e;i++)
		{
			if(arr[i]<=pivot)
			{
				c++;
			}
		}
		int pivotpos=s+c;
		arr[s]=arr[pivotpos];
		arr[pivotpos]=pivot;
		int i=s;
		int j=e;
		while(i<pivotpos)
		{
			if(arr[i]>pivot)
			{	
				while(j>pivot)
				{
					if(arr[j]<=pivot)
					{
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						j--;
						break;
					}
					j--;
				}			
			}
			i++;
		}
		return pivotpos;
	}

	private static void merge_sort(int[] arr,int s,int e) {
		// TODO Auto-generated method stub
		if(s>=e)
		{
			return ;
		}
		int mid=(s+e)/2;
		merge_sort(arr,s,mid);
		merge_sort(arr,mid+1,e);
		merge(arr,s,e);
		
		
	}
	private static void merge(int arr[],int s,int e)

	{
		int mid=(s+e)/2;
		int i=s;
		int j=mid+1;
		int temp[]=new int[e-s+1];
		int k=0;
		while(i<=mid && j<=e)
		{
			if(arr[i]<=arr[j])
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
	
    private static void insertion_sort(int[] arr) 
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
	private static void bubble_sort(int[] arr) {
		
		
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
	private static void selection_sort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=arr[i];
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<min)
				{
					minIndex=j;
				}
			}
			arr[i]=arr[minIndex];
			arr[minIndex]=min;
		}
		
	}
	
	private static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
