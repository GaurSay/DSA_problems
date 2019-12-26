package Recursion;

import java.util.Scanner;

public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String ans=remove(s);
		System.out.println(ans);

	}

	private static String remove(String s) {
		if(s.length()==1)
		{
			return s;
		}
		String smallAns=remove(s.substring(1));
		if(s.charAt(0)==smallAns.charAt(0))
		{
			return smallAns;
		}
		else
		{
			return s.charAt(0)+smallAns;
		}
		
		
	}

}
