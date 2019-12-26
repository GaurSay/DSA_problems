package Recursion;

public class fibonacci_no {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9;
		print(x);
		System.out.println();
		System.out.println(fib(x));
	}
	public static void print(int n)
	{
		System.out.print(0+" "+1+" ");
		int a=0;
		int b=1;
		for(int i=2;i<=n;i++)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
			
		}
	}
	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);	
	}
}
