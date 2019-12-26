package Recursion;

import java.util.Scanner;

public class Keypad_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String ans[] = keypad(n);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}

	}

	private static String[] keypad(int n) {
		if(n==0 || n==1)
		{
			String ans[]= {""};
			return ans;
		}
		int c=n%10;
		String smallAns[]=keypad(n/10);
		char ch[]=choose(c);
		String ans[]=new String[smallAns.length*ch.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				ans[k]=smallAns[i]+ch[j];
				k++;
			}
		}	
		return ans;

	}

	private static char[] choose(int n) {
		switch (n) {
		case 2:
			char b[] = { 'a', 'b', 'c' };
			return b;
		case 3:
			char c[] = { 'd', 'e', 'f' };
			return c;
		case 4:
			char d[] = { 'g', 'h', 'i' };
			return d;
		case 5:
			char e[] = { 'j', 'k', 'l' };
			return e;
		case 6:
			char f6[] = { 'm', 'n', 'o' };
			return f6;
		case 7:
			char f7[] = { 'p', 'q', 'r', 's' };
			return f7;
		case 8:
			char f8[] = { 't', 'u', 'v' };
			return f8;
		case 9:
			char f9[] = { 'w', 'x', 'y', 'z' };
			return f9;
		default:
			char g[] = { '&' };
			return g;
		}

	}

}
