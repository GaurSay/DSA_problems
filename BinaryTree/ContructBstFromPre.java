package BinaryTree;

public class ContructBstFromPre {

	 static int index=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pre[] = new int[]{10, 5, 1, 7, 40, 50}; 
        int size = pre.length; 
        Btree<Integer> root = constructTree(pre, size); 
        System.out.println("Inorder traversal of the constructed tree is "); 
        printInorder(root); 
       
	}
	
	
	

	private static Btree<Integer> constructTree(int[] pre, int size) {
		// TODO Auto-generated method stub
		return contruct(pre,pre[0],Integer.MIN_VALUE,Integer.MAX_VALUE,size);
	}


	private static Btree<Integer> contruct(int[] pre, int key, int minValue, int maxValue, int size) {
		// TODO Auto-generated method stub
		if(index>=size)
		{
			return null;
		}
		Btree<Integer> root=null;
		if(key>=minValue && key<maxValue)
		{
			root=new Btree<Integer>(key);
			index=index+1;
			if(index<size)
			{
				root.left=contruct(pre,pre[index],minValue,key,size);
				root.right=contruct(pre,pre[index],key,maxValue,size);
			}
		}
		
		return root;
	}




	static void printInorder(Btree<Integer> node) { 
        if (node == null) { 
            return; 
        } 
        printInorder(node.left); 
        System.out.print(node.data + " "); 
        printInorder(node.right); 
    } 

}
