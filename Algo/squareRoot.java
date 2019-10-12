package Algo;

public class squareRoot {
	public static void main(String[] args) {
		int x=500;
		squareRoot sq=new squareRoot();
		System.out.println(sq.find(x));
	}
	public int find(int x)
	{
		
		if (x == 0 || x == 1) 
            return x; 
		int s=1;
		int e=x;
		int ans=0;
		while(s<=e)
		{
			int mid=(s+e)/2;
			int res=mid*mid;
			if(res==x)
			{
				return mid;
			}
			else if(res<x)
			{
				s=mid+1;
				ans=mid;
			}
			else
			{
				e=mid-1;
			}
		}
		return ans;
		
	}
}
