package Arrays;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4}, 
                		{ 5,6,7, 8},
                		{ 9, 10, 11, 12 },
                		{ 13, 14, 15, 16 } }; 
		spiralPrint(arr);

	}

	private static void spiralPrint(int[][] arr) {

		int i;
		int n=arr[0].length;
		int m=arr.length;
		int k=0;
		int l=0;
		
		while (k <m && l <n)
	    {
          // first row
	        for (i = l; i < n; ++i)
	        {
	        	System.out.print(arr[k][i]+" ");
	        }
	        k++;
	        //last coloumn
	        for (i = k; i < m; ++i)
	        {
	        	System.out.print(arr[i][n-1]+" ");
	        }
	        n--;

	        if ( k < m)
	        {
              //last row
	            for (i = n-1; i >= l; --i)
	            {
	            	System.out.print(arr[m-1][i]+" ");
	            }
	            m--;
	        }
	
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	            	System.out.print(arr[i][l]+" ");
	            }
	            l++;    
	        }        
	    }
	}
}
