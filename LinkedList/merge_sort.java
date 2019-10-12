package LinkedList;

import java.util.Scanner;

public class merge_sort {

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
	
	public static LL<Integer> helper(LL<Integer> head)
	{
		if(head.next==null)
		{
			return head;
		}
		LL<Integer> mid=findMid(head);
		head=helper(head);
		mid=helper(mid);
		return merge(head,mid);
	}
	public static LL<Integer> merge(LL<Integer> head1,LL<Integer> head2)
	{
		LL<Integer> h1=head1;
	    LL<Integer> h2=head2;
	    LL<Integer> t3=head1;
	    LL<Integer> h3=head1;
	     if(h1.data<h2.data)
	      {
	        h3=head1;
	        t3=h1;
	        h1=h1.next;
	      }
	      else
	       {
	        h3=head2;
	        t3=h2;
	        h2=h2.next;
	       }
	        while(t3.next!=null)
	        {
	          if(h1.data<=h2.data)
	          {
	            t3.next=h1;
	            t3=t3.next;
	            h1=h1.next;
	          }
	          else
	          {
	            t3.next=h2;
	            t3=t3.next;
	            h2=h2.next;
	            
	          }
	        }
	      if(h1==null)
	      {
	        t3.next=h2;
	      }
	      else
	      {
	        t3.next=h1;
	      }
	      
	      return h3;
	}

	
	public static LL<Integer> findMid(LL<Integer> head)
	{
		LL<Integer> slow=head;
		LL<Integer> fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		LL<Integer> temp=slow.next;
		slow.next=null;
		return temp;
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
