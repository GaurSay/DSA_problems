package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TreeImpl {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter root data :");
		int rootData=s.nextInt();
		Btree<Integer> root=new Btree<Integer>(rootData);
		input(root);
		root=removeLeafNodes(root);
		printLevelWise(root);
	}
	
	public static Btree<Integer> removeLeafNodes(Btree<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		else if(root.left==null && root.right==null)
		{
			return null;
		}
		else if(root.left==null)
		{
			Btree<Integer> temp=removeLeafNodes(root.right);
			root.right=temp;
			return root;
		}
		else if(root.right==null)
		{
			Btree<Integer> temp=removeLeafNodes(root.left);
			root.left=temp;
			return root;
		}
		Btree<Integer> ltemp=removeLeafNodes(root.left);
		Btree<Integer> rtemp=removeLeafNodes(root.right);
		root.left=ltemp;
		root.right=rtemp;
		return root;
		
		
		
	}
	public static void printZigZag(Btree<Integer> root)
	{
		Queue<Btree<Integer>> q=new LinkedList<>();
		Stack<Btree<Integer>> st=new Stack<>();
		int level=1;
		q.add(root);
		while(!q.isEmpty())
		{
			Btree<Integer> temp;
				temp=q.poll();
				System.out.print(temp.data+" ");
				if(level%2==0)
				{
					if(temp.right!=null)
					{
						st.push(temp.right);
					}
					if(temp.left!=null)
					{
						st.push(temp.left);
					}
				}
				else
				{
					if(temp.left!=null)
					{
						st.push(temp.left);
					}
					if(temp.right!=null)
					{
						st.push(temp.right);
					}
				}
				if(q.isEmpty())
				{
					while(!st.isEmpty())
					{
						q.add(st.pop());
					}
					System.out.println();
					level++;
				}
										
				}
	}
	public static void printLevelWise(Btree<Integer> root)
	{
		
		Queue<Btree<Integer>> q=new LinkedList<>();
		Queue<Btree<Integer>> sec=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Btree<Integer> temp;
				temp=q.poll();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
				{
					sec.add(temp.left);
				}
				if(temp.right!=null)
				{
					sec.add(temp.right);
				}
				if(q.isEmpty())
				{
					Queue<Btree<Integer>> t=sec;
					sec=q;
					q=t;
					System.out.println();					
				}
					
		}
	}
	public static void input(Btree<Integer> root)
	{
		
		Scanner s=new Scanner(System.in);
		Queue<Btree<Integer>> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{			
			Btree<Integer> temp=q.poll();
			System.out.println("Enter the left of " + temp.data);
			int left=s.nextInt();
			System.out.println("Enter the right of " + temp.data);
			int right=s.nextInt();
			if(left!=-1)
			{
				Btree<Integer> lnode=new Btree<>(left);
				temp.left=lnode;
				q.add(lnode);
			}
			if(right!=-1)
			{
				Btree<Integer> rnode=new Btree<>(right);
				temp.right=rnode;
				q.add(rnode);
			}
						
		}
		s.close();
	}
	

}
