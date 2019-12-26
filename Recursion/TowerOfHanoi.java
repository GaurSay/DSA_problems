package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		steps(n, 'a', 'b', 'c');

	}

	private static void steps(int n, char source, char aux, char dest) {
		// TODO Auto-generated method stub
		if (n <= 1) {
			System.out.println(source + " " + dest);
			return;
		}
		steps(n - 1, source, dest, aux);
		System.out.println(source + " " + dest);
		steps(n - 1, aux, source, dest);
	}

	public static void towerOfHanoi(int n, char s, char a, char d) {
		// Write your code here

		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, s, d, a);
		System.out.println(s + " " + d);
		towerOfHanoi(n - 1, a, s, d);

	}

}
