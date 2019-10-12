package Stack;

import java.util.Stack;

public class Stack_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {60,70,80,100,90,75,80,120};
		int arr[]= {1,1,1,1};
		arr=stackspan(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] stackspan(int[] price) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		int ans[]=new int[price.length];
		ans[0]=1;
		st.push(0);
		for(int i=1;i<price.length;i++)
		{
			while(!st.empty() && price[st.peek()]<price[i])
			{
				st.pop();
			}
			if(st.empty())
			{
				ans[i]=i+1;
			}
			else
			{
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		
		
		return ans;
	}

}
