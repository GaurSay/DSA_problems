package Arrays;

public class findDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,4,2,5,4,7,1,3,6};
		find(arr);
		

	}

	private static void find(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int n=arr.length;
		int actualSum=((n-2)*(n-1))/2;
		int x=sum-actualSum;
		System.out.println(x);
		
	}

}
