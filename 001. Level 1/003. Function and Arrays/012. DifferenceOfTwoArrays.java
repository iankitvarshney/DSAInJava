import java.util.*;

public class Main {

	public static void differenceOfTwoArrays(int[] a1, int[] a2) {

		int[] a3 = new int[a2.length];

		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = a3.length - 1;
		int carry = 0;

		while(k >= 0) {
			int digit = 0;
			int a1Value = (i >= 0) ? a1[i] : 0;

			if(a2[j] + carry >= a1Value) {
				digit = a2[j] + carry - a1Value;
				carry = 0;
			}
			else {
				digit = a2[j] + carry + 10 - a1Value;
				carry = -1;
			}

			a3[k] = digit;

			i--;
			j--;
			k--;
		}

		int index = 0;

		while(index < a3.length) {
			if(a3[index] == 0) {
				index++;
			}
			else {
				break;
			}
		}

		while(index < a3.length) {
			System.out.println(a3[index]);
			index++;
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] a1 = new int[n1];

		for(int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}

		int n2 = scn.nextInt();
		int[] a2 = new int[n2];

		for(int i = 0; i < a2.length; i++) {
			a2[i] = scn.nextInt();
		}

		differenceOfTwoArrays(a1, a2);

	}
}

/*

Input:
3
9 9 9
4
1 0 0 0

Output:
1

Input:
1
1
4
1 0 0 0

Output:
9
9
9

Input:
1
1
3
9 9 9

Output:
9
9
8

Input:
5
2 3 4 6 9
6
1 1 1 1 1 1

Output
8
7
6
4
2

Input:
5
2 3 6 4 2
5
3 3 3 3 3

Output:
9
6
9
1

Input:
5
9 9 9 9 9
6
3 3 3 3 3 3

Output:
2
3
3
3
3
4

*/