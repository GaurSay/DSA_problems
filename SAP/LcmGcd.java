package SAP;

public class LcmGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=20;
		
		System.out.println("lcm is "+lcm(a,b));

	}
	public static int gcd(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		return gcd(b%a,a);
	}
	public static int lcm(int a,int b)
	{
		int gcd=gcd(a,b);
		System.out.println("GCD of "+a+" and "+ b +" is: " +gcd);
		return (a*b)/gcd;
	}
	

}
