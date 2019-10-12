package LinkedList;

import java.util.Scanner;

public class DeleteAlternativeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head=input();
		head=helper(head);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	private static LL<Integer> helper(LL<Integer> head) {
		// TODO Auto-generated method stub
		int d=1;
		LL<Integer> temp=head;
		LL<Integer> prev=head;
		while(temp!=null)
		{
			if(d%2==0)
			{
				LL<Integer> t=temp.next;
				prev.next=t;
				prev=t;
				temp=t;
			}
			else
			{
				prev=temp;
				temp=temp.next;
						
			}
			d++;
		}
		return head;
		
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
