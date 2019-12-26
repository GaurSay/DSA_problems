package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int n=0;
		int ans=findpower(x,n);
		System.out.println(ans);
	}
	public static int findpower(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return x;
		}
		return x*findpower(x,n-1);
	}

}
