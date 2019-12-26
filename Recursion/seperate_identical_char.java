package Recursion;

import java.util.Scanner;

public class seperate_identical_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String ans=seperate(s,0);
		System.out.println(ans);
	}

	private static String seperate(String s, int i) {
		// TODO Auto-generated method stub
		if(i==s.length()-1)
		{
			return s;
		}
		if(s.charAt(i)==s.charAt(i+1))
		{
			String ans=s.substring(0,i+1)+"*"+s.substring(i+1,s.length());
			return seperate(ans,i+2);
		}
		return seperate(s, i+1);
	}

}
