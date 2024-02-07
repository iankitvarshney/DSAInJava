import java.util.*;

public class Main {

	public static void sumOfTwoArrays(int[] a1, int[] a2) {

		int maxLength = Math.max(a1.length, a2.length);
		int[] a3 = new int[maxLength];

		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = a3.length - 1;
		int carry = 0;

		while(k >= 0) {
			int sum = carry;

			if(i >= 0) {
				sum += a1[i];
			}
			if(j >= 0) {
				sum += a2[j];
			}

			a3[k] = sum % 10;
			carry = sum / 10;

			i--;
			j--;
			k--;
		}

		if(carry > 0) {
			System.out.println(carry);
		}

		for(int val: a3) {
			System.out.println(val);
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];

		for(int i = 0; i < n1; i++) {
			a1[i] = scn.nextInt();
		}

		int n2 = scn.nextInt();
		int[] a2 = new int[n2];

		for(int i = 0; i < n2; i++) {
			a2[i] = scn.nextInt();
		}

		sumOfTwoArrays(a1, a2);

	}
}

/*

Input:
5
3 1 0 7 5
6
1 1 1 1 1 1

Output:
1
4
2
1
8
6

Input:
5
9 3 4 6 8
4
1 9 8 8

Output:
9
5
4
5
6

Input:
3
9 9 9
2
2 8

Output:
1
0
2
7

Input:
3
9 9 9
1
1

Output:
1
0
0
0

*/