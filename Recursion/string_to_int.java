package Recursion;

import java.util.Scanner;

public class string_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			sc.close();
			int x=convert(s,0);
			System.out.println(x);
			
	}

	private static int convert(String s,int i) {
		// TODO Auto-generated method stub
		if(i>s.length()-1)
		{
			return 0;
		}
		int a=s.charAt(i)-48;
		int n=(int)(a*Math.pow(10,s.length()-i-1));
		System.out.println(n);
		n=n+convert(s,i+1);
		return n;
	}

}
