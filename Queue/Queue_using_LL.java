package Queue;

import java.util.Scanner;

public class Queue_using_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Queue<Integer> q = new Queue<Integer>();
		System.out.println("Press 1 for Enqueue");
		System.out.println("Press 2 for Dequeue");
		System.out.println("Press 3 for Front element");
		System.out.println("Press 4 for Size of Queue");
		System.out.println("Press 5 for IsEmpty or not ?");
		System.out.println("###############################");
		System.out.println("                                ");
		System.out.println("Enter your Choice");
		int choice = s.nextInt();
		int input;

		while (choice != -1) {
			if (choice == 1) {
				System.out.println("Enter the number u want to enqueue");
				input = s.nextInt();
				q.enqueue(input);
			} else if (choice == 2) {
				System.out.println(q.dequeue());
			} else if (choice == 3) {
				System.out.println(q.front());
				input = s.nextInt();
			} else if (choice == 4) {
				System.out.println(q.Size());
			} else if (choice == 5) {
				System.out.println(q.isEmpty());
			}
			choice = s.nextInt();

		}
		s.close();

	}
}

class Queue<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;

	public Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if (front == null && rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public T front() {
		if (isEmpty()) {
			System.out.println("Queue is Empty !!!");
			return null;
		}
		else
		{
			return front.data;
		}
		
	}

	public int Size() {
		return size;
	}

	public T dequeue() {
		if (Size() == 0) {
			System.out.println("Queue is Empty !!!!!");
			return null;
		}
		else
		{
			Node<T> temp=front;
			if(Size()==0)
			{
				front=null;
				rear=null;
			}
			size--;
			T data = front.data;
			front=front.next;
			temp.next=null;
			return data;
		}
		
	}

	public boolean isEmpty() {
		return Size() == 0;
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		this.next = null;
	}

}
