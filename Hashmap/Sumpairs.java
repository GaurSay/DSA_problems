package Hashmap;

import java.util.HashMap;

public class Sumpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 5, 7, -1, 5} ;
		int sum=6;
		helper(arr,sum);

	}

	private static void helper(int[] arr, int sum) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i:arr)
		{
			if(!hm.containsKey(i))
			{
				hm.put(i,0);
			}
			hm.put(i,hm.get(i)+1);
			
		}
		int count=0;
		System.out.println(hm);
		for(int i:arr)
		{
			int n=sum-i;
			if(hm.containsKey(n))
			{
				count=count+hm.get(n);
			}
			if(n==i)
			{
				count--;
			}
		
		}
		System.out.println(count/2);
		
	}

}
