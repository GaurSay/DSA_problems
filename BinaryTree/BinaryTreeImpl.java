package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeImpl {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	BinaryTreeImpl bst=new BinaryTreeImpl();
		Scanner s=new Scanner(System.in);
		System.out.println("enter root data");
		int rootData=s.nextInt();
		Btree<Integer> root=new Btree<Integer>(rootData);
		input(root);
		display();	
		int choice, input;
		while(true) {
			System.out.println("enter the Choice mann ????");
			choice = s.nextInt();
			switch(choice) {
				case 1 : 
					input = s.nextInt();
					insertData(root,input);
					break;
				case 2 : 
					input = s.nextInt();
					root=deleteData(root,input);
					break;
				case 3 : 
					input = s.nextInt();
					System.out.println(searchNode(root,input));
					break;
				default :
					printTree(root);
					return;
			}

		}
	}

		private static boolean searchNode(Btree<Integer> root, int input) {
		// TODO Auto-generated method stub
			if(root==null)
			{
				return false;
			}
			if(root.data==input)
			{
				return true;
			}
			else if(root.data<input)
			{
				return searchNode(root.right,input);
			}
			else
			{
				return searchNode(root.left,input);
			}	
			
	}

		private static Btree<Integer> deleteData(Btree<Integer> root, int input) 
		{
		
			if(root==null)
			{
				return null;
			}
			if(root.data>input)
			{
				root.left=deleteData(root.left,input);
				return root;
			}
			else if(root.data<input)
			{
				root.right=deleteData(root.left,input);
				return root;
			}
			else {
				if(root.left==null && root.right==null)
				{
					return null;
				}
				else if(root.left==null)
				{
					return root.right;
				}
				else if(root.right==null)
				{
					return root.left;
				}
				else
				{
					Btree<Integer> minNode=root.right;
					while(minNode.left!=null)
					{
						minNode=minNode.left;
					}
					root.data=minNode.data;
					root.right=deleteData(root.right,minNode.data);
					return root;
				}
				
			}
				
		}
		private static Btree<Integer> insertData(Btree<Integer> root,int input) {
		// TODO Auto-generated method stub
			if(root==null)
			{
				Btree<Integer> temp=new Btree<Integer>(input);
				return temp;
			}
			if(input<root.data)
			{
				root.left=insertData(root.left,input);
			}
			else if(input>root.data)
			{
				root.right=insertData(root.right,input);
			}
			return root;
			
		
	}
		private static void printTree(Btree<Integer> root) {
			// TODO Auto-generated method stub
				  if(root==null)
				  {
				    return;
				  }
				  String tobeprinted=root.data +":";
				  if(root.left!=null)
				  {
				    tobeprinted+="L:"+root.left.data +",";
				  }
				  if(root.right!=null)
				  {
				    tobeprinted+="R:"+root.right.data;
				  }
				  System.out.println(tobeprinted);
				  printTree(root.left);
				  printTree(root.right);
				}			
		private static void display() {
			// TODO Auto-generated method stub
				System.out.println("Enter 1 for insert data");
				System.out.println("Enter 2 for delete data");
				System.out.println("Enter 3 for search data");
			
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
		}
	}
