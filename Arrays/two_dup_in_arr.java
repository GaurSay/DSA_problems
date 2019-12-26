package Arrays;

public class two_dup_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
        int arr_size = arr.length; 
        printRepeating(arr, arr_size); 
	}

	private static void printRepeating(int[] arr, int arr_size) {
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(temp[arr[i]]==1)
			{
				System.out.println(arr[i]);
			}
			else
			{
				temp[arr[i]]=1;
			}
		}
		
		
	}

}
