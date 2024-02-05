import java.util.*;

public class Main {

	public static void pattern16(int n) {

		int stars = 1;
		int spaces = (2 * n) - 3; // 2 * (n - 2) + 1

		for(int i = 1; i <= n; i++) {

			int value = 1;

			for(int j = 1; j <= stars; j++) {
				System.out.print(value + "\t");
				value++;
			}

			for(int j = 1; j <= spaces; j++) {
				System.out.print("\t");
			}

			if(i == n) {
				stars--;
				value--;
			}

			for(int j = 1; j <= stars; j++) {
				value--;
				System.out.print(value + "\t");
			}

			System.out.println();

			stars++;
			spaces -= 2;
		}
		
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern16(n);

	}
}

/*

Input:
5

Output:
1								1	
1	2						2	1	
1	2	3				3	2	1	
1	2	3	4		4	3	2	1	
1	2	3	4	5	4	3	2	1	

*/