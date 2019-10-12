package Algo;

import java.util.Arrays;

public class binarySearch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 3, 2, 1 };
		Arrays.sort(arr);
		System.out.println(search(arr, 5));
		System.out.println(recursiveSearch(arr, 0, arr.length - 1, 5));
	}

	public static int search(int arr[], int x) {
		int n = arr.length;
		int s = 0;
		int e = n - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return -1;
	}

	public static int recursiveSearch(int arr[], int s, int e, int x) {
		if (e >= s) 
		{		
			int mid = (s + e) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] < x) {
				recursiveSearch(arr,mid+1,e,x);
			} else {
				recursiveSearch(arr,s,mid-1,x);
			}
		}
		return -1;

	}

}
