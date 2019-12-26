package Recursion;

public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="shubham";
		System.out.println(find(s,0,s.length()-1));
		

	}

	private static boolean find(String s,int i,int e) {
		// TODO Auto-generated method stub
		if(i>=s.length()-1)
		{
			return true;
		}
		if(s.charAt(i)==s.charAt(e))
		{
			return find(s,i+1,e-1);
		}
		return false;
		
	}

}
