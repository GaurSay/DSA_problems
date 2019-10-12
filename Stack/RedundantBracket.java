package Stack;

import java.util.Stack;

public class RedundantBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(a+b)";
		System.out.println(checkRedundantBrackets(str));
	}
	
	
	public static boolean checkRedundantBrackets(String s)
	{
		Stack<Character> stack=new Stack<>();
		boolean b=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=')')
			{
				stack.push(ch);
			}
			else
			{
				while(!stack.empty() && stack.peek()!='(')
				{
					stack.pop();
					b=true;
					if(stack.empty())
					{
						break;
					}
				}
				if(stack.empty())
				{
					continue;
				}
				if(b)
				{
					b=false;
					stack.pop();
					
				}
				else
				{
					return true;
				}
			}
			
		}
		return false;
	}

}
