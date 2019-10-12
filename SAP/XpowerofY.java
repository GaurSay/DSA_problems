package SAP;

public class XpowerofY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPower(2,8));

	}
	public static boolean isPower(int a,int b)
	{
		if(a==1)
			return (b==1);
		
		int pow=1;
		while(pow<b)
		{
			pow=pow*a;
		}
		return (pow==b);
	}
	

}
