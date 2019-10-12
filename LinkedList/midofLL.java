package LinkedList;

import java.util.Scanner;

public class midofLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head=input();
		head=mid(head);
			System.out.print(head.data+" ");
		
	}
	
	private static LL<Integer> mid(LL<Integer> head) {
		LL<Integer> slow=head;
		LL<Integer> fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
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
