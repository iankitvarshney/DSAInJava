import java.util.*;

public class Main {

	public static void pattern11(int n) {

		int value = 1;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(value + "\t");
				value++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern11(n);

	}
}

/*

Input:
5

Output:
1	
2	3	
4	5	6	
7	8	9	10	
11	12	13	14	15	

*/