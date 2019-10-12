package Stack;

import java.util.Stack;

public class MinimumBracketReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{{{";
		System.out.println(countBracketReversals(str));
	}
	public static int countBracketReversals(String input)
	{
		if(input.length()==0)
		{
			return 0;
		}
		if(input.length()%2!=0)
		{
			return -1;
		}
		Stack<Character> st=new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(ch=='{')
			{
				st.push(ch);
			}
			else
			{
				if(!st.empty() && ch=='}')
				{
					if(st.peek()=='{')
					{
						st.pop();
					}
					else
					{
						st.push(ch);
					}
					
				}
			}
		}
		int red_length=st.size();
		int c=0;
		while(!st.empty())
		{
			if(st.peek()=='{')
			{
				c++;
			}
			st.pop();
		}
		return (red_length/2) + (c%2);
	}

}
