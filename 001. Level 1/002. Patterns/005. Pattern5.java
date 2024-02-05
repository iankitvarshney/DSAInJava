import java.util.*;

public class Main {

	public static void pattern5(int n) {

		int spaces = n / 2;
		int stars = 1;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= spaces; j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= stars; j++) {
				System.out.print("*\t");
			}
			System.out.println();

			if(i <= (n / 2)) {
				spaces--;
				stars += 2;
			}
			else {
				spaces++;
				stars -= 2;
			}
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern5(n);

	}
}

/*

Input:
7

Output:
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	
	*	*	*	*	*	
		*	*	*	
			*	

*/