package LinkedList;

import java.util.Scanner;

public class kReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head=input();
		head=kTimesReverse(head,3);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

	}

	
	public static LL<Integer> kTimesReverse(LL<Integer> head, int k) {
		   if(head==null || head.next==null)
		   {
		     return head;
		   }
		   LL<Integer> h1=head;
		   LL<Integer> t1=head;
		   int c=1;
		   while(c<=k && t1.next!=null)
		   {
			   t1=t1.next;
			   c++;
		   }
		   LL<Integer> head2=t1.next;
		   t1.next=null;
		   head2=kTimesReverse(head2,k);
		   h1=reverse(h1);
		   head.next=head2;
		   return h1;
	   
	}
	public static LL<Integer> reverse(LL<Integer> head){
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
