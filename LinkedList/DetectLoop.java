package LinkedList;

public class DetectLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> list = new LL<>(50); 
        list.next = new LL<>(20); 
        list.next.next = new LL<>(15); 
        list.next.next.next = new LL<>(4); 
        list.next.next.next.next = new LL<>(10); 
  
        // Creating a loop for testing 
        list.next.next.next.next.next = list.next.next; 
        detectAndRemoveLoop(list); 

	}
	
	public static void detectAndRemoveLoop(LL<Integer> head)
	{
		LL<Integer> slow=head;
		LL<Integer> fast=head;
		while(slow!=null && fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast)
			{
				System.out.println("loop detected");
				removeLoop(head,slow);
			}
			
		}
		
	}
	public static void removeLoop(LL<Integer> head, LL<Integer> slow)
	{
		LL<Integer> ptr1=head;
		LL<Integer> ptr2=null;
		while(1==1)
		{
			ptr2=slow;
			while(ptr2.next!=slow && ptr2.next!=ptr1)
			{
				ptr2=ptr2.next;
			}
			if(ptr2.next==ptr1)
			{
				break;
			}
			ptr1=ptr1.next;
		}
		ptr2.next = null; 
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

}
