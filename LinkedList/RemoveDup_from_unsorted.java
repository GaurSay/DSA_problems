package LinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDup_from_unsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head=input();
		remove(head);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

	}
	
	private static void remove(LL<Integer> head) {
		// TODO Auto-generated method stub
		
		LL<Integer> curr=head;
		LL<Integer> prev=null;
		HashSet<Integer> hs=new HashSet<>();
		while(curr!=null)
		{
			int currValue=curr.data;
			if(hs.contains(currValue))
			{
				prev.next=curr.next;
			}
			else
			{
				hs.add(currValue);
				prev=curr;
			}
			curr=curr.next;
			
		}
		
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
