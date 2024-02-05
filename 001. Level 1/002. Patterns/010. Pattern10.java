import java.util.*;

public class Main {

	public static void pattern10(int n) {

		int outerSpaces = n / 2;
		int innerSpaces = -1;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= outerSpaces; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");

			if(i > 1 && i < n) {
				for(int j = 1; j <= innerSpaces; j++) {
					System.out.print("\t");
				}
				System.out.print("*\t");
			}

			System.out.println();

			if(i <= (n / 2)) {
				outerSpaces--;
				innerSpaces += 2;
			}
			else {
				outerSpaces++;
				innerSpaces -= 2;
			}
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern10(n);

	}
}

/*

Input:
5

Output:
		*	
	*		*	
*				*	
	*		*	
		*	

*/