package LinkedList;

import java.util.Scanner;

public class PalindromicLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head=input();
		LL<Integer> slow=head;
		LL<Integer> fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		
		System.out.println("midpoint is :" + slow.data);
		LL<Integer> newnode=slow.next;
		LL<Integer> temp=head;
		slow.next=null;
		newnode=reverse(newnode);
		while(newnode!=null)
		{
			if(newnode.data!=temp.data)
			{
				System.out.println("false");
			}
			newnode=newnode.next;
			temp=temp.next;
		}
		System.out.println("true");
		
		
	}
	public static LL<Integer> reverse(LL<Integer> head)
	{
		if(head.next==null)
		{
			return head;
		}
		LL<Integer> smallhead=reverse(head.next);
		head.next.next=head;
		smallhead.next=null;
		return smallhead;
		
	}
	
	
	public static LL<Integer> input()
	{
		Scanner s=new Scanner(System.in);
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
		s.close();
		return head;
	}
	


}
