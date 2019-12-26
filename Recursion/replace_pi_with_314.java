package Recursion;

import java.util.Scanner;

public class replace_pi_with_314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String ans=replace(s,0);
		System.out.println(ans);
		
}

	private static String replace(String s, int i) {
		// TODO Auto-generated method stub
		if(i==s.length()-1)
		{
			return s;
		}
		if(s.charAt(i)=='p' && s.charAt(i+1)=='i')
		{
			String ans=s.substring(0,i)+"3.14"+s.substring(i+2,s.length());
			return replace(ans,i+3);
		}
		return replace(s,i+1);
		
	}

}
