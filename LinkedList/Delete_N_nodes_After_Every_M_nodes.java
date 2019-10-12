package LinkedList;

import java.util.Scanner;

public class Delete_N_nodes_After_Every_M_nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> head=input();
		head=delete(head,2,3);
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static LL<Integer> delete(LL<Integer> node,int m,int n)
	{
		LL<Integer> temp1=node;
		while(temp1!=null)
		{
			int c1=1;
			int c2=1;
			while(c1<m && temp1.next!=null)
			{
				temp1=temp1.next;
				c1++;
			}
			if(temp1.next==null)
			{
				break;
			}
			LL<Integer> temp2=temp1.next;
			while(c2<n && temp2.next!=null)
			{
				temp2=temp2.next;
				c2++;
			}
			if(temp2.next==null)
			{
				temp1.next=null;
				break;
			}
			temp1.next=temp2.next;
			temp1=temp2.next;
		}
		return node;
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
