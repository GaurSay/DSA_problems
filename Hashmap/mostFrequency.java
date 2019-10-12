package Hashmap;

import java.util.HashMap;

public class mostFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,12,2,11,12,2,1,2,2,11,12,2,6};
		find(arr);


	}

	private static void find(int[] arr) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i:arr)
		{
			if(hm.containsKey(i))
			{
				hm.put(i,hm.get(i)+1);
			}
			else
			{
				hm.put(i,1);
			}
		}
		
		int max=0;
		int maxElement=arr[0];
		for(int i:arr)
		{
			int x=hm.get(i);
			if(x>max)
			{
				max=x;
				maxElement=i;					
			}
		}
		System.out.println(maxElement + "has occurred "+max+" times");
		
	}
	

}
