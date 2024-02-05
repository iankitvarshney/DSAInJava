import java.util.*;

public class Main {

	public static void pattern13(int n) {

		for(int i = 0; i < n; i++) {
			int value = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(value + "\t");
				value = (value * (i - j)) / (j + 1);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern13(n);
		
	}
}

/*

Formula used:

nCr+1 = (nCr * (n - r)) / (r + 1)

*/

/*

Input:
5

Output:
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	

*/