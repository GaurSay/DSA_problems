package SAP;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={0, 1, 2, 0, 1, 2};
		sortpractice(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void sortFor(int arr[])
	{
		int z=0;
		int to=arr.length-1;
		for(int i=0;i<=to;i++)
		{
			if(arr[i]==0)
			{
				int temp=arr[z];
				arr[z]=arr[i];
				arr[i]=temp;
				z++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[to];
				arr[to]=arr[i];
				arr[i]=temp;
				to--;
				i--;
			}
		}
	}
	public static void sortpractice(int arr[])
	{
		int nz=0;
		int nt=arr.length-1;
		for(int i=0;i<=nt;i++)
		{
			if(arr[i]==0)
			{
				int temp=arr[nz];
				arr[nz]=0;
				arr[i]=temp;
				nz++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[nt];
				arr[nt]=2;
				arr[i]=temp;
				i--;
				nt--;
			}
		}
	}
	public static void sort(int a[])
	{
		
		int lo = 0; 
        int hi = a.length - 1; 
        int mid = 0,temp=0; 
        while (mid <= hi) 
        { 
            switch (a[mid]) 
            { 
            case 0: 
            { 
                temp   =  a[lo]; 
                a[lo]  = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: 
            { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        } 
	}

}
