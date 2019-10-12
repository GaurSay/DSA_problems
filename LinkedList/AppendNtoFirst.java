package LinkedList;

import java.util.Scanner;

public class AppendNtoFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		LL<Integer> head=input(s);	
		System.out.println("enter the number to append");
		int x=s.nextInt();
		head=append(head,x);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

	}
	public static LL<Integer> append(LL<Integer> head,int n)
	{
		LL<Integer> temp=head;
		int length=1;
		while(temp.next!=null)
		{
			length++;
			temp=temp.next;
		}
		temp.next=head;
		
		LL<Integer> add=null;
		temp=head;
		length=length-n;
		//System.out.println(length);
		while(length!=0)
		{
			add=temp;
			temp=temp.next;
			length--;
		}
		add.next=null;
		return temp;
	}
	public static LL<Integer> input(Scanner s)
	{
		System.out.println("enter the elements");
		int x=s.nextInt();
		LL<Integer> head=null;
		while(x!=-1)
		{
			LL<Integer> newnode=new LL<>(x);
			if(head==null)
			{
				head=newnode;
			}
			else
			{
				LL<Integer> temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
					
				}
				temp.next=newnode;
			}			
			x=s.nextInt();			
		}
		return head;
	}

}

class LL<T>
{
	T data;
	LL<T> next;
	public LL(T data)
	{
		this.data=data;
		this.next=null;
	}
}

