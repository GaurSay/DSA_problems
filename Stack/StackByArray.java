package Stack;

public class StackByArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
	}
	static class Stack{
		int arr[]=new int[50];
		private int top;
		Stack()
		{
			top=-1;
		}
		boolean isEmpty()
		{
			return top<0;
		}
		boolean push(int x)
		{
			if(top>arr.length)
			{
				System.out.println("Stack Overflow");
				return false;
			}
			else
			{
				arr[++top]=x;
				System.out.println(x + " has been added into Stack");
				return true;
			}
			
		}
		int pop()
		{
			if(isEmpty())
			{
				System.out.println("Stack UnderFlow");
				return 0;
			}
			else
			{
				int x=arr[top--];
				System.out.println(x + " has been removed into Stack");
				return x;
			}
		}
		int peek() 
	    { 
	        if (top < 0) { 
	            System.out.println("Stack Underflow"); 
	            return 0; 
	        } 
	        else { 
	            int x = arr[top]; 
	            return x; 
	        } 
	    } 
	}

}
