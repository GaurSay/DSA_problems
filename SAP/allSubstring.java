package SAP;

import java.util.HashSet;
import java.util.Iterator;

public class allSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabaa";
		print(str);
		System.out.println(palindrome("naman"));
	}

	
	
	public static void print(String str) {
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String s=str.substring(i,j);
				if(palindrome(s))
				hs.add(s);
			}
		}
		Iterator<String> value = hs.iterator(); 
		while (value.hasNext()) { 
            System.out.println(value.next()); 
        }
		
	}

	public static boolean palindrome(String str) {
		int l = 0;
		int r = str.length() - 1;
		while (r > l) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

}
