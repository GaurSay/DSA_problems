package Recursion;

import java.util.Scanner;

public class replace_character_recursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c1=sc.next().charAt(0);
		char c2=sc.next().charAt(0);
		sc.close();
		//String ans=replace(s,c1,c2,0);
		String ans=replace2(s,c1,c2);
		System.out.println(ans);
	}
	

	private static String replace(String s, char c1,char c2,int i) {
		// TODO Auto-generated method stub
		if(i==s.length()-1)
		{
			return s;
		}
		if(s.charAt(i)==c1)
		{
			String ans=s.substring(0,i)+c2+s.substring(i+1,s.length());
			return replace(ans,c1,c2,i+1);
		}
		return replace(s,c1,c2,i+1);
	}
	private static String replace2(String s, char c1,char c2) {
		// TODO Auto-generated method stub
		if(s.length()==0)
		{
			return s;
		}
		String ans="";
		if(s.charAt(0)==c1)
		{
			ans+=c2;
		}
		else
		{
			ans+=s.charAt(0);
		}
		return ans+replace2(s.substring(1),c1,c2);
	}

}
