package Recursion;

public class count_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=102040;
		System.out.println(countzeros(n));
	}
	public static int countzeros(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		int count=0;
		if(n%10==0)
		{
			count++;
		}
		return count+countzeros(n/10);
	}

}
