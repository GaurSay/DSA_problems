package Stack;

import java.util.Stack;

public class paranthesis_balancer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
		
		String str="{a+b}[][]()";

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='{' || ch=='(' || ch=='[')
			{
				st.push(ch);
			}
			else if(ch=='}' || ch==')' || ch==']' )
			{
				if(st.size()==0)
				{
					System.out.println("false");
				}
				else if(ch=='}' && st.peek()=='{')
				{
					st.pop();
				}
				else if(ch==')' && st.peek()=='(')
				{
					st.pop();
				}
				else if(ch==']' && st.peek()=='[')
				{
					st.pop();
				}
				else
				{
					System.out.println("false");
				}
			}
		}
		if(st.size()==0)
		{
			System.out.println("string is balanced");
		}
		else
		{
			System.out.println("string is not balanced");
		}
		
		

	}

}
