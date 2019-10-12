package LinkedList;

import java.util.Scanner;

public class reverseLL {

	public static void main(String[] args) {
		//// TODO Auto-generated method stub
		LL<Integer> head=input();
		Scanner s=new Scanner(System.in);
		head=reverse_Iterative(head);
		printNfromLast(head,3);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

	}
	public static void printNfromLast(LL<Integer> node,int n)
	{
		LL<Integer> slow=node;
		LL<Integer> fast=node;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		LL<Integer> temp=slow;
		//System.out.println(temp.data);
		while(temp.next!=null)
		{
			temp=temp.next;
			node=node.next;
		}
		System.out.println(node.data);
		
	}
	
	public static LL<Integer> reverse_Iterative(LL<Integer> head)
	{
		LL<Integer> prev=head;
		LL<Integer> curr=head.next;
		while(curr!=null)
		{
			LL<Integer> temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
			
		}
		head.next=null;
		return prev;
	}
	
	public static LL<Integer> reverse(LL<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		LL<Integer> smallhead=reverse(head.next);
		LL<Integer> temp=smallhead;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return smallhead;
		
	}
	public static LL<Integer> reverse2(LL<Integer> head)
	{
		if(head.next==null)
		{
			return head;
		}
		LL<Integer> smallhead=reverse(head.next);
		head.next.next=head;
		head.next=null;
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

