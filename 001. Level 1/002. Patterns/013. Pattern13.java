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

Input:
5

Output:
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	

*/

/*

Formula used:

nCr+1 = (nCr * (n - r)) / (r + 1)


n = 6

1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	
1	5	10	10	5	1	


0C0
1C0	1C1
2C0	2C1	2C2
3C0	3C1	3C2	3C3
4C0	4C1	4C2	4C3	4C4
5C0	5C1	5C2	5C3	5C4	5C5

*/