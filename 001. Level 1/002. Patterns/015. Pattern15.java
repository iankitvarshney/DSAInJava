import java.util.*;

public class Main {

	public static void pattern15(int n) {

		int spaces = n / 2;
		int stars = 1;
		int rowValue = 1;

		for(int i = 1; i <= n; i++) {

			int columnValue = rowValue;

			for(int j = 1; j <= spaces; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= stars; j++) {
				System.out.print(columnValue + "\t");

				if(j <= (stars / 2)) {
					columnValue++;
				}
				else {
					columnValue--;
				}
			}
			System.out.println();

			if(i <= (n / 2)) {
				spaces--;
				stars += 2;
				rowValue++;
			}
			else {
				spaces++;
				stars -= 2;
				rowValue--;
			}
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern15(n);

	}
}

/*

Input:
5

Output:
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	

*/