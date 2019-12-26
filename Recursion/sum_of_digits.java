package Recursion;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12345;
		System.out.println(find(x));
	}

	private static int find(int x) {
		if(x<=1)
		{
			return x;
		}
		int sum=x%10;
		return sum+find(x/10);
		
	}

}
