import java.util.*;

public class Main {

	public static void pattern12(int n) {

		int a = 0;
		int b = 1;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(a + "\t");

				int c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern12(n);
		
	}
}

/*

Input:
5

Output:
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	

*/